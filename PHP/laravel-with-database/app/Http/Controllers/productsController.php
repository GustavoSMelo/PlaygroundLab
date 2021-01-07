<?php

namespace App\Http\Controllers;

use Exception;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class productsController extends Controller
{
    public function index () {
        $products = DB::table('products')->get();

        return $products;
    }

    public function store (Request $request) {
        try {

            /*$request->validate([
                'name' => 'bail|required|alpha_num|max:255',
                'price' => 'bail|required|numeric|min:1',
                'stock' => 'bail|required|numeric'
            ]);*/

            DB::table('products')->insert([
                'name' => $request->input('name'),
                'price' => $request->input('price'),
                'stock' => $request->input('stock')
            ]);

            return response()->json([
                'message' => 'product inserted with success'
            ]);

        } catch (Exception $err) {
            return response()->json([
                'ERROR' => 'some field is wrong, check all the fields and try again '
            ], 400);
        }
    }

    public function update (Request $request, int $id) {
        try {

            DB::table('products')->where('id','=', $id)->update([
                'name' => $request->input('name'),
                'stock' => $request->input('stock'),
                'price' => $request->input('price')
            ]);

            return response()->json([
                'message' => 'Product updated with success '
            ]);

        } catch (Exception $err) {
            return response()->json([
                'ERROR' => 'some field is wrong, check all the fields and try again '
            ], 400);
        }
    }

    public function destroy (int $id) {
        DB::table('products')->where('id', $id)->delete();

        return response()->json([
            'message' => 'product deleted with success '
        ]);
    }

    public function showByID (int $id) {
        $product = DB::table('products')->where('id','=', $id)->get();

        return $product;
    }

    public function showByLikeName (Request $request) {

        try {

            $request->validate([
                'name' => ['bail', 'required', 'max:255', 'min:1', 'alpha_num']
            ]);

            $products = DB::table('products')->where('name', 'like', '%'.$request->input('name').'%')->get();

            return $products;

        } catch (Exception $err) {
            return response()->json([
                'ERROR' => 'the field informad is wrong, check the field and try again'
            ]);
        }
    }

    public function paginate () {

        $products = DB::table('products')->simplePaginate(5);

        return $products;

    }
}
