<?php

session_start();

include __DIR__ . "/../lib/common.php";

include "model.php";

$entry_id = $_POST["entry_id"];
$user_id = $_POST["user_id"];
$contents = trim($_POST["contents"]);

if ($contents == "") {
    jump("add.php", ["errorMessage" => "Some required fields are empty"]);
}

// Everything is fine, so proceed with entry creation

create_comment($entry_id, $user_id, $contents);

// Utilizad la función jump() para saltar a la página de destino

jump("/entry/view.php", ["entry_id" => $entry_id,
    "infoMessage" => "New entry successfully created"]);