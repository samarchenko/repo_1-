

<?php
     // Lesson 9. dynamic connect files.
     $title = "Home";
    // require - its helps you connect other files for example footer or header and if "require" give you error and stop all code.
    require_once "block/header.php";
?>
<h1>home</h1>

<?php
// date_default_timezone_set - function which can give you choice timezone
date_default_timezone_set("Europe/Warsaw");
echo date("d-M-Y  H:i:s")."<br><br>";


// time - return a large number when a created Unix(in seconds)
echo time()."<br><br>";

//strtotime - you can add or subtract hour,days, minutes,month.
echo date("d-M-Y  H:i:s", strtotime("+1 hour"))."<br>";

?>

<?php
    // include - if compare with include and require then include the same but never won't stop code namely show you error and  the rest of the code that works.
    include_once "block/footer.php";

    //require_once, include_once - the same but you can connects only 1.
?>

