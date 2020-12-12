<?php

    require __DIR__.'/user.php';

    $user = new User();

    $user->setFirstname("Gustavo") ;
    $user->setLastname("Melo");
    $user->setEmail("gustavo@mail.com");

    echo "The {$user->getFullname()} have this email address: {$user->getEmail()}";
