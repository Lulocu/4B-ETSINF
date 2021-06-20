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

    $query = "insert into users (id, user, name, password, created_at) values (null, :ident, :ident1, :ident2, $timestamp)";

    $sst=$db->prepare($query);
    $result=$sst->execute([":ident" => $user,":ident1" => $name,":ident2" => $key]);
    if ($result != 1) {
        jump("/user/register.php", ["errorMessage" => "User account '{$user}' cannot be created"]);
    }

    return $db->lastInsertId();
}

function user_exists($user)
{
    $db = BlogDB::connect();

    $query = "select * from users where user = :ident";
    $sst=$db->prepare($query);
    $sst->execute([":ident" => $user]);

    return (count($sst->fetchAll()) > 0) ? true : false;
}

function check_user($user, $password)
{
    $db = BlogDB::connect();

    $key = $password; // md5($password);

    $query = "select id as user_id, user, name from users where user = :ident and password = :ident1";
    $sst=$db->prepare($query);
    $sst->execute([":ident" => $user,":ident1" => $key]);

    $profile = $sst->fetch();

    if ($profile === false) {
        jump("/user/login.php", ["errorMessage" => "Invalid user or password"]);
    }

    return $profile;
}

