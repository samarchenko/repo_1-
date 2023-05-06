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

//Умова if,else ---якщо,інакше
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
  echo "<br>"; echo "<br>"; 

  $age = 15; 
  if($age < 18){
    echo "тобі сюди не можна!"; 
  }
  if($age >= 18){
    echo "Проходьте!"; 
  }

  echo "<br>"; echo "<br>"; 

  $name1 = "Anton";
  if($name1 == "Anton"){
    echo "Привіт,мій Пане"; 
  }else{
      echo "ти хто?"; 
    }; echo "<br>"; 
//.

echo "<br>"; 

//Оператори порівняння --- " < , > , <= , >= , == , != "
  $age = 18; 
  if($age < 18){
    echo "тобі сюди не можна!"; 
  }
  if($age >= 18){
    echo "Проходьте!"; 
  }

  echo "<br>"; 

  $key = 1000000; 
  if($key != 1000000){
    echo "просте число"; 
  }
  if($key == 1000000){
    echo "не просте число";
  }

  echo "<br>"; echo "<br>"; 

  $name1 = "Oleg";
  if($name1 == "Anton"){
    echo "Привіт,мій Пане"; 
  }else{
      echo "ти хто?"; 
    }; echo "<br>"; 
//.

echo "<br>";echo "<br>";

//Логічні оператори "or,and" --- "або,і"
  $name2 = "oleg";  
  $age2 = 14; 
  if($age2 < 15 and $name2 != "Anton"){
    echo "ти хто?,тобі не можна сюди!"; 
  } 
  else{
    echo "привіт!!!!!"; 
  }

  echo "<br>"; echo "<br>";echo "<br>";


  $rating = 11; 
  if($rating >= 25 and $rating <= 75){   //з командою "and".Якщо всі істини є правдиві то цей код буде виконуватися!
    echo "в тебе хороший рейтинг!"; 
  } else{
    echo "тобі треба більше старатися!"; 
  }

  echo "<hr>"; 
  echo "<br>"; 

  $rating2 = 11; 
  if($rating2 >= 25 or $rating2 <= 75){   //з командою "or". Якщо ходь ОДНА(1)! існина є правдивою,то цей код буде виконуватися!
    echo "в тебе хороший рейтинг!"; 
  } else{
    echo "тобі треба більше старатися!"; 
  }
//.

echo "<br>";echo "<br>";

// Цикли) "for,while,foreach"  ---  "для,поки(тимчасом як),для кожного"
  
  for($i = 0; $i <=10; $i++){    //$i++ --- це то саме як ($i = $i + 1)
    echo "hello world!<br>"; 

  }

  for($p = 1; $p <=10; $p++){
    echo "$p<br>"; 
  }

  echo "<br>";echo "<br>";

  $test = 10; 
  while($test <= 100){
    echo "Тест:".$test."<br>";
    $test++; 
  }

  echo "<br>";echo "<br>"; 

  $name3 = array(
    "Anton",
    "Alex",
    "veronika",
    "Voltaire",
    "Oleg",
    "Vova",
  );                         //as --- як
  foreach($name3 as $value){
    echo $value. "<br>"; 
  }

  echo "<br>";echo "<br>"; 

  $numbers = array(2,3,4,5,6,7,8,9);
  foreach($numbers as $num){
    echo "куб числа " .$num. " : ".($num * $num)."<br>";  
  } 
//.


echo "<br>";echo "<br>"; echo "<hr>"; 


//Функції --- це є просто блок кода,який виконується! 
  function myfunction(){   //() --- "дужки це є аргументи"
    echo "Привіт Антон!"; 
  }
  myfunction(); // --- так,викликається функція! 


  echo "<br>";echo "<br>";


  function get_bigger($a,$b){
    if ($a > $b){
      echo $a. " a > b"; 
    } else{
      echo $b. " a < b"; 
    }
  }
  get_bigger(10,20);
  echo "<br>"; 
  get_bigger(30,20);  


  echo "<br>"; echo "<br>";echo "<hr>"; 


  function get_bigger1($a,$b){   //return --- це повернення коду!
    if($a > $b){
      return $a;
    } else{
      return $b; 
    }
  }

  $bigger = get_bigger1(10,20); 
  echo $bigger; 
  
  echo "<br>";

  $bigger = get_bigger1(30,20); 
  echo $bigger; 
//.


echo "<br>";echo "<br>";echo "<hr>"; 


//Математичні функції
  //1)abs,2)round,3)ceil,4)floor,5)rand,6)min,7)max  --- 1)абс,2)круглий,3)стеля,4)поверх,5)край,6)хв,7)макс(максимально).

    //abs
      echo abs(-5000);//повертає ціле число!
    //.

    echo "<br>";echo "<br>"; 

    //round
      echo round(50.75); //округляє число!

      echo "<br>";

      echo round(50.35); 
    //.

    echo "<br>";echo "<br>";

    //ceil
      echo ceil(60.10);//яке округляє в більшу сторону!

      echo "<br>"; 

      echo ceil(60.99); 
    //.

    echo "<br>";echo "<br>";

    //floor
      echo floor(70.99); //округляє в меншу сторону!
      
      echo "<br>"; 

      echo floor(70.10); 
    //.

    echo "<br>";echo "<br>";

    //rand
      echo rand(0,100);//рандомне число --- Генератор випадкових чисел.

      echo "<br>"; 

      echo rand(0,1000); 
    //.

    echo "<br>";echo "<br>";

    //min
      echo min(4,2,6,9,100,200,49,1,0,0.5,0.2,100000);  //вертає мінімальне число,саме найменше число!

      echo "<br>"; 

      echo min(300, 50,27,59,58380,39934,1000,488329,); 
    //.

    echo "<br>";echo "<br>";

    //max
      echo max(104574,4857439,2391,1,4,7,100,47,347,50,5000000000000,); //виводить саме наймаксимальне число,саме набільше число!

      echo "<br>"; 

      echo max(1,2,3,4,5,6,7,8,9); 
    //.

    echo "<br>";echo "<hr>"; 

    
  //.
//.
?>
