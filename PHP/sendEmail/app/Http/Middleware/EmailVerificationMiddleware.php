<?php

namespace App\Http\Middleware;

use App\Models\User;
use Closure;
use Illuminate\Http\Request;

class EmailVerificationMiddleware
{
    public function handle(Request $request, Closure $next)
    {
        $user = User::where('id', $request->header('id'))->first();

        if($user->email_verified_at !== null) {
            return $next;
        } else {
            return response()->json([
                'message' => 'To use our application, please, verify your email first '
            ], 401);
        }
    }
}
