<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class sessionController extends Controller
{
    public function store (Request $request) {
        $request->session()->push('session', [
            'user_id' => $request->input('user_id'),
            'user_ip' => $request->ip(),
            'is_admin' => $request->input('is_admin')
        ]);

        return response()->json(['Message' => 'User session created with success ']);
    }

    public function index(Request $request) {
        return $request->session()->all();
    }
}
