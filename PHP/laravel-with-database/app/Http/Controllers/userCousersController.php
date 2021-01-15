<?php

namespace App\Http\Controllers;

use App\Models\coursesModel;
use App\Models\userCoursesModel;
use App\Models\UserModel;
use Database\Seeders\userSeeder;
use Illuminate\Http\Request;

class userCousersController extends Controller
{
    public function store (Request $request) {

        if (UserModel::find($request->input('user_id'))->exists()) {
            if (coursesModel::find($request->input('courses_id'))->exists()) {
                $user_course = new userCoursesModel();

                $user_course->user_id = $request->input('user_id');
                $user_course->courses_id = $request->input('courses_id');

                $user_course->save();

                return response()->json([
                    'message' => 'Relationship created with success '
                ]);
            }
        }

        return response()->json([
            'message' => 'error, user or course does not exists'
        ], 400);

    }

    public function index () {
        return userCoursesModel::all();
    }
}
