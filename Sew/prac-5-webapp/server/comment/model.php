<?php
/*
 * SEW
 * @file: model.php
 * @author: ssaez
 */

function create_comment($entry_id, $user_id, $contents)
{
    $db = BlogDB::connect();

    $timestamp = time();

    $query = "insert into comments (id, entry_id, user_id, contents, created_at) " .
        "values (null, ?, ?, ?, ?)";

    $statement = $db->prepare($query);
    $result = $statement->execute([$entry_id, $user_id, $contents, $timestamp]);

    if ($result === false) {
        jump("/error.php", ["errorMessage" => "Entry creation failed!"]);
    } elseif ($statement->rowCount() != 1) {
        jump("/error.php", ["errorMessage" => "Entry creation failed! Possible SQL injection!!"]);
    }

    return $db->lastInsertId();
}

function delete_comment($comment_id)
{
    $db = BlogDB::connect();

    $query = "delete from comments where id = '{$comment_id}'";

    $result = $db->exec($query);
    if ($result == 0) {
        jump("/error.php", ["errorMessage" => "Comment deletion failed!"]);
    } elseif ($result > 1) {
        jump("/error.php", ["errorMessage" => "Comment deletion failed! Possible SQL injection!!"]);
    }
}

function list_comments($entry_id)
{
    $db = BlogDB::connect();

    $query = "select comments.id as comment_id, entry_id, user_id, contents, comments.created_at as created_at, ".
        "users.name as author " .
        "from comments join users on comments.user_id = users.id where comments.entry_id = {$entry_id}";

    $result = $db->query($query);

    return $result->fetchAll();
}


function get_comment($comment_id)
{
    $db = BlogDB::connect();

    $query = "select * from comments where id = {$comment_id}";

    $result = $db->query($query);

    return $result->fetch();
}