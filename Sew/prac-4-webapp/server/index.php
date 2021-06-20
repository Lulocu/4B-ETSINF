<?php
/*
 * SEW
 * @file: index.php
 */

session_start();

include __DIR__ . "/lib/common.php";

// Lógica relacionada con la página

$page_title = "Main page";

// Visualización de la página web

// Cabecera común a todas las páginas
// Espera el título de la página en la variable '$page_title"
include __DIR__ . "/lib/header.php";
?>

    <div class="w3-margin">
        <div class="w3-card w3-container w3-blue-gray">
            <h2>Available blogs</h2>
        </div>

       <?php include "blog/list.php"; ?>
    </div>

<?php
// Pie común a todas las páginas
// Espera el título de la página en la variable '$page_title"
include __DIR__ . "/lib/footer.php";


