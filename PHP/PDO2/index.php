<?php

define("DS", DIRECTORY_SEPARATOR);

require __DIR__.DS."vendor".DS."autoload.php";

use PDOTwo\config\Connection;

$first_connection = Connection::getInstance();

$read = $first_connection->query("SELECT * FROM users");

if(!$read->rowCount()) {
    echo 'Dont have any user in database';
} else {
    // var_dump($read->fetchAll()); percorre todos ao msm tempo

    while ($user = $read->fetch()) {
        var_dump($user);
    }
}
