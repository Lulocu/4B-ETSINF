<?php

class BlogDB extends PDO
{
    public static function connect(): BlogDB
    {
        global $accessDB;

        $dbFile = $accessDB ?? __DIR__ . "/../../database.sqlite3";
        try {
            $db = new self("sqlite:{$dbFile}");
        } catch (PDOException $exception) {
            jump("/error.php", ["errorMessage" => "<b>Database error:</b><br/>". $exception->getMessage()]);
        }

        return $db;
    }

    public function query($statement, $mode = PDO::FETCH_ASSOC, $arg3 = null, array $ctorargs = array()) : PDOStatement
    {
        $result = parent::query($statement, $mode);

        if ($result === false) {
            jump("/error.php", ["infoMessage"=> "QUERY: {$statement}", "errorMessage" => "<b>Database error:</b><br/>". $this->errorInfo()[2]]);
        }

        return $result;
    }

    public function exec($statement) : int
    {
        $result = parent::exec($statement);

        if ($result === false) {
            jump("/error.php", ["infoMessage"=> "QUERY: {$statement}", "errorMessage" => "<b>Database error:</b><br/>". $this->errorInfo()[2]]);
        }

        return $result;
    }
}
