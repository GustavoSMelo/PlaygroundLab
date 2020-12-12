<?php

    use \src\Event\Event;

    Class LiveEvent extends Event {
        private $site;

        public function __construct($title, $price, $date, $clients, $vacancies, $site)
        {
            parent::__construct($title, $price, $date, $clients, $vacancies);
            $this->site = $site;
        }

        public function getSites() : string {
            return $this->site;
        }
    }
