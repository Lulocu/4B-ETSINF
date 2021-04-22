<?php
/*
 * SEW
 */

session_start();

include __DIR__ . "/../lib/common.php";

include "model.php";

// Lógica relacionada con la página

// Comprobación campos vacios

$user = trim($_POST["user"]);
$password = trim($_POST["password"]);

if ($user == "" || $password == "") {
    jump("login.php", ["errorMessage" => "Some required fields are empty"]);
}

// Comprobación de claves

$profile = check_user($user, $password);

if (!$profile) {
    add_error_message("Wrong credentials!");
    jump("/user/login.php");
    return;
}

// Everything is fine, so proceed with user login

$_SESSION["user"] = $profile;

// Utilizad la función jump() para saltar a la página de destino

jump("/index.php", ["infoMessage" => "User '{$profile['name']}' ({$profile['user']}) successfully logged in"] );