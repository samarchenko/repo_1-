<?php
session_start();

// lesson 18. Coolies and session in php.

// Cookies
$user_name = "Alex";
$user_name_2 = "CJ";
setcookie("user_name", $user_name, time() + 1800);
print_r($_COOKIE);
echo "<br>". $_COOKIE["user_name"]. "<br>";

echo "<br><br>";

// Session
$_SESSION['user_name_2'] = $user_name_2;
print_r($_SESSION);
echo "<br>".$_SESSION["user_name_2"]."<br>";

unset($_SESSION['user_name_2']);
print_r($_SESSION);
echo "<br>".$_SESSION["user_name_2"]."<br>";
session_destroy();



?>

>