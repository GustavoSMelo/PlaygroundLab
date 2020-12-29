<?php

    namespace passcrypt\config;
    
    use \PDO;
    use \PDOException;

    class Connection {  

        private const USER = 'gustavomelo';
        private const PASSWORD = '123456789';
        private const HOST = "localhost";
        private const PORT = "3306";
        private const DB = "PDO";
        private const OPTIONS = [
            PDO::ATTR_CASE => PDO::CASE_NATURAL,
            PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
            PDO::MYSQL_ATTR_INIT_COMMAND => "SET NAMES utf8",
            PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_OBJ
        ];

        private static $instance;

        public static function getConnection () {
            try {

                if(empty(self::$instance)) {
                    self::$instance = new PDO('mysql:host='.self::HOST.';dbname='.self::DB.';port='.self::PORT,
                    self::USER,
                    self::PASSWORD,
                    self::OPTIONS);
                }

                return self::$instance;
            } catch (PDOException $err) {
                die('error to create a new connection with database');
            }
        }

        private function __construct () {}

        private function __clone() {}

    }
