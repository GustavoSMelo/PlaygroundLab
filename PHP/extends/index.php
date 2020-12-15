<?php

    use src\Address;
    use src\Event;
    use src\LiveEvent;
    use src\PresentialEvent;

    require __DIR__.'/src/event.php';
    require __DIR__.'/src/live_event.php';
    require __DIR__.'/src/presential_event.php';
    require __DIR__.'/src/address.php';

    $event = new Event("show de musica 2", 0, "05/11/2001", ["geovana"], 10);

    $address = new Address("rua dos carros", 321, "132123");

    $presentialEvent = new PresentialEvent("show de musica", 1325.0, "11/11/2001", ["gustavo"], 68, $address);

    $liveEvent = new LiveEvent("show de musica 2", 0, "05/11/2001",["geovana"], 10, "youtube.com");

    $presentialData = $presentialEvent->__toString(); 
    $liveData = $liveEvent->__toString(); 
    
    var_dump($presentialEvent->__toString());
    echo '<br />';

    var_dump($liveData);
    echo '<br />';
