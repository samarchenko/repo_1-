<?php

session_start();

unset($_SESSION["username"]);
unset($_SESSION["useremail"]);
unset($_SESSION["subject"]);
unset($_SESSION["message"]);

unset($_SESSION["error_username"]);
unset($_SESSION["error_useremail"]);
unset($_SESSION["error_subject"]);
unset($_SESSION["error_message"]);






function redirect(){
    header('Location: contacts2.php');
    exit;
}

$username = htmlspecialchars(trim($_POST['username']));
$useremail = htmlspecialchars(trim($_POST['useremail']));
$subject = htmlspecialchars(trim($_POST['subject']));
$message = htmlspecialchars(trim($_POST['message']));

$_SESSION['username'] = $username;
$_SESSION['useremail'] = $useremail;
$_SESSION['subject'] = $subject;
$_SESSION['message'] = $message;

if(strlen($username) <= 1){
    $_SESSION['error_username'] = "Ведіть правильне ім'я";
    redirect();
}
else if(strlen($useremail) <= 5 || strpos($useremail, '@') == false) {
    $_SESSION['error_useremail'] = 'Ведіть коректний email';
    redirect();
}
else if(strlen($subject) <= 5) {
    $_SESSION['error_subject'] = 'ведіть правильну тему';
    redirect();
}
else if(strlen($message) <= 10) {
    $_SESSION['error_message'] = 'вудіть правильне повідомлення';
    redirect();
}


?>

