<?php

    namespace src\Event;

    class Event {

        private $title;
        private $price;
        private $date;
        private $clients;
        private $vacancies;

        public function __construct($title, $price, $date, $clients, $vacancies)
        {
            $this->title = $title;
            $this->price = $price;
            $this->date = $date;
            $this->vacancies = $vacancies;

            if (count($clients) > 0 && $vacancies >= 1) {
                array_push($this->clients, $clients);
                
                $lenghtClients = count($clients);
                $this->vacancies -= $lenghtClients;
            }

        }

        // getters 

        public function getTitle() : string {
            return $this->title;
        }

        public function getPrice() : float {
            return number_format($this->price, 2);
        }

        public function getDate() : string{
            return $this->date;
        }


        public function getClients() : array {
            return $this->clients;
        }

        public function getVacancies() : int {
            return $this->vacancies;
        }

        // setters
        
        public function setTitle($title) : void {
            $this->title = $title;
        }

        public function setPrice($price) : void {
            $this->price = $price;
        }

        public function setDate($date) : void{
            $this->date = $date;
        }

        public function setVacancies($vacancies) : void {
            $this->vacancies = $vacancies;
        }

        public function setClients($clients) : void {
            if(count($clients) > 0 && $this->vacancies > 0) {
                array_push($this->clients);
            }
        }
    }
