<?php

use App\Http\Controllers\AuthController;
use App\Http\Controllers\privateResponseController;
use App\Http\Controllers\StoreAuthController;
use App\Http\Controllers\StoreController;
use App\Http\Controllers\UserController;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

Route::prefix('user')->group(function () {

    Route::post('/', [UserController::class, 'store']);
});

Route::post('/auth', [AuthController::class, 'store']);

Route::delete('/auth/{id}', [AuthController::class, 'destroy']);

Route::post('/store', [StoreController::class, 'store']);

Route::post('/store/auth', [StoreAuthController::class, 'store']);

Route::middleware('auth:sanctum')->get('/private', [privateResponseController::class, 'index']);
