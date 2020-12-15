<?php

    namespace src;

    use src\Event;
    use src\Address;

    class PresentialEvent extends Event {

        private $address;

        public function __construct($title, $price, $date, $clients, $vacancies, Address $address) {
            parent::__construct($title, $price, $date, $clients, $vacancies);
            
            $this->address = $address;
        }

        public function getAddress () : string {
            return $this->address->__toString();
        }

        public function __toString() : string
        {
            return "Presential Event = title: {$this->getTitle()},
            <br/> price: {$this->getPrice()},
            <br /> date: {$this->getDate()},
            <br /> clients: {$this->getClients()},
            <br /> vacancies: {$this ->getVacancies()},
            <br /> address: {$this->getAddress()}";            
        }
    }
