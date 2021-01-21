<?php

namespace App\Http\Controllers;

use App\Models\User;
use Exception;
use Illuminate\Http\Request;

class UserController extends Controller
{

    public function store (Request $request) {

        try {

            $user = new User();

            $password_hash = password_hash($request->input('password'), PASSWORD_DEFAULT);

            $user->name = $request->input('name');
            $user->email = $request->input('email');
            $user->password = $password_hash;

            $user->save();

            return response()->json([
                'message' => 'User created with success '
            ]);

        } catch (Exception $err) {
            return response()->json([
                'message' => 'ERROR, some field is missing, complete all the fields and try again '
            ], 400);
        }

    }

}
