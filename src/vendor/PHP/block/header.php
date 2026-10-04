<?php

if(isset($_GET[":"])) {
    $link = explode(":",$_SERVER["REQUEST_URI"]);
    $redirect = "http://" . $_SERVER["HTTP_HOST"].$link[0];

    header('HTTP/1.1 301 Moved Permanently');
    header('Location: '. $redirect);
    exit;
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <title>
        <?php
        echo $title;
        ?>
    </title>
    <style>
        body {
            background: #333;
            color: white;
            margin: 20px;
        }
    </style>
</head>
<body>
<header>
    <a href="index2.php">Home</a> | <a href="about.php">About</a> | <a href="contacts.php">Contacts</a> | <a href="contacts2.php">Contacts2</a>
</header>