<?php
// перша команда на PHP
 echo "привіт світ<br>";
 echo "hi bro!<br>";echo('<br>'); 
//.

//змінна в php позначається --- $
  $my_variable = 100;
  echo($my_variable);
  echo "<hr>";
  echo $my_variable; echo("<br>"); 
  echo "<br>"; 


  $a = 200; 
  $b = 50; 
  echo ($a);
  echo "<br>"; 
  echo ($b);
  echo "<br>";  
//.


//типи даних в php
  // integer(int) --- ціле число
  $q = 25; 
  echo $q; 
  echo "<br>"; 

  //float --- дробове число
  $t = 15.25; 
  echo $t; 
  echo "<br>"; 
  //string(str) --- рядковий,строковий тип даних
  $f = 'Anton';
  echo $f; 
  echo "<br>"; 
  //Array --- Масив -- це є тип даних!
  $e = array(1,2,3,4,5);
  echo $e; echo "<br>"; 
  echo $e[4]; echo "<br>";
  
  $n = array(
    "Anton",//0
    "Oleg",//1
    "Max",//2
    "Andrij",//3
    "Ivan", //4
    "CJ"//5
  ); 
  echo $n[4];
  echo "<br>"; 

  $f = array(
    "name" => "Anton",
    "surname" => "Samarchenko",
    "age" => 15,
    "hoby" => "IT",
    "date_of_birth" => 2007,
    "education" => array(  //багато функціональний масив
        "school in 2025",
        "university in 2029"
    )
  );
  echo $f["name"]; echo "<br>"; 
  echo $f["age"]; echo "<br>";
  echo $f["hoby"]; echo "<br>"; 
  echo $f["education"][0]; echo "<br>";
  echo $f["education"][1]; echo "<br>";

  //Boolean(bool)(true,false) --- Логічний(правда,помилковий)
    $Anton = array(
      "merried" => false,
      "smoking" => false, 
      "sport" => true, 
      "men" => true
    ); echo('<br>');
//закінчення,типи даних в PHP.

echo "<hr>"; 

//різниця між --- (" "),(' ')
  $m = 100; 
  echo 'test: $m';echo "<br>"; 

  echo "<br>";

  echo "test: $m";

  echo "<hr>"; 
//кінець!

echo "<br>"; echo "<br>";

echo "<hr>"; 


//Конкатенація (об'єднання) рядків в PHP
  $name = "Anton";
  $surmane = "Samarchenko"; 

  //можна так писати,але так довго!
    echo (1); 
    echo $name; 
    echo " "; 
    echo $surmane; 
  //.

  echo "<br>"; echo "<br>";

  //Конкатенація))а це є ліпшим варіантом!
    echo (2); 
    echo $name . ' ' . $surmane; 
  //Конкатенація.
//.

echo "<hr>";

echo "<br>"; echo "<br>";

//математичні операції (+,-,*,/,%)
  echo 10 + 5; echo "<br>";
  echo 15 - 4; echo "<br>";
  echo 5 * 5; echo "<br>";
  echo 100 / 5; echo "<br>";
  echo 1080 % 2; echo "<br>"; 

  $v = 50; 
  $x = 30; 
  echo 'відповідь: ' . $v + $x; echo "<br>";
//.

echo "<br>"; 

//Умова 
  $weather = "облачно";  //сніг,дождь,соняшно,облачно
  if ($weather == "сніг"){
    echo "Погода дуже погана,прохолодна, ліпше нікуди не їхати!";
  }
  if ($weather == "дождь"){
    echo "на вулиці дождь рекомендую бути дома!";
  }
  if ($weather == "соняшно"){
    echo "Погада прекрасна можна виїжати!";
  }
  if ($weather == "облачно"){
    echo "Погода хороша,але візми з собою парасольку!";
  }
//.




?>