<?php

    define('DR', DIRECTORY_SEPARATOR);

    require __DIR__.DR.'vendor'.DR.'autoload.php';

    use session\Session;

    $session = new Session(2, "gustavo@mail.com", true);

    Session::isAdm();