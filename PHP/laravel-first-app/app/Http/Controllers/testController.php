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

    public function informations (Request $request) {

        //$old = $request->old('field');

        $cookie = $request->cookie('cookie_test');

        $value = $request->input('field', 'gustavo');
        $document = $request->query('document', 'XXX-XXX-XXX-X');
        return var_dump($cookie);
    }

    public function photo (Request $request) {

        if($request->hasFile('photo') && $request->file('photo')->isValid()){
            $photo = $request->file('photo');

            echo is_writeable('/')."<br />";

            $request->file('photo')->store('uploads');
        } else {
            return 'Please, insert a valid photo and try again ';
        }

        return var_dump($photo);
    }
}
