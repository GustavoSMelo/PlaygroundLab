<?php

    namespace src;

    class Event {

        private string $title;
        private float $price;
        private string $date;
        private array $clients = [];
        private int $vacancies;

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
            return $this->price;
        }

        public function getDate() : string{
            return $this->date;
        }

        public function getClients() : string {
            $all_clients = "";

            if (count($this->clients) > 0) {
                for ($i = 0; $i < 0; $i++) {
                    $all_clients += $this->clients[$i];
                }
                return $all_clients;
            } else {
                return $all_clients;
            }
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
