<?php
/*
 * SEW
 * @file: user/model.php
 */

function create_user($user, $name, $password)
{
    $db = BlogDB::connect();

    $key = $password; // md5($password);
    $timestamp = time();

    $query = "insert into users (id, user, name, password, created_at) values (null, '{$user}', '{$name}', '{$key}', $timestamp)";

    $result = $db->exec($query);
    if ($result != 1) {
        jump("/user/register.php", ["errorMessage" => "User account '{$user}' cannot be created"]);
    }

    return $db->lastInsertId();
}

function user_exists($user)
{
    $db = BlogDB::connect();

    $query = "select * from users where user = '{$user}'";

    $result = $db->query($query);

    return (count($result->fetchAll()) > 0) ? true : false;
}

function check_user($user, $password)
{
    $db = BlogDB::connect();

    $key = $password; // md5($password);

    $query = "select id as user_id, user, name from users where user = '{$user}' and password = '{$key}'";

    $result = $db->query($query);

    $profile = $result->fetch();

    if ($profile === false) {
        jump("/user/login.php", ["errorMessage" => "Invalid user or password"]);
    }

    return $profile;
}
