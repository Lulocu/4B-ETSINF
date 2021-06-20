<?php

include "BlogDB.php";

function jump($url, array $query = [])
{
    if (count($query) > 0) {
        $sep = (strpos($url, "?") === false) ? "?" : "&";
        $url .= $sep . http_build_query($query, "flag_");
    }

    echo "<html><body onload=\"window.location ='{$url}'\"></body></html>";
    exit;
}

function show_messages()
{
    $message_types = [
        "error" => "red",
        "info" => "blue",
    ];

    $messages = [];
    if (isset($_SESSION["message"])) {
        $messages = $_SESSION["message"];
    }

    if (isset($_GET["infoMessage"])) {
        $messages["info"][] = $_GET["infoMessage"];
    }

    if (isset($_GET["errorMessage"])) {
        $messages["error"][] = $_GET["errorMessage"];
    }

    foreach ($message_types as $type => $style) {
        if (isset($messages[$type])) {
            foreach ($messages[$type] as $message) {
                echo "<div class='w3-panel w3-display-container w3-leftbar w3-border-{$style} w3-pale-{$style} w3-card-4'>";
                echo "  <span onclick=\"this.parentElement.style.display='none'\" class=\"w3-button w3-tiny w3-display-topright\">X</span>";
                echo "  <p>{$message}</p>";
                echo "</div>";
            }
        }
    }

    unset($_SESSION["message"]);
}

function add_error_message($text)
{
    $_SESSION["message"]["error"][] = $text;
}

function add_info_message($text)
{
    $_SESSION["message"]["info"][] = $text;
}

function show_date($timestamp)
{
    return strftime("%F %T", $timestamp);
}