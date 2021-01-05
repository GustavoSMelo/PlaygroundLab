<?php

use App\Http\Controllers\routeInjectionController;
use App\Http\Controllers\sessionController;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
use \App\Http\Controllers\testController;
use App\Http\Controllers\testTwoController;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::middleware('auth:api')->get('/user', function (Request $request) {
    return $request->user();
});

Route::get('/test', function() {
    return "hello world from api";
});

Route::match(["post", "get"], '/php', function () {
    return "PHP is awesome";
});

Route::any('/laravel', function () {
    return "PHP with laravel is the best backend that you would like to use in your application";
});

Route::get('/req', function(Request $req) {
    return $req->getHttpHost();
});

Route::get('/user/{id}', function(Int $id) {
    return "The id of Leo is ".$id;
});

Route::get('/user/inject/{id}', function (Request $req, Int $identity) {
    return "The URL is ".$req->path()." and the id passed in this URL is ".$identity;
});

Route::get('/optional/{id?}', function (Int $id = 1) {
    return $id;
});

Route::get('/username/{username}', function (String $username) {
    return $username;
})->whereAlphaNumeric('username');

Route::get('/private/user/profile/show/only/one', function () {
    return "Hello world from web artisans";
})->name('profile');

Route::prefix("family")->group(function () {

    Route::get('/one', function () {
        return "one";
    });

    Route::get('/two', function() {
        return "two";
    });
});

Route::get('/error', function() {
    return 'ERROR';
});

Route::post('/mid/test', function (Request $req) {
    return "Hello World";
})->middleware('test');

Route::post('/login', function () {
    return 'Welcome user';
})->middleware(['test', 'test.two']);

Route::post('/test/csrf/token', function (Request $req) {
    $token = csrf_token();
});

Route::prefix('controller')->group(function () {
    Route::get('/test', [testController::class, 'Index']);

    Route::post('/test', [testController::class, 'Store']);

    Route::put('/test', [testController::class, 'Update']);

    Route::delete('/test', [testController::class, 'Destroy']);

    Route::post('/test/informations', [testController::class, 'informations']);

    Route::post('/test/photo', [testController::class, 'photo']);
});

Route::apiResource('/two/test/controller', testTwoController::class);

Route::get('/router/injection/{id}', [routeInjectionController::class, 'index']);

Route::get('/request/is/route', [routeInjectionController::class, 'show'])->name('user');

Route::get('/array', function () {
    return response([1, 2, 3], 200)->header('X-Header-First', 'Header');
});

Route::get('/cookie', function () {
    return response('Hello world')->cookie('cookie_name','cookie_value');
});

Route::get('/response/json', function () {
    return response()->json([
        'name' => 'Gustavo'
    ]);
});

Route::get('/img', function () {
    return response()->file(__DIR__.'/../storage/app/uploads/6nWt0S0n6rs7Xgq9IcXWRICnwhtmZiTyWyR1dzmz.jpg');
});

Route::get('/full/route', function () {
    return url()->current();
});

Route::prefix('session')->group(function () {
    Route::post('/user', [sessionController::class, 'store']);

    Route::get('/user', [sessionController::class, 'index']);
});
