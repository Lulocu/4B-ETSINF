<?php

session_start();

include __DIR__ . "/../lib/common.php";
include __DIR__ . "/../blog/model.php";

// Lógica relacionada con la página

$blog_id = $_GET["blog_id"];

$blog = get_blog($blog_id);

if ($blog === false) {
    jump("/index.php", ["errorMessage" => "Invalid blog id!"]);
}

// Visualización de la página web

$page_title = $blog['title'];

// Cabecera común a todas las páginas
// Espera el título de la página en la variable '$page_title"
// Se supone que la página está alojada en un subdirectorio, de ahí el '..' en la ruta.
include __DIR__ . "/../lib/header.php";
?>

    <form action="create.php" method="post">

        <input type="hidden" name="blog_id" value="<?= $blog_id ?>">

        <div class="w3-margin">

            <div class="w3-container w3-brown">
                <h3>New entry</h3>
            </div>

            <div class="w3-container w3-section w3-card w3-pale-yellow">

                <table class="w3-table w3-margin-top">
                    <tr>
                        <th>
                            Title:
                        </th>
                        <td>
                            <input type="text" name="title" size="60" required>
                        </td>
                    </tr>
                    <tr>
                        <th colspan="2">
                            Contents:
                        </th>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <textarea style="width: 100%" name="contents" rows="10" required></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" class="w3-padding w3-right-align">
                            <input class='w3-button w3-small w3-green w3-round' type="submit" name="create" value="Create">
                            &nbsp;
                            <a href='/blog/view.php?blog_id=<?= $blog_id ?>' class='w3-button w3-small w3-red w3-round'>Cancel</a>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </form>

<?php
// Pie común a todas las páginas
// Espera el título de la página en la variable '$page_title"
include __DIR__ . "/../lib/footer.php";
