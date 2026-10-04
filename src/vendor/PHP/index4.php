<?php

// lesson 16. function phpinfo() and array $_SERVER

//phpinfo(); - gives you information about full configuration

//echo "<pre>".print_r($_SERVER, true). "</pre><br>";

//echo $_SERVER['HTTPS']."<br>";

echo $_SERVER["HTTP_HOST"]. ' - ' . $_SERVER["REQUEST_URI"]. '<br>';
echo $_SERVER['HTTP_USER_AGENT']."<br>"


?>

