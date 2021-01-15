<?php

namespace App\Http\Controllers;

use App\Models\salesModel;
use Exception;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class salesController extends Controller
{
    public function index () {
        $sales = DB::table('sales')
            ->join('user', 'sales.id_user', '=', 'user.id')
            ->join('product', 'sales.id_product', '=', 'product.id')
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

            if(DB::table('user')->where('id', '=', $request->input('id_user'))->exists()){
                if(DB::table('product')->where('id', '=', $request->input('id_product'))->exists()) {
                    DB::table('sales')->insert([
                        'id_user' => $request->input('id_user'),
                        'id_product' => $request->input('id_product'),
                        'payment_method' => $request->input('payment_method')
                    ]);

                    //DB::table('product')->where('id', '=', $request->input('id_product'))->decrement('stock', 1);

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

    public function showWithProduct (int $id) {
        return salesModel::find($id)->product;// <- this isn't a method
    }

    public function showWithUser (int $id) {
        return salesModel::find($id)->user;// "->user" isn't a method
    }
}
