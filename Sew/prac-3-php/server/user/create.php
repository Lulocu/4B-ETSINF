<?php
/*
 * SEW
 */

session_start();

include __DIR__ . "/../lib/common.php";
include __DIR__ . "/../user/model.php";
include __DIR__ . "/../blog/model.php";
$error = false;
$text = "Error: ";

// Lógica relacionada con la página
$_POST = array_map("trim", $_POST);
if ($_POST[user]  == '') {
    $text .= "user vacio ";
    $error = true;
}
if ($_POST[name]  == '') {
    $text .= "name vacio ";
    $error = true;
}
if ($_POST[title]  == '') {
    $text .= "title vacio ";
    $error = true;
}
if ($_POST[password]  == '') {
    $text .= "password vacio ";
    $error = true;
}
if ($_POST[password2]  == '') {
    $text .= "password2 vacio ";
    $error = true;
}
if ($_POST[password] != $_POST[password2]) {
    $text .= "contraseñas diferentes ";
    $error = true;
}
if (user_exists($_POST[user])){
    $text .= "el usuario ya existe ";
    $error = true;
}

// ...

// Utilizad la función jump() para saltar a la página de destino
$error = false;
if ($error == false) {
    $ejem = create_user($_POST[user],$_POST[name],$_POST[password]);
    create_blog($_POST[title],$ejem);
    jump("/index.php");
} else {
    add_error_message($text);
    jump("register.php");

}