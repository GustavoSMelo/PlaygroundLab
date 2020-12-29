<?php

    // the next code, prevents the website executes attacks xss
    // $post = filter_input_array(INPUT_POST, FILTER_SANITIZE_FULL_SPECIAL_CHARS);

    $post = $_POST;

    echo var_dump($post);
