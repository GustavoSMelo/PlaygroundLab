<?php

    namespace PDOTwo\config;

    use \PDO;
    use \PDOException;

    class Connection {
        private const HOST = 'localhost';
        private const USER = 'gustavomelo';
        private const PASSWORD = '123456789';
        private const DBNAME = 'PDO';

        private const OPTIONS = [
            PDO::MYSQL_ATTR_INIT_COMMAND => "SET NAMES utf8",
            PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
            PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_OBJ,
            PDO::ATTR_CASE => PDO::CASE_NATURAL
        ];

        private static $instance;

        public static function getInstance() : PDO {

            if(empty(self::$instance)){
                try {
                    self::$instance = new PDO('mysql:host='.self::HOST.';dbname='.self::DBNAME, self::USER, self::PASSWORD, self::OPTIONS);
                } catch (PDOException $err) {
                    die('some error happens when we try to connect with database, ERROR: {$err}'); 
                }
            }

            return self::$instance;
        }

        final private function __construct()
        {
            
        }

        final private  function __clone()
        {
            
        }
    }
