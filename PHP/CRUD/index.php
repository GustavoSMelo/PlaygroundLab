<?php

    define('DR', DIRECTORY_SEPARATOR);
    require __DIR__.DR.'vendor'.DR.'autoload.php';

    use Crud\Controllers\UserController;

    $userController = new UserController();

    //$userController->Store("ayaka", "sakamura", "ayaka@mail.com", "99876554");
    $userController->Destroy(3);
    $userController->Index();
