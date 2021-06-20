<div class="w3-card w3-margin w3-pale-yellow">

    <div class="w3-container w3-grey w3-small">
        <?= $comment['author'] ?>
        <span class="w3-right"><?= show_date($comment['created_at']); ?></span>
    </div>

    <div class="w3-container">
        <p><?= $comment['contents'] ?></p>

        <?php if (isset($_SESSION["user"]) &&
            ($_SESSION["user"]["user_id"] == $comment["user_id"] or $_SESSION["user"]["user"] == "admin")) { ?>
            <a href='/comment/delete.php?entry_id=<?= $entry_id ?>&comment_id=<?= $comment['comment_id'] ?>'
               class='w3-button w3-small w3-red w3-round w3-margin-bottom w3-right'>Delete</a>
        <?php } ?>
    </div>
</div>
