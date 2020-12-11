<?php

    //String 

    $company = "Riot";
    $$company = "Games";
    $name = "Gustavo";
    $lastname = "Melo";

    echo "{$company} {$Riot} <br />";
    echo "{$name} {$lastname}<br />";

    //Numbers

    $numberA = 10;
    $numberB = 40;
    
    $result =$numberA + $numberB;  

    echo "{$result} <br/>";
    var_dump($result);

    //boolean

    $true = true;
    $false = false;

    var_dump($true, $false);

    //callback
    $title = "<h1>This is a title </h1>";
    $cb = call_user_func("string_trip", $title); //native function of php

    echo $title;
    echo $cb;    
