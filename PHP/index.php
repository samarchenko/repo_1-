<?php
    echo 'helo world!';

    $my_variable = 100;

    echo $my_variable;

    $greeting = 'hi bro!';

    echo $greeting; 

    $massif = array(
        "Oleg", //0
        "Amdrij",//1
        'Anton', //2
        'Max', //3
        'Ivan' //4
    ); 

    echo $massif[2]; 

    $massif_2 = array(
        'name' => "anton", 
        'surnam' => "Samarchenko", 
        'age' => 15, 
        'hobby' => "IT", 
        'get through' => array(
            'school in 2023'
        ),
        'married' => false,
        'healthy' => true,
    ); 

    echo $massif_2['name','surname','age','get through'][0]; 
?>