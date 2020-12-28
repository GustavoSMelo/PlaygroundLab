<?php

    namespace Crud\Config;
    
    use \PDO;
    use \PDOException;

    class Connection {
        private const USER = "gustavomelo";
        private const PASSWORD = "123456789";
        private const PORT = "3306";
        private const DB = "PDO";
        private const HOST = "localhost";
        private const OPTIONS = [
            PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
            PDO::MYSQL_ATTR_INIT_COMMAND => "SET NAMES utf8",
            PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_OBJ,
            PDO::ATTR_CASE => PDO::CASE_NATURAL
        ];

        private static $instance;

        public static function getInstance() {
            try {
                if(empty(self::$instance)) {
                    self::$instance = new PDO("mysql:host=".self::HOST.";dbname=".self::DB.";port=".self::PORT,
                    self::USER, 
                    self::PASSWORD, 
                    self::OPTIONS);
                }

                return self::$instance;
            } catch (PDOException $err) {
                die("Error to create connection with database, review the fields and try again");
            }
        }
    }
