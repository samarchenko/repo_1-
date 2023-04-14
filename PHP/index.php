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

    $int = 100; 
    echo 'test: $int<br>'; 
    echo "test: $int"; 
    
    $name = 'Anton'; 
    $surname = 'Samarhenko'; 

    echo $name; 
    echo '  '; 
    echo $surname; 

    echo $name . ' ' . $surname;
    
    // + , - , * , /, %.
    echo 5 + 5; 
    echo 100 - 30; 
    echo 5 * 5; 
    echo 12 / 4; 
    echo 1081 % 2;
     
    $number1 = 100; 
    $number2 = 200; 
    echo 'answer: ' . $number1 + $number2; //Конкатенація

    $weather = 'сонце';

    if ( $weather == 'сніг'){
        echo "погода погана,ліпше нікуди не їхати!"
    }

    if ( $weather == 'дождь'){
        echo "погода погана, дуже мокро ліпше нікуди не їхати!"
    }

    if ( $weather == 'сонце'){
        echo "погода прекрасна,алу жарко!"
    }

    if ( $weather == 'облачно'){
        echo "погада класна,але може змінитися!"
    }


    $age_2 = 18; 
    //пропуск в клуб!
    if($age_2 >= 18 ){
        echo 'ласкаво просимо'; 
    }
    if($age_2 < 18){ 
        echo 'вам не можна, ви ще замалі!';
    }
    
    
    //or - або ; and - і ; 
    $name_2 = 'Anton'; 
    $age_3 = 15; 
    if($age_3 < 18 and $name_2 != 'Anton'){
        echo 'тобі сюди не можна!'; 
    }
    else{
        echo 'Привіт!'; 
    }
    
    $rating = 55; 
    if($rating >= 25 and $rating <= 75){
        echo 'ти всигаюча людина!'; 
    }
    else{
        echo 'тобі ще стримитися!'; 
    }

    $rating_2 = 11; 
    if($rating_2 >= 25 or $rating <= 75){
        echo 'ти всигаюча людина!'; 
    }
    else{
        echo 'тобі ще стримитися!'; 
    }


    //for
    //while
    //foreach

    for($i = 0; $i <= 10; $i++){  //$i++ == $i = $i + 1; 
        echo 'привіт світ!<br>'; 
    }

    $test = 10; 
    while($test <= 100){
        echo 'Тест '.$test.'<br/>';
        $test++;  
    }

    $name_ = array(
        'Anton',
        'Andrij', 
        'veronika',
        'alex', 
        'Vika',
    ); 
    foreach($name_ as $value){
        echo $value . '<br/>'; 
    }

    $number_= array(2,3,4,5,); 
    foreach($number_ as $num){
        echo 'куб числа' . $number_ . ': ' . ($num * $num) . '<br>'; 
    }

    //function
    function myfunction(){
        echo 'hello world';
    }
    myfunction(); 

    function get_bigger($a,$b){
        if($a > $b){
            echo $a; 
        }
        else{
            echo $b; 
        }
        echo '<br>'; 
    }
    get_bigger(10,20); 
    get_bigger(100,50); 
?>