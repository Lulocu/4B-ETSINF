<?php

session_start();

include __DIR__ . "/../lib/common.php";

include "model.php";

$entry_id = $_GET["entry_id"];
$comment_id = $_GET["comment_id"];

// Nothing is being checked

delete_comment($comment_id);

// Utilizad la función jump() para saltar a la página de destino

jump("/entry/view.php", ["entry_id" => $entry_id,
    "infoMessage" => "Comment successfully deleted"]);