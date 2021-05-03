<?php
/*
 * SEW
 * @file: index.php
 */

session_start();

include __DIR__ . "/lib/common.php";

// Lógica relacionada con la página

$page_title = "Error page";

// Visualización de la página web

// Cabecera común a todas las páginas
// Espera el título de la página en la variable '$page_title"
include __DIR__ . "/lib/header.php";

// Pie común a todas las páginas
// Espera el título de la página en la variable '$page_title"
include __DIR__ . "/lib/footer.php";


