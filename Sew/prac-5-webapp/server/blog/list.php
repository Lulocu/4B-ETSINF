<?php
/*
 * SEW
 * @file: list.php
 * @author: ssaez
 */

include "model.php";

$list = list_blogs();

?>

<table class="w3-card w3-table w3-bordered w3-section">
    <tr class="w3-green">
        <th>Title</th>
        <th>Author</th>
        <th>Date</th>
    </tr>

    <?php

    foreach ($list as $blog) {
        echo "<tr>\n";
        echo "  <td class=\"w3-container w3-hover-pale-green sew-cursor-pointer\" onclick=\"window.location = '/blog/view.php?blog_id={$blog['blog_id']}'\">{$blog['title']}</td>\n";
        echo "  <td>{$blog['author']}</td>\n";
        echo "  <td>". show_date($blog['created_at']) . "</td>\n";
        echo "</tr>\n";
    }
    ?>
</table>

<br>