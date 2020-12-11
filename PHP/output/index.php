<?php

    echo "<h3> Learning a new programming language ",
    " <strong> LETS GO PHP </strong>", " </h3>";

    $variable = "This is a variable";

    echo "{$variable} <br />";
    echo '$variable <- this is not variable ';

    $article = "<article><h1>%s</h1> <p>%s</p></article>";
    $title = "This is title";
    $param = "lorem ipsum";

    printf($article, $title, $param);


    var_dump($variable); // show all details of variable
