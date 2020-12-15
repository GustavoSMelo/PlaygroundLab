<?php
    
    namespace src;

    use src\Event;

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

        public function __toString() : string
        {
            return "Live event = title: {$this->getTitle()} <br />,
            price: {$this->getPrice()} <br />,
            date: {$this->getDate()} <br />,
            clients: {$this->getClients()} <br />,
            vacancies: {$this->getVacancies()} <br />,
            sites: {$this->getSites()}";
        }
    }
