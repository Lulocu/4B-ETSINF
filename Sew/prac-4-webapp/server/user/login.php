<?php
/*
 * SEW
 */

session_start();

include __DIR__ . "/../lib/common.php";

// Lógica relacionada con la página

$page_title = "User login";

// Visualización de la página web

// Cabecera común a todas las páginas
// Espera el título de la página en la variable '$page_title"
// Se supone que la página está alojada en un subdirectorio, de ahí el '..' en la ruta.
include __DIR__ . "/../lib/header.php";
?>

    <form action="validate.php" method="post">

        <div class="w3-container w3-card w3-pale-yellow w3-margin">
            <table class="w3-table w3-margin-top">
                <tr>
                    <th width="10%">
                        User:
                    </th>
                    <td>
                        <input type="text" name="user" required>
                    </td>
                </tr>
                <tr>
                    <th>
                        Password:
                    </th>
                    <td>
                        <input type="password" name="password" required>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="w3-right-align">
                        <input class='w3-button w3-small w3-green w3-round' type="submit" name="login" value="Login">
                        &nbsp;
                        <a href='/index.php' class='w3-button w3-small w3-red w3-round'>Cancel</a>
                    </td>
                </tr>
            </table>
        </div>

    </form>

<?php
// Pie común a todas las páginas
// Espera el título de la página en la variable '$page_title"
include __DIR__ . "/../lib/footer.php";
