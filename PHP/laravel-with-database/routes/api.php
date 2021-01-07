<?php

use App\Http\Controllers\productsController;
use App\Http\Controllers\salesController;
use App\Http\Controllers\UserController;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

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

Route::prefix('users')->group(function () {
    Route::get('/', [UserController::class, 'index']);

    Route::post('/show', [UserController::class, 'show']);

    Route::post('/', [UserController::class, 'store']);

    Route::put('/{id}', [UserController::class, 'update']);

    Route::delete('/', [UserController::class, 'destroy']);
});

Route::prefix('products')->group(function () {

    Route::post('/', [productsController::class, 'store']);

    Route::get('/', [productsController::class, 'index']);

    Route::put('/{id}', [productsController::class, 'update']);

    Route::delete('/{id}', [productsController::class, 'destroy']);

    Route::get('/{id}', [productsController::class, 'showByID']);

    Route::post('/show', [productsController::class, 'showByLikeName']);

    //http://localhost:8000/api/products/list/products?page=X
    Route::get('/list/products', [productsController::class, 'paginate']);

});

Route::prefix('sales')->group(function () {

    Route::get('/', [salesController::class, 'index']);

    Route::post('/', [salesController::class, 'store']);

});
