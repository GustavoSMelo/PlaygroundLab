<?php

    use src\Address\Address;

    $address = new Address("rua das palmeiras", 230, "0808080-30");
    $presentialEvent = new PresentialEvent("show de musica", 1325.0, "11/11/2001", ["gustavo"], 68, $address);
    $liveEvent = new LiveEvent("show de musica 2", 0, "05/11/2001", ["geovana"], 10, "youtube.com");

    echo ($presentialEvent);
    echo ($liveEvent);
