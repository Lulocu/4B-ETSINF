<?php
/*
 * SEW
 */

session_start();

include __DIR__ . "/../lib/common.php";
include __DIR__ . "/../blog/model.php";

include "model.php";

// Lógica relacionada con la página

// Comprobación campos vacios

$user = trim($_POST["user"]);
$name = trim($_POST["name"]);
$title = trim($_POST["title"]);

if ($user == "" || $name == "" || $title == "") {
    jump("register.php", ["errorMessage" => "Some required fields are empty"]);
}

// Comprobación de claves

$password = $_POST["password"];
$password2 = $_POST["password2"];

if ($password != trim($password)) {
    jump("register.php", ["errorMessage" => "Password contains outer whitespaces"]);
}

if ($password != $password2) {
    jump("register.php", ["errorMessage" => "Passwords have to identical"]);
}

// Comprobación usuario único

if (user_exists($user)) {
    jump("register.php", ["errorMessage" => "User '{$user}' already exists"]);
}

// Everything is fine, so proceed with user creation

$id = create_user($user, $name, $password);

create_blog($title, $id);

$_SESSION["user"] = compact("id", "user", "name");

// Utilizad la función jump() para saltar a la página de destino

jump("/index.php", ["infoMessage" => "User '{$user}' successfully registerred"]);
