<?php

namespace App\Http\Controllers;

use App\Models\User;
use Exception;
use Illuminate\Http\Request;

class AuthController extends Controller
{
    public function store (Request $request) {

        try {
            /*$request->validate([
                'email' => 'required|email',
                'password' => 'required'
            ]);*/

            $user = User::where('email', $request->input('email'))->first();


            if (password_verify($request->input('password'), $user->password)) {

                $user->tokens()->delete();

                $token = $user->createToken('Auth-Token', ['user'])->plainTextToken;

                return response()->json([
                    'token' => $token,
                    'id' => $user->id
                ]);

            } else {
                return response()->json([
                    'message' => 'email does not exists in our database '
                ]);
            }
        } catch (Exception $err) {

            return response()->json([
                'error' => 'some field is missing, complete all the fields and try again '.$err
            ]);

        }

    }

    public function destroy (int $id) {

        try {

            $user = User::all();

            $user[$id]->tokens()->where('id', $id)->delete();

            return true;

        } catch (Exception $err) {

            return response()->json([
                'message' => 'error: '.$err
            ]);

        }

    }
}
