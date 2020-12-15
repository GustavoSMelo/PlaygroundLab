<?php

    namespace src;

    class Address {

        private string $street;
        private string $number;
        private string $cep;

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

        public function __toString() : string
        {
            return $this->getStreet().", ".$this->getNumber()." ".$this->getCep();
        }
    }