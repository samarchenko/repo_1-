
<?php
//php - Hypertext Preprocessor(гіпертекстовий препроцесор).in the past Personal Home Page Tools(скриптова мова програмування).<br>


// it's my first code in php.
// echo - it's  displays what you write in (" ") or (' ')
echo "Hello world! <br>";

echo "<hr>". strtoupper("Lesson 1. variable and type data")."<br><br>";

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

echo "<hr>". strtoupper("Lesson 2 mathematical operations and  built-in functions"). "<br><br>";

// Lesson 2 mathematical operations and  built-in functions

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

echo "<hr>". strtoupper("Lesson 3. line operations  in php")."<br><br>";

// Lesson 3. line operations  in php

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

//md5 - this function make hidden text,password.
echo md5("3123908wwqeiirew");
//.

echo "<hr>". strtoupper("Lesson 4. conditional constructions if,if-else,else.logical operators")."<br><br>";

// Lesson 4. conditional constructions if,if-else,else.logical operators

//if - it's conditional operator for example if condition is true he performs block code.
// ==  -  check is equal to each other
// > - symbol check or more.
// < - the less than symbol
// >= - is more equal to
// <= - less is equal to
// != -checking if not equal
$a = "hello1";
$b = strlen($a);
if($b == 5){
    echo "lenght: $b"."<br><br><br>";
} else if($a == "hello1"){
    echo " value: $a". "<br><br><br>";
} else {
    echo "error"."<br><br><br>";
}

/* else if - the same as (if). but it as extra to (if), always in the middle between (if) and (else).
and is performed after (if) if (if) will be not correct(false) and if (if) not correct then next checking  will be for (else).*/
//else - will be performs if others (if, else if) will be false.

$q = 6;
$justSrs = "Hello!!";
$hasDog = true;
// || - or
// && - and
if($justSrs == "Hi" || $hasDog == true){
    echo "yes";
    if($q > 2) {}
    echo " num is bigger than 2"."<br>";
} else if($justSrs == "Hello"){
    echo "string is hello"."<br>";
} else if ($justSrs == "Hello!"){
    echo "string is hello!"."<br>";
} else if($q  == 6){
    echo "a is 6";
}else {
    echo "error";
}
//.

echo "<hr>". strtoupper("Lesson 5 operator Switch-case.")."<br><br>";

// Lesson 5 operator Switch-case.

//switch - always checking  only on equality(==).in switch you can't check on symbol (<, >, <=,  >=, !=)
//(default) -  the same as (else)
$n = 40;
switch ($n){
    case 5:
        echo "num is 5";
        break;
    case 15:
        echo "num is 15";
        break;
    case 20:
        echo "num is 20";
        break;
    case 30:
        echo "num is 30";
        break;
    case 40:
        echo "num is 40"."<br>";
        break;
    case 50:
        echo "num is 50";
        break;
    default:
        echo "error";
        break;
}
//.

echo "<hr>". strtoupper("Lesson 6. Arrays datas.one-dimensional and multidimensional.")."<br><br>";

// Lesson 6. Arrays datas.one-dimensional and multidimensional.

// arrays - its special variable. which can keep a lot of value and datas in just one variable.
// it's first option how you can create array.
$array = array(5, 6, 2, 7, 9, 10, 546, 23,);
$array[0] = 100;
echo "index 3:  ". $array[3]."<br>";
echo "chenge value in index 0 it's: ". $array[0]. "<br>";

// it's second.
$arr = [45, 0.48, "hello", true, [0, 6]];
$arr[1] = "how are you";
echo $arr[1]. "<br>";

//Associative array - if compare with normal array. He differs you can create unique keys(index or id Something this) and you don't need  to consult by index.
$list = ["age" => 50, "name" => "Alex", "hobby" => "Boks"];
echo $list["name"]."<br>";

//multidimensional array  - if say just. you create array in array  namely value it is array.
$matrix = [
    [3, 0.4, 10, 8],
    ["hello", true, [9, "world", 0.5]]
];
echo $matrix[1][0]."<br>";  // hello
echo $matrix[1][2][1]; // world
//.

echo "<hr>". strtoupper("Lesson 7. loops and loop operators.")."<br><br>";

// Lesson 7. loops(for, while, do while) and loop operators.

/* it's first option how can write loops. he working very easy and simply. In brackets we enter 1)variable, 2)condition(namely when loop finish),
3)increase in number(namely  iteration) */
for ($i = 0; $i < 10; $i++){
   echo "(for)element: $i". "<br>";
}

echo "<br>";

// it's second option.if compare with (for) and (while) are the same but in brackets we enter only condition.
$i_2 = 0;
while($i_2 < 10){
    echo "(while) element: $i_2<br>";
    $i_2++;
}

echo "<br>";

// it's third option. its feature is that the loop is executed at least once
$a = 100;
do {
    echo "(do while) element: $a<br>";
    $a--;
} while($a < 10);

echo "<br><br>";

// loop operators.
// break - exit with loop
for($el = 100; $el > 10; $el /= 2){
    if ($el <= 15){
        break;
    }

    // continue - misses iteration namely one circle passes into another.
    if ($el % 2 == 0){
        continue;
    }

    echo "el: $el<br>";
}

echo "<br><br><br>";

$list = [4, 6, 2, 9, "hello", 5.6, true];
for($q = 0; $q < count($list); $q++){
    echo "$q: $list[$q]<br>";
}

echo "<br><br>";

$list_2 = ["age" => 27, "name" => "Angriy", "hobby" => "video game"];
foreach($list_2 as $key => $value){
    echo "$key: $value<br>";
}

echo "<br><br>";

$list_3 = [1, 5, 3, 8, 3, 7, 5];
foreach($list_3 as $key => $value){
    echo "$key: $value<br>";
}
//.

echo "<hr>". strtoupper("Lesson 8. function.")."<br><br>";

// Lesson 8. function.

// it's simple function and function it's block code  which perform some code(code inscribed in the middle function) for in order not to rewrite code.
function fun($word){
    echo "$word <br><br>";
}

fun("it's function");
fun(10);
$str = "hello world";
fun($str);


echo "<br><br>";
function info($string){
    echo "$string <br>";
}
function summary($x, $y){
    $res = $x + $y;
    info($res);
    // returns the result of the function and immediately stops its execution.
    return $res;

}
$res1 = summary(50, 10);
$res2 = summary(20, 10);

info($res1);
info($res2);

if ($res1 > $res2){
    echo "max number: $res1 <br>";
} else if ($res1 < $res2){
    echo "max number $res2<br>";
}

echo "<br><br><br><br>";

// practice
$intArrayList_1 = [1, 6, 2, 4, 8];
$intArrayList_2 = [5, 2, 3,];


function countValueArrays($name_array){
    $sum_value = 0;
    for($i = 0; $i < count($name_array); $i++){
        $sum_value = $sum_value + $name_array[$i];
    }
    echo "Сума значення масиву: $sum_value<br>";
}

countValueArrays($intArrayList_1);
countValueArrays($intArrayList_2);

echo "<br><br><br>";

// the area is beautiful
function sameFunction(){
    // global - basic variables inside function are local and variables outside are public but "global" breaks this limitation.
    global $x;
    $x = 10;
}
$x = 0;
sameFunction();
echo $x."<br>";

function click(){
    $count = 0;
    $count++;
    echo $count."<br>";
}

click();
click();
click();

echo "<br><br>";

function click2(){
    // static -
    static $count = 0;
    $count++;
    echo $count."<br>";
}

click2();
click2();
click2();
//.

echo "<hr>". strtoupper("Lesson 9. dynamic connect files.")."<br><br>";






?>
