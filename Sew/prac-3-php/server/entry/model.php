<?php
/*
 * SEW
 */
function get_entry($entry_id) {
    $db = BlogDB::connect();
    $con = $db->query("select * from entries WHERE id == '$entry_id' ");
    return $con->fetch();
}