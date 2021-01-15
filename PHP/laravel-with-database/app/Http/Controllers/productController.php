<?php

namespace App\Http\Controllers;

use App\Models\productModel;
use Exception;
use Illuminate\Http\Request;

class productController extends Controller
{
    public function store (Request $request) {

        try {

            $product = new productModel();

            $product->name = $request->input('name');
            $product->price = $request->input('price');
            $product->amount = $request->input('amount');
            $product->type = $request->input('type');


            $product->save();

        } catch (Exception $err) {
            return response()->json([
                'error' => 'some field is wrong, please check all the fields and try again '.$err
            ], 400);
        }

    }

    public function index () {

        $products = productModel::all();

        return $products;
    }
}
