<?php

namespace App\Http\Controllers;

use App\Models\coursesModel;
use Illuminate\Http\Request;

class coursesController extends Controller
{
    public function index () {
        return coursesModel::all();
    }

    public function indexUsers () {
        $users = new coursesModel;

        // for search a users with relationship with someone course, you need to specify the id of course
        return $users->find(1)->user;
    }
}
