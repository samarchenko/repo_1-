<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>#9 PHP. Швидкий старт з нуля. Додаємо елемент масива, POST/GET, Суперглобальні масиви</title>
</head>
<body>
    <a href="https://youtu.be/FcIJRgCg3bI?si=L9sJTEpCf2WGnbNE">Повний урок POST/GET</a>
    <br>
    <form method="POST" action="/">
        Ваше ім'я: <input type="text" name="name">
        <input type="submit">
    </form> 
    <?php
     if($_SERVER['REQUEST_METHOD'] == 'POST'){
        var_dump($_POST);
        echo ("<br>");
        echo ("<br>");
        echo("Привіт, " . $_POST['name']);
     }
    ?>
</body>
</html>