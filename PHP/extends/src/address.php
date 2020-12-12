<?php
    namespace src\Address;

    class Address {

        private $street;
        private $number;
        private $cep;

        public function __construct($street, $number, $cep)
        {
            $this->street=$street;
            $this->number=$number;
            $this->cep=$cep;
        }

        public function getStreet() : string{
            return $this->street;
        }

        public function getNumber() : int {
            return $this->number;
        }

        public function getCep() : string {
            return $this->cep;
        }
    }