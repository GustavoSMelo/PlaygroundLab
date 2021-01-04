<?php

namespace App\Http\Controllers;

use Exception;
use Illuminate\Http\Request;

class testController extends Controller
{

    public function Index () : string {
        return 'Index function';
    }

    public function Store (Request $request) : string {
        return 'Store function';
    }

    public function Update (Request $request) : string {
        return 'update function';
    }

    public function Destroy (Request $request) : string {
        return 'destroy function';
    }
}
