<?php
    $myString = "Hollow knight é o meu game favorito";
    var_dump([
        "str" => "{$myString}",
        "leng_string" => strlen($myString)
    ]);
    
    $BreakRow = "<br />";
    echo $BreakRow;

    var_dump([
        "upper" => strtoupper($myString),
        "lower" => strtolower($myString)
    ]);

    echo $BreakRow;

    var_dump([
        "cut Hollow knight: " => substr($myString, 13),
        "dont cut Hollow knight" => substr($myString, 0, 13) 
    ]);

    echo $BreakRow;

    echo $myString;
    echo $BreakRow;
    echo str_replace("Hollow knight", "Dark Souls", $myString); // Will change hollow knight for dark souls
    
    // important: this is used to manipulate request APIS

    $request = "name=GustavoSMelo&email=gustavo@mail.com";

    parse_str($request, $parsedRequest);
    echo $BreakRow;
    var_dump($parsedRequest);
    echo $BreakRow;

    var_dump(
        (object)$parsedRequest
    );
