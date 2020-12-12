<?php

use \src\Address\Address;
use \src\Event\Event;

class PresentialEvent extends Event {

    private $address;

    public function __construct($title, $price, $date, $clients, $vacancies, Address $address) {
        parent::__construct($title, $price, $date, $clients, $vacancies);
        
        $this->address = $address;
    }

    public function getAddress ($address) : Address {
        return $this->address;
    }
}
