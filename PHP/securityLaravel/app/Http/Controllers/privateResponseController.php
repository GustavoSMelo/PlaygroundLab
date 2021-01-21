<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;

class privateResponseController extends Controller
{
    public function index (Request $request) {

        $user = User::where('id', $request->header('id'))->first();


        $current_token = $user->tokens[0];

        // return $current_token;

        if (in_array('user', $current_token->abilities)) {
            return response()->json([
                'message' => 'Welcome user'
            ]);
        }

        return response()->json([
            'message' => 'access denied'
        ], 401);

    }
}
