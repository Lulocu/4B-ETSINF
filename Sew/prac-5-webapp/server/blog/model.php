<?php
/*
 * SEW
 * @file: model.php
 */

function create_blog($title, $user_id)
{
    $db = BlogDB::connect();

    $timestamp = time();

    $query = "insert into blogs (id, title, user_id, created_at) values (null, '{$title}', '{$user_id}', $timestamp)";

    $result = $db->exec($query);
    if ($result != 1) {
        jump("/error.php", ["errorMessage" => "Blog '{$title}' creation failed!"]);
    }

    return $db->lastInsertId();
}

function list_blogs()
{
    $db = BlogDB::connect();

    $query = "select blogs.id as blog_id, title, blogs.created_at as created_at, users.name as author " .
        "from blogs join users on blogs.user_id = users.id";

    $result = $db->query($query);

    return $result->fetchAll();

}

function get_blog($blog_id) {

    $db = BlogDB::connect();

    $query = "select blogs.id as blog_id, title, user_id, blogs.created_at as created_at, users.name as author " .
        "from blogs join users on blogs.user_id = users.id where blogs.id = {$blog_id}";

    $result = $db->query($query);

    return $result->fetch();

}
