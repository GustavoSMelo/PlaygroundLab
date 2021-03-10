<?php

namespace App\Http\Controllers;

use App\Models\User;
use Exception;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Log;

class UserController extends Controller
{
    public function Store (Request $request) {

        try {

            $user = new User();

            $hashed_pass = password_hash($request->password, PASSWORD_DEFAULT);

            $user->name = $request->name;
            $user->email = $request->email;
            $user->password = $hashed_pass;

            $user->save();

            return response()->json([
                'message' => true
            ], 200);

        } catch (Exception $err) {

            Log::error($err);

            return response()->json([
                'err' => 'error to create user'
            ])->status(400);
        }

    }

    public function Index () {
        return User::all();
    }
}
