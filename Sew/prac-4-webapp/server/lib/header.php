<!DOCTYPE html>
<html>

<title>Blogealo! <?= $page_title ?? "" ?></title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="/css/w3.css">
<link rel="stylesheet" href="/css/sew.css">

<body>

<div class="sew-main">
    <header class="w3-cell-row">
        <div class="w3-cell w3-indigo w3-center w3-padding" style="width: 10%">
            <h1>Blogealo!</h1>
        </div>
        <div class="w3-cell w3-blue-grey w3-padding">
            <h2><?= $page_title ?? "" ?></h2>
        </div>
        <div class="w3-cell w3-blue-grey w3-center" style="width: 10%">
            <img src="/images/logo-web-security.png" height="64"/>
        </div>
    </header>
    <nav class="w3-container w3-light-gray w3-right-align w3-padding">
        <?php
        echo "<span class='w3-left w3-small'>";
        echo "<a href='/index.php' class='w3-button w3-round'>Home</a>\n";

        if (isset($path) && is_array($path)) {
            foreach ($path as $link => $label) {
                echo "::<a href='{$link}' class='w3-button w3-round'>{$label}</a>\n";
            }
        }
        echo "</span>";

        if (isset($_SESSION["user"])) {
            echo "<span>{$_SESSION["user"]["name"]}</span>\n";
            echo "<a href='/user/logout.php' class='w3-button w3-small w3-black w3-round'>Logout</a>\n";
        } else {
            if (dirname($_SERVER["SCRIPT_NAME"]) != "/user") {
                echo "<a href='/user/login.php' class='w3-button w3-small w3-black w3-round'>Login</a>\n";
                echo "<a href='/user/register.php' class='w3-button w3-small w3-black w3-round'>Register</a>\n";
            }
        }
        ?>
    </nav>

    <div class="sew-contents">

        <?php show_messages(); ?>
