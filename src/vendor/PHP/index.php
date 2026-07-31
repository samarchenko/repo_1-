
<?php
//php - Hypertext Preprocessor(гіпертекстовий препроцесор).in the past Personal Home Page Tools(скриптова мова програмування).<br>


// it's my first code in php.
// echo - it's  displays what you write in (" ") or (' ')
echo "Hello world! <br>";

// Lesson 1. variable and type data

// (\") - for wha? because compiler thik about it's closing paw(") and you need write \ so that he realise this as comment in code
echo " як що нам треба використвовувати лапки подвійні(\")<br>";

echo "<br>" ;

//($) - variable which keeps data  for example nubmers, names, and so on
$number = 5;
// (.) full stop in php it's the same (+). just brings together
echo $number."<br><br>";

$num = 0;
$word = "variable: ";
$bool = true;
echo $word. $num,$number. "<br> <br>";

/*
  int - integer
  flot - 0.5
  string - text
  boolen - true, false
*/

//$number2 - it's not int  because written 10 in ("") therefore type data it's str.
$nymber2 = "10";
echo $number + $nymber2."<br><br>";

// how look great option but you can write without (" "):
$number2_better = "10";
// intval - converts in integer
echo $number + intval($number2_better)."<br><br>";

// Constant - it's the same variable but you can't cheage many times
const My_age = 100;
echo My_age."<br><br>";
//.

// lesson 2 mathematical operations and  built-in fductions

$x = 10;
$y = 20;

echo "plus(+): ". $x + $y. "<br>";
echo "minus(-): ". $x - $y."<br>";
echo "multiplication(*): ".$x * $y."<br>";
echo "division(/): ".$x / $y."<br>";
echo $x % $y."<br>";

// the same if i'm wrote $x = $x + 10;
$x += 10;
$y -= 5; // $y = $y - 5;

// if you need plus or minus only one you can write this:
$x++; // $x += 1; or $x = x + 1;
$y--; // $y -= 1; or $y = $y - 1;

echo "x: ". $x. "<br>";
echo "y: ". $y. "<br>";

echo "pi = ". M_PI ."<br>";
echo "e = " . M_E ."<br>";

// module |-22| = 22;
echo abs(-22)."<br>";

//rounds up to the next whole number
echo "ceil: ".  ceil(0.33).",<br>";

// rounds down to the nearest whole number
echo "floor: ". floor(0.89).",<br>";

//rounds to the nearest number
echo "round: ". round(0.57)."<br>";

// mt_rand - it's random choice
$rand  = mt_rand(1, 20);
echo "randomly: ". $rand."<br>";

echo "max nubmer: ". max(1, 2, 108, 32, 68, 78,)."<br>";
echo "min number: ". min(0, 2, 56, 78, 102, 54, -1, 0, -2, 9, 0.99, -3, -10)."<br><br>";
//.

// Lesson 2. line operations  in php

// it's first option how you can write
$text = "hello";
echo "value: ".$text ."<br>";

//and it's second option.but  this lifehack you need use only ("") and with ('') will not working.
//if compare with (" ") and (' ') then (" ") will be keeps more memory then (' ').
$text_2 = "world";
echo "value: $text_2"."<br><br>";

//strlen - it's built in function in php and can count length word or sentence
$lenght = strlen($text);
echo "lenght: $lenght"."<br>";

// trim - takes away  spaces. it's function great use with users, witch need enter email and just deleted gap.
$text_str = "      qwerty     ";
echo trim($text_str). "qwerty2"."<br>";

//strtoupper - this function make text a big.
echo strtoupper("qgegnrke")."<br>";

//strtolower - vice versa. make just normal size letter
echo strtolower("uerreEWUIHFefwifhwFUE")."<br>";

//md5 - this function make hidden password
echo md5("3123908wwqeiirew");
//.








?>

