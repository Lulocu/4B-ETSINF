<?php
/*
 * SEW
 * @file: logout.php
 * @author: ssaez
 */

session_start();

include __DIR__ . "/../lib/common.php";

if (isset($_SESSION['user'])) {
    $name = $_SESSION['user']['name'];
    session_destroy();
    session_start();
    add_info_message("User '{$name}' logged out!");
}

jump("/index.php");