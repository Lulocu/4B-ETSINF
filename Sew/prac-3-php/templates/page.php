<?php
/*
 * SEW
 */

session_start();

include __DIR__ . "/../lib/common.php";

// Lógica relacionada con la página

// ...

// Visualización de la página web

// Cabecera común a todas las páginas
// Espera el título de la página en la variable '$page_title"
// Se supone que la página está alojada en un subdirectorio, de ahí el '..' en la ruta.
include __DIR__ . "/../lib/header.php";
?>

    <!-- Contenidos -->

<?php
// Pie común a todas las páginas
// Espera el título de la página en la variable '$page_title"
include __DIR__ . "/../lib/footer.php";
