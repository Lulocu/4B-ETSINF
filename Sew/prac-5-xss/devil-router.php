<?php

ob_start();
echo "*****************\n";
echo "FROM: {$_SERVER['REMOTE_ADDR']}\n";
echo "CLIENT: {$_SERVER['HTTP_USER_AGENT']}\n";
var_dump($_GET);
$accessContext = ob_get_clean();

file_put_contents("/dev/stderr", $accessContext);

return true;