<?php

    //$pass = password_hash("123456789", PASSWORD_DEFAULT);
    //var_dump($pass);

    define("DR", DIRECTORY_SEPARATOR);
    
    require __DIR__.DR.'vendor'.DR.'autoload.php';
    use passcrypt\controller\UserController;

    $users = new UserController();

    $password = password_hash("alex", PASSWORD_DEFAULT);
    //$users->Store("alex", "silva","alex@mail.com", "231685132", $password);
    $users->Index();
