<?php
/*
 * SEW
 */

function create_blog($title, $user_id) {
    $db = BlogDB::connect();
    $t = time();
    $db->exec("insert into blogs(user_id, title,created_at ) values ('$user_id','$title',$t)");

    return $db->lastInsertId();
}
function list_blogs() {
    $db = BlogDB::connect();
    $con = $db->query("select blogs.id as blog_id, blogs.created_at as created_at, users.name as author 
                        from users, blogs WHERE blogs.user_id == users.id ");

    return $con->fetchAll();;
}
function get_blog($blog_id) {
    $con = list_blogs();
    $aux = array_search($blog_id,array_column($con,'blog_id'));
    return $con[$aux];;
}
function list_entries($blog_id) {
    $db = BlogDB::connect();
    $con = get_blog($blog_id);
    $tmp = ($con["blog_id"]);
    $aux = $db->query("select * from entries WHERE entries.blog_id == $tmp ");

    return $aux->fetchAll();;
}