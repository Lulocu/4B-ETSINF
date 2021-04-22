<?php
/*
 * SEW
 */

session_start();

include __DIR__ . "/../lib/common.php";
include __DIR__ . "/../user/model.php";


$_POST = array_map("trim", $_POST);
$aux = check_user($_POST[user],$_POST[password]);
if ($aux == false) {
    add_error_message("ERROR: credenciales incorrectas.");
    jump("login.php");
} else{
    $_SESION['user'] = $aux;
    jump("/index.php");
}

// Lógica relacionada con la página

// ...

// Utilizad la función jump() para saltar a la página de destino