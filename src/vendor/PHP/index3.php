<?php

// lesson 14. built in functions  in php.

$array_list = [1, 4, 7, 9, 21, "qwerty"];

// print_r - gives you information about value variable in simple look, for easy reading. but always used for test code, not never when you complete project and you want drop in internet
print_r($array_list);

echo "<br><br>";

// var_dump - give you information  about value(some variable, array, etc.) also data types.
var_dump($array_list);

echo "<br><br><br>";

$array_list_2 = [1,6,2,"qwerty",5.5,10];

// unset - this function delete specified variable or index array.

unset($array_list_2[3]);
// you can see index 3 don't have,but if you want that all was in seriatim. You can use function array_values()
// array_values - goes through the array and give you the order gradually indexes
$array_list_2 = array_values($array_list_2);

// rsort - this function sort from larger to smaller
rsort($array_list_2);

// shuffle - in random sort
shuffle($array_list_2);

print_r($array_list_2);

echo "<br><br>";

// in_array - this function check does it have value in some array
if(in_array(10, $array_list_2)){
    echo "found<br>";
} else {
    echo "not found<br>";
}

// array_slice - this function deletes all value but keep which you wrote in brackets
$new_array_list_2 = array_slice($array_list_2, 0, count($array_list_2) - 2 );
// count - this function count elements in array or object
print_r($new_array_list_2);
echo "<br>";

$arr1 = [4,2,6];
$arr2 = [1,10,8];
// array_merge - this function help you merge others arrays
$arr3 = array_merge($arr1, $arr2,);
print_r($arr3);
echo "<br><br>";

$x = "10";
// gettype - gives  you information which data type in variable
echo gettype($x)."<br>";

// is_numeric - check variable is equal to number value
echo is_numeric($x)."<br>";

//is_integer - check variable is equal to data type int
if(is_integer($x) == false){
    echo "is not integer<br>";
}

/*

- is_float()
- is_bool()
- is_double()

*/

$word = "string";
//strpos - check value(str) does it have word or symbol
echo strpos($word, "i"). "<br><br>";

$just_name = "Jon, Carl, Majk";
// explode - splits a string into an array using a special separator.
$arr_just_name = explode(",", $just_name);
print_r($arr_just_name);
echo "<br><br>";

// implode - unites value array in one string 
echo implode(" | ", $arr_just_name );
echo "<br><br>";



?>

