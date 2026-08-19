<?php
ob_start();
// print_r --- usually used that fast checks which data save in arrays. almost the same "echo" a like print
//print_r($_POST);
//$_POST - built in super global variable in php which are associative array. it collects data with web site(<form>) and send web server.


$FirstLastName = $_POST["username"];
$email = $_POST["email"];
$password = $_POST["password"];
$message = $_POST["message"];

if(trim($FirstLastName) == ""){
    echo "Error. Please you need enter name and last name";
} else if(strlen(trim($FirstLastName)) <= 1){
    echo "Error. Please you need enter valid name(more 4 letters)";
} else if(trim($email) == "" || trim($password) == "" || trim($message) == ""){
    echo "Error. not all datas presents ";
} else {
    $_POST["password"] = md5($password);
    echo "<h1>all datas</h1>";
    foreach($_POST as $key => $value){
        echo "<p> $key: $value</p>";
    }

    ob_end_clean();
    header('Location: about.php');
    exit;
}
?>
