<?php

namespace App\Http\Controllers;

use App\Models\UserModel;
use Exception;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class UserController extends Controller
{
    public function index () {
        $users = UserModel::all();

        return response()->json([
            'users' => $users
        ]);
    }

    public function show (int $id) {

        try {

            $user = UserModel::where('id', $id)->first();

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

            $user = new UserModel();

            $user->name = $request->input('name');
            $user->email = $request->input('email');
            $user->password = $password_hash;

            $user->save();

            return response()->json([
                'message' => 'User created with success '
            ]);

        } catch (Exception $err) {
            return response()->json([
                'error' => 'ERROR, you informed a wrongs fields, check all of them and try again '.$err
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

            $user = UserModel::find($id);

            $user->name = $request->input('name');
            $user->email = $request->input('email');
            $user->password = $password_hash;

            $user->save();

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
        $user = UserModel::where('id', $id);

        $user->delete();

        return response()->json([
            'message' => 'User created with success '
        ]);
    }

    public function massAssignment (Request $request) {

        $password_hash = password_hash($request->input('password'), PASSWORD_DEFAULT);

        $user = UserModel::create([
            'name' => $request->input('name'),
            'email' => $request->input('email'),
            'password' => $password_hash
        ]);

        return response()->json([
            'message' => 'user created with success '
        ]);
    }

    public function indexCourses () {
        return UserModel::find(1)->course;
    }
}
