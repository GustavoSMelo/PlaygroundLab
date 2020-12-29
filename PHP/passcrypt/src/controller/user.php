<?php

    namespace passcrypt\controller;

    use passcrypt\config\Connection;
    use passcrypt\models\UserModel;
    use PDO;

    class UserController {
        public function __construct() {}

        public function Store (string $first_name, string $last_name, string $email, string $document, string $password) : void {
            $connection = Connection::getConnection();

            $stmt = $connection->prepare('INSERT INTO users (first_name, last_name, email, document, password) VALUES (:first_name, :last_name, :email, :document, :password)');

            $stmt->bindValue(":first_name", $first_name , PDO::PARAM_STR);
            $stmt->bindValue(":last_name", $last_name, PDO::PARAM_STR); 
            $stmt->bindValue(":email", $email, PDO::PARAM_STR);
            $stmt->bindValue(":document", $document, PDO::PARAM_STR);
            $stmt->bindValue(":password", $password, PDO::PARAM_STR);

            $stmt->execute();

            echo 'User created with success';
        } 

        public function Index () : void {
            
            $connection = Connection::getConnection();

            $stmt= $connection->query("SELECT * FROM users WHERE id = 7");

            $user = $stmt->fetch();

            var_dump(password_verify("alex" ,$user->password));
        } 
    }
