<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ConverterController extends Controller
{
    public static function convertNumberToString (int $number) : string {
        return strval($number);
    }

    public static function sum (int $n1 = 0, int $n2 = 0) : int {

        return $n1 + $n2;

    }
}
