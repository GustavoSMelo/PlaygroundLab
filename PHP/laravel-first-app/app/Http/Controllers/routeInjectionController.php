<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class routeInjectionController extends Controller
{
    public function index (Request $req, $id) : string {
        return "The current URL is ".$req->path()." and, the user passed is ".$id;
    }

    public function show (Request $req) : string {
        $contentType = $req->getAcceptableContentTypes();
        if($req->routeIs('user')) {
            return var_dump($contentType).'<br /> this is user route';
        } else {
            return var_dump($contentType).'<br /> this is a admin route';
        }
    }
}
