<?php

    namespace passcrypt\models;

    class UserModel {
        private string $first_name;
        private string $last_name;
        private string $email;
        private string $document;
        private string $password;

        public function __construct() {}

        //getters

        public function getFirst_name () : string {
            return $this->first_name;
        }

        public function getLast_name () : string {
            return $this->last_name;
        }

        public function getEmail () : string {
            return $this->email;
        }

        public function getDocument () : string {
            return $this->document;
        }

        public function getPassword () : string {
            return $this->password;
        }

        // setters

        public function setFirst_name (string $first_name) : void {
            $this->first_name = $first_name;
        }

        public function setLast_name (string $last_name) : void {
            $this->last_name = $last_name;
        }

        public function setEmail (string $email) : void {
            $this->email = $email;
        }

        public function setDocument (string $document) : void {
            $this->document = $document;
        }

        public function setPassword (string $password) : void {
            $this->password = $password;
        }
        
        //verify hash

        public function verifyHash (string $hash) : void {
            var_dump(password_verify($this->password, $hash));
        }

    }
