<?php


    //cast array to object
        $arry = [
            "name" => "gustavo",
            "email" => "gustavo@mail.com",
            "age" => 19
        ];

        $object = (object)$arry;

        var_dump($arry);
        echo "<br />";
        var_dump($object);


        echo "<br />";

        echo "<p>O(A) {$arry["name"]} tem {$arry["age"]} anos (array) <br /></p>";
        echo "<p>O(A) {$object->name} tem {$object->age} anos (object) <br/></p>";

    //Remove itens from object or array
        
        unset($object->age);
        var_dump($object);
    
    //Create (instance) a empty object

        $character = new stdClass();

        $character->name = "detroit";
        $character->class = "Mage";
        $character->nvl = 99;
        $character->betaTester = false;
        $character->atk = 1652.0;
        $character->atkMagic = 9846.0;
        $character->def = 1085.9;
        $character->skills = new stdClass();
        $character->skills->skill01 = "fireball";
        $character->skills->skill02 = "meteor";

        echo "<br />";

        var_dump($character);
