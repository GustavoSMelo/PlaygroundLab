<?php

    try {
        $PDO = new PDO("mysql:host=localhost;dbname=PDO;port=3306",
        "gustavomelo", 
        "123456789", [
            PDO::MYSQL_ATTR_INIT_COMMAND => "SET NAMES utf8"
        ]);

        var_dump($PDO);

        $stmt = $PDO->query("SELECT * FROM users");

        while ($user = $stmt->fetch(PDO::FETCH_ASSOC)){
            var_dump($user );
        }

    } catch (PDOException $err) {
        var_dump($err->getMessage());
    } 
