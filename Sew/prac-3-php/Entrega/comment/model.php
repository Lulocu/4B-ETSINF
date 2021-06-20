<?php
//require '../entry/model.php';
/*
 * SEW
 */
function list_comments($entry_id) {
    //$ent = get_entry($entry_id);
    $db = BlogDB::connect();
    $con = $db->query("select * from comments WHERE entry_id == '$entry_id' ");
    return $con->fetchAll();
}