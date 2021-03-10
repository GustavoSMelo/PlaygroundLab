<?php

namespace App\Http\Controllers;

use App\Models\User;
use Exception;
use Illuminate\Http\Request;

class UserController extends Controller
{
    public function Store (Request $request) {

        try {

            $user = new User();

            $hashed_pass = password_hash($request->input('password'), PASSWORD_DEFAULT);

            $user->name = $request->input('name');
            $user->email = $request->input('email');
            $user->password = $hashed_pass;

            $user->save();

            return response()->json([
                'message' => true
            ])->status(200);

        } catch (Exception $err) {

            echo '{$err}';

            return response()->json([
                'err' => 'error to create user'
            ])->status(400);
        }

    }
}
