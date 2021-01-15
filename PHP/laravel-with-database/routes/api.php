<?php

use App\Http\Controllers\coursesController;
use App\Http\Controllers\productController;
use App\Http\Controllers\productsController;
use App\Http\Controllers\salesController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\userCousersController;
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

    Route::get('/{?id}', [UserController::class, 'show']);

    Route::post('/', [UserController::class, 'store']);

    Route::put('/{id}', [UserController::class, 'update']);

    Route::delete('/', [UserController::class, 'destroy']);

    Route::post('/mass', [UserController::class, 'massAssignment']);

    Route::get('/courses', [UserController::class, 'indexCourses']);
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

    Route::get('/show/product/{id}', [salesController::class, 'showWithProduct']);

    Route::get('/show/user/{id}', [salesController::class, 'showWithUser']);

});

Route::prefix('product')->group(function () {

    Route::post('/', [productController::class, 'store']);

    Route::get('/', [productController::class, 'index']);

});

Route::prefix('usercourses')->group(function () {

    Route::post('/', [userCousersController::class, 'store']);

    Route::get('/', [userCousersController::class, 'index']);

});


Route::prefix('courses')->group(function () {

    Route::get('/', [coursesController::class, 'index']);

    Route::get('/users', [coursesController::class, 'indexUsers']);

});
