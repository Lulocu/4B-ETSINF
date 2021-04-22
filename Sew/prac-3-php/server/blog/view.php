<?php
/*
 * SEW
 */

session_start();

include __DIR__ . "/../lib/common.php";

// Lógica relacionada con la página

include __DIR__ . "/model.php";
include __DIR__ . "/../entry/model.php";

$blog_id = $_GET["blog_id"];

$blog = get_blog($blog_id);

if ($blog === false) {
    add_error_message("Invalid blog id!");
    jump("/index.php");
}

$entries = list_entries($blog_id);

// Visualización de la página web

$page_title = $blog['title'];

// Cabecera común a todas las páginas
// Espera el título de la página en la variable '$page_title"
// Se supone que la página está alojada en un subdirectorio, de ahí el '..' en la ruta.
include __DIR__ . "/../lib/header.php";
?>

    <div class="w3-margin">
        <div class="w3-container w3-brown">
            <h2><?= $blog['title'] ?></h2>
        </div>

        <?php
        if (count($entries) == 0) {
            add_info_message("There are no entries in this blog!");
        } else {
            foreach ($entries as $entry) {
                // entry/show.php uses $blog & $entry
                include __DIR__ . "/../entry/show.php";
            }
        }

        if (isset($_SESSION["user"]) && $_SESSION["user"]["user_id"] == $blog["user_id"]) {
            ?>
            <div class="w3-container w3-section">
                <a href='/entry/add.php?blog_id=<?= $blog_id ?>' class='w3-button w3-small w3-green w3-round w3-right'>Add entry</a>
            </div>
            <?php
        }
        ?>

    </div>

<?php
// Pie común a todas las páginas
// Espera el título de la página en la variable '$page_title"
include __DIR__ . "/../lib/footer.php";
