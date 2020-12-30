<?php

    define("DR", DIRECTORY_SEPARATOR);

    $file = $_FILES;
    echo var_dump($file["imge"]);

    $file_name_tmp = $file["imge"]["tmp_name"];
    $file_location = __DIR__.DR."up".DR;

    echo '<br/>'.$file_location;

    if(!is_dir($file_location)) {
        die ('The directory informed not exists');
    } else {
        if (!is_writable($file_location)) {
            die ('This directory is cannot permit send file for it ');
        } else {
            move_uploaded_file($file_name_tmp, $file_location.$file["imge"]["name"]);
        }
    }