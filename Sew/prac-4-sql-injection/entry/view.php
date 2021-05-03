<?php
/*
 * SEW
 */

session_start();

include __DIR__ . "/../lib/common.php";

// Lógica relacionada con la página

include __DIR__ . "/model.php";
include __DIR__ . "/../comment/model.php";
include __DIR__ . "/../blog/model.php";

//$entry_id = $_GET["entry_id"];
$entry_id = filter_input(INPUT_GET, 'entry_id', FILTER_VALIDATE_INT);
if (!$entry_id) {
    jump("/error.php", ["errorMessage" => "Invalid entry identifier"]);
}

$entry = get_entry($entry_id);
if ($entry === false) {
    add_error_message("Invalid entry id!");
    jump("/index.php");
}

$blog_id = $entry["blog_id"];

$blog = get_blog($blog_id);
if ($blog === false) {
    add_error_message("Invalid blog id!");
    jump("/index.php");
}

$comments = list_comments($entry_id);

// Path
$path = [
    "/blog/view.php?blog_id={$blog_id}" => "Blog",
];

// Visualización de la página web

$page_title = $blog['title'];

// Cabecera común a todas las páginas
// Espera el título de la página en la variable '$page_title"
// Se supone que la página está alojada en un subdirectorio, de ahí el '..' en la ruta.
include __DIR__ . "/../lib/header.php";
?>

    <div class="w3-card w3-margin w3-section w3-sand">

        <div class="w3-container w3-brown">
            <h2><?= $entry['title'] ?></h2>
        </div>

        <div class="w3-container">
            <p><?= $entry['contents'] ?></p>

            <div class="w3-container w3-small">
                <p>
                    <?= $blog['author'] ?>
                    <span class="w3-right"><?= show_date($entry['created_at']); ?></span>
                </p>
            </div>
        </div>

    </div>

<?php

if (count($comments) == 0) {
    include __DIR__ . "/../comment/none.php";
} else {
    foreach ($comments as $comment) {
        // Include comment/show.php uses $comment
        include __DIR__ . "/../comment/show.php";
    }
}

if (isset($_SESSION["user"]) && $_SESSION["user"]["user_id"] != $blog["user_id"]) {
    ?>
    <div class="w3-container w3-section">
        <a href='/comment/add.php?entry_id=<?= $entry_id ?>' class='w3-button w3-small w3-green w3-round w3-right'>Add
            comment</a>
    </div>
<?php } ?>

<?php
// Pie común a todas las páginas
// Espera el título de la página en la variable '$page_title"
include __DIR__ . "/../lib/footer.php";
