<?php

namespace App\Http\Middleware;

use Closure;
use Illuminate\Http\Request;

class testTwo
{
    /**
     * Handle an incoming request.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \Closure  $next
     * @return mixed
     */
    public function handle(Request $request, Closure $next)
    {

        if($request->input('email') === null || $request->input('email') === ''){
            return redirect('/api/error');
        }

        return $next($request);
    }
}
