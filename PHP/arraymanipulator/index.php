<?php

    // add and remove

        $bands = [
            "System of a Down",
            "Slipknot",
            "Reinmstein",
            "Disturbed"
        ];

        array_push($bands, "Queen"); // add in array
        array_pop($bands); //remove in array

        var_dump($bands);

    // array order

        $numbers = [2, 3, 6, 4, 0, 6];

        $reverse_number = array_reverse($numbers);

        var_dump($numbers);
        echo "<br />";

        var_dump($reverse_number);
        echo "<br />";

        asort($numbers); //order by value
        var_dump($numbers);
        echo "<br />";

        ksort($numbers); //order by keys
        var_dump($numbers);
        echo "<br />";

        sort($numbers); //order by value and re-index
        var_dump($numbers);
        echo "<br />";
        
        rsort($numbers); //reverse order by value and re-index
        var_dump($numbers);
    
    // using for

    for($i = 0; $i < count($bands); $i++) {
        echo "<p>I am listing {$bands[$i]} now! <br /></p>";
    }
