<?php

namespace App\Http\Controllers;

use App\Models\StoreModel;
use Illuminate\Http\Request;

class StoreAuthController extends Controller
{

    public function store (Request $request) {

        $store = StoreModel::where('serial', $request->input('serial'))->get();

        if (password_verify($request->input('password'), $store[0]->password)) {
            $store[0]->createToken('123456', ['store']);

            return true;

        } else {

            return false;

        }

    }

}
