<?php

    namespace Crud\Controllers;

    use Crud\Config\Connection;
    use Crud\Models\UserModel;

    use \PDO;

    class UserController {

        public function __construct() {}

        public function Index () : void {

            $connection = Connection::getInstance();
            $allusers = $connection->query("SELECT * FROM users");

            if(!$allusers->rowCount() || $allusers->rowCount() <= 0) {
                echo "dont have any user registred in database";   
            } else {
                while ($eachUser = $allusers->fetchAll()) {
                    var_dump($eachUser);
                }
            }
        }

        public function Store ($first_name, $last_name, $email, $document) : void {
            $connection = Connection::getInstance();

            $stmt = $connection->prepare("INSERT INTO users (first_name, last_name, email, document) VALUES (:first_name, :last_name, :email, :document)");

            $stmt->bindValue(":first_name", $first_name, PDO::PARAM_STR);
            $stmt->bindValue(":last_name", $last_name, PDO::PARAM_STR);
            $stmt->bindValue(":email", $email, PDO::PARAM_STR);
            $stmt->bindValue(":document", $document, PDO::PARAM_STR);

            $stmt->execute();

            echo "user created with success";

        }

        public function Update ($id, $first_name, $last_name, $email, $document) : void {
            $connection = Connection::getInstance();

            $stmt = $connection->prepare("UPDATE users SET first_name = :first_name, last_name = :last_name, email = :email, document = :document WHERE id = :id");

            $stmt->bindValue(":id", $id, PDO::PARAM_INT);
            $stmt->bindValue(":first_name", $first_name, PDO::PARAM_STR);
            $stmt->bindValue(":last_name", $last_name, PDO::PARAM_STR);
            $stmt->bindValue(":email", $email, PDO::PARAM_STR);
            $stmt->bindValue(":document", $document, PDO::PARAM_STR);

            $stmt->execute();

            echo "user updated with success";
        }

        public function Destroy ($id) : void {
            $connection = Connection::getInstance();

            $stmt = $connection->prepare("DELETE FROM users WHERE id = :id");
            $stmt->bindValue(":id", $id, PDO::PARAM_INT);

            $stmt->execute();

            echo "user deleted with success";
        }
    }
