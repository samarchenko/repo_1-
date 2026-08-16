

<?php
     // Lesson 9. dynamic connect files.
     $title = "Home";
    // require - its helps you connect other files for example footer or header and "require" give you error and stop all code.
    require_once "block/header.php";
?>
<h1>home</h1>
<?php
    // include - if compare with include and require then include the same but never won't stop code namely show you error and and the rest of the code that works.
    include_once "block/footer.php";

    //require_once, include_once - the same but you can connects only 1.
?>

