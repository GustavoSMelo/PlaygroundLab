<?php

    namespace Crud\Models;

    class UserModel {
        private string $first_name;
        private string $last_name;
        private string $email;
        private string $document;
        
        public function __construct($first_name, $last_name, $email, $document)
        {
            $this->$first_name = $first_name;
            $this->$last_name = $last_name;
            $this->$email = $email;
            $this->$document = $document;
        }

        // getters

        public function getFirstName() : string {
            return $this->first_name;
        }

        public function getLastName() : string {
            return $this->last_name;
        }

        public function getEmail() : string {
            return $this->email;
        }

        public function getDocument() : string {
            return $this->document;
        }

        // setters 

        public function setFirstName($first_name) : void {
            $this->first_name = $first_name;
        }

        public function setLastName($last_name) : void {
            $this->last_name = $last_name;
        }

        public function setEmail($email) : void {
            $this->email = $email;
        }

        public function setDocument($document) : void {
            $this->document = $document;
        }

    }
