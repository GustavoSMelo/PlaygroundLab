<?php

namespace App\Http\Controllers;

use Exception;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class salesController extends Controller
{
    public function index () {
        $sales = DB::table('sales')
            ->join('users', 'sales.id_user', '=', 'users.id')
            ->join('products', 'sales.id_product', '=', 'products.id')
            ->select()
            ->get();

        return $sales;
    }

    public function store (Request $request) {

        try {

            $request->validate([
                'id_user' => ['bail', 'required', 'numeric'],
                'id_product' => ['bail', 'required', 'numeric']
            ]);

            if(DB::table('users')->where('id', '=', $request->input('id_user'))->exists()){
                if(DB::table('products')->where('id', '=', $request->input('id_product'))->exists()) {
                    DB::table('sales')->insert([
                        'id_user' => $request->input('id_user'),
                        'id_product' => $request->input('id_product')
                    ]);

                    DB::table('products')->where('id', '=', $request->input('id_product'))->decrement('stock', 1);

                    return response()->json([
                        'message' => 'Thanks to buy in our marketplace, please, return again as soon possible, we are waiting for you'
                    ]);
                }
            }

            return response()->json([
                'ERROR' => 'The product or user informed does not exists, please, insert a valid product or user'
            ], 400);

        } catch (Exception $err) {
            return response()->json([
                'ERROR' => 'The fiels are wrongs, check all of them and try again '
            ], 400);
        }

    }
}
