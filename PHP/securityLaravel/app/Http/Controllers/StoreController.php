<?php

namespace App\Http\Controllers;

use App\Models\StoreModel;
use Exception;
use Illuminate\Http\Request;

class StoreController extends Controller
{
    public function store (Request $request) {

        try {

            $password_hash = password_hash($request->input('password'), PASSWORD_DEFAULT);

            StoreModel::create([
                'serial' => $request->input('serial'),
                'password' => $password_hash
            ]);

            return true;

        } catch (Exception $err) {
            return false;
        }
    }
}
