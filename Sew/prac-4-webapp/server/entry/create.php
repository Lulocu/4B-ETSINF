<?php

session_start();

include __DIR__ . "/../lib/common.php";

include "model.php";

$blog_id = $_POST["blog_id"];
$title = trim($_POST["title"]);
$contents = trim($_POST["contents"]);

if ($title == "" || $contents == "") {
    jump("add.php", ["errorMessage" => "Some required fields are empty"]);
}

// Everything is fine, so proceed with entry creation

create_entry($title, $blog_id, $contents);

// Utilizad la función jump() para saltar a la página de destino

jump("/blog/view.php", ["blog_id" => $blog_id,
    "infoMessage" => "New entry successfully created"]);