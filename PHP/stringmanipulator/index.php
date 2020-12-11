<?php

    $data = "Hollow knight é o meu game favorito";
    
    var_dump([
        "String" => $data, 
        "wrong_lenght" => strlen($data), // this structure don't accept accentuation 
        "right_lenght" => mb_strlen($data) // this is the right, because this structures accepts accentuation 
    ]);
