<?php

namespace App\Http\Controllers;

use Exception;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class UserController extends Controller
{
    public function index () {
        $users = DB::select('select * from users');

        return response()->json([
            'users' => $users
        ]);
    }

    public function show (Request $request) {

        try {

            $request->validate([
                'id' => ['bail', 'required', 'numeric']
            ]);

            $user = DB::select('SELECT * FROM users WHERE id = :id', ['id' => $request->input('id')]);

            return response()->json([
                "user" => $user
            ]);
        } catch (Exception $err) {
            return response()->json([
                'error' => 'ERROR, you informed a wrongs fields, check all of them and try again '
            ], 400);
        }

    }

    public function store (Request $request) {

        try {

            $request->validate([
                'name' => ['bail', 'max:120', 'alpha_num'],
                'email' => ['bail', 'max:120', 'email'],
                'password' => ['bail', 'max:120', 'alpha_num']
            ]);

            $password_hash = password_hash($request->input('password'), PASSWORD_DEFAULT);

            DB::insert('INSERT INTO users (name, email, password) VALUES (:name, :email, :password)',
            [
                'name' => $request->input('name'),
                'email' => $request->input('email'),
                'password' => $password_hash
            ]);

            return response()->json([
                'message' => 'User created with success '
            ]);

        } catch (Exception $err) {
            return response()->json([
                'error' => 'ERROR, you informed a wrongs fields, check all of them and try again '
            ], 400);
        }

    }

    public function update (Request $request, int $id) {
        try {

            $request->validate([
                'name' => ['bail', 'max:120', 'required', 'alpha_num'],
                'email' => ['bail', 'max:120', 'required', 'email'],
                'password' => ['bail', 'max:120', 'required', 'alpha_num']
            ]);

            $password_hash = password_hash($request->input('password'), PASSWORD_DEFAULT);

            DB::update('UPDATE users SET name = :name, email = :email, password = :password WHERE id = :id', [
                'name' => $request->input('name'),
                'email' => $request->input('email'),
                'password' => $password_hash,
                'id' => $id
            ]);

            return response()->json([
                'message' => 'User updated with success '
            ],);

        } catch (Exception $err) {
            return response()->json([
                'error' => 'ERROR, you informed a wrongs fields, check all of them and try again '
            ],400);
        }
    }

    public function destroy (int $id) {
        DB::delete('DELETE FROM users WHERE id = :id', ['id' => $id]);
    }
}
