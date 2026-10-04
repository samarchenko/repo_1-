<?php

$title = "Contacts2";
include "block/header.php";

if(isset($_SESSION['username'])){
    $username = $_SESSION['username'];
} else{
    $username = "";
}

if(isset($_SESSION['useremail'])){
    $useremail = $_SESSION['useremail'];
} else{
    $useremail = "";
}

if(isset($_SESSION['subject'])){
    $subject = $_SESSION['subject'];
} else{
    $subject = "";
}

if(isset($_SESSION['message'])){
    $message = $_SESSION['message'];
} else{
    $message = "";
}



// error checking

if(isset($_SESSION['error_username'])){
    $error_username = $_SESSION['error_username'];
} else{
    $error_username = "";
}

if(isset($_SESSION['error_useremail'])){
    $error_useremail = $_SESSION['error_useremail'];
} else{
    $error_useremail = "";
}

if(isset($_SESSION['error_subject'])){
    $error_subject = $_SESSION['error_subject'];
} else{
    $error_subject = "";
}

if(isset($_SESSION['error_message'])){
    $error_message = $_SESSION['error_message'];
} else{
    $error_message = "";
}


?>

<h1><?=$title?></h1>

<form action="check_contact.php" method="post">
    <input type="text" name="username" value="<?=$username?>" placeholder="enter your name" class="form-control"><br>
    <div class="text-danger"><?=$error_username?></div>

    <input type="email" name="useremail" value="<?=$useremail?>" placeholder="enter your email" class="form-control"><br>
    <div class="text-danger"><?=$error_useremail?></div>

    <input type="text" name="subject" value="<?=$subject?>" placeholder="enter your topic" class="form-control"><br>
    <div class="text-danger"><?=$error_subject?></div>

    <textarea name="message" placeholder="enter your message" class="form-control"><?=$message?></textarea><br>
    <div class="text-danger"><?=$error_message?></div>
    
    <button type="submit" class="btn btn-success">Send</button>
</form>
<br>

<?php
require "block/footer.php";
?>
