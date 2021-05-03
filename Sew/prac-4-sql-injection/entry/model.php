<?php
/*
 * SEW
 * @file: model.php
 * @author: ssaez
 */

function create_entry($title, $blog_id, $contents)
{
    $db = BlogDB::connect();

    $timestamp = time();

    $query = "insert into entries (id, title, blog_id, contents, created_at) " .
        "values (null, ?, ?, ?, ?)";

    $statement = $db->prepare($query);

    $result = $statement->execute([$title, $blog_id, $contents, $timestamp]);

    if ($result === false) {
        jump("/error.php", ["errorMessage" => "Entry creation failed!"]);
    } elseif ($statement->rowCount() != 1) {
        jump("/error.php", ["errorMessage" => "Entry creation failed! Possible SQL injection!!"]);
    }

    return $db->lastInsertId();
}


function list_entries($blog_id)
{

    $db = BlogDB::connect();

    $query = "select * from entries where blog_id = :ident order by created_at desc";


    $sst=$db->prepare($query);
    $sst->execute([":ident" => $blog_id]);

    return $sst->fetchAll();
}

function get_entry($entry_id)
{

    $db = BlogDB::connect();

    $query = "select * from entries where id = :ident";

    $sst=$db->prepare($query);
    $sst->execute([":ident" => $entry_id]);


    return $sst->fetch();
}