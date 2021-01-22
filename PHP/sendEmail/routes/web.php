<?php

use App\Mail\testMail;
use Illuminate\Support\Facades\Mail;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Route::get('/send/email', function () {

    $user = new stdClass();
    $user->name = "gustavo";
    $user->email = "geovanamgodoi@gmail.com";

    Mail::send(new testMail($user));

    return response()->json([
        'okay' => true
    ]);
});
