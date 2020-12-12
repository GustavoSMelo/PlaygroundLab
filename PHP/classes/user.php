<?php
    class User {
        private $firstname;
        private $lastname;
        private $email;

        // getters

        public function getFirstname() : string{
            return $this->firstname;
        }

        public function getLastname () : string {
            return $this->lastname;
        }

        public function getFullname () : string {
            return $this->firstname." ".$this->lastname;
        }

        public function getEmail () : string {
            return $this->email;
        }

        // setters

        public function setFirstname($firstname) : void {
            $this->firstname = $firstname;
        }

        public function setLastname($lastname) : void {
            $this->lastname = $lastname;
        }

        public function setEmail($email) : void {
            $this->email = $email;
        }
    }