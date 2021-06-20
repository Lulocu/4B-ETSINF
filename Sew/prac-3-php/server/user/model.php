<?php
/*
 * SEW
 */
function user_exists($user) : bool{
    $db = BlogDB::connect();
    $con = $db->query("select name from users WHERE name == '$user' ");
    $res = $con->fetch();
    return $res != "";
}
function create_user($user, $name, $password) {
    $db = BlogDB::connect();
    $t = time();
    $db->exec("insert into users(name, user, password, created_at) values ('$name','$user','$password',$t)");

    return $db->lastInsertId();
}
function check_user($user, $password) {
    $db = BlogDB::connect();
    $con = $db->query("select id as user_id from users WHERE name == '$user' and password = '$password' ");
    $res = $con->fetch();
    return $res;
}