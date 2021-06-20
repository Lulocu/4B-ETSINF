<div class="w3-card w3-section w3-sand">

    <div class="w3-container w3-brown">
        <b><?= $entry['title'] ?></b>
        <span class="w3-right"><?= show_date($entry['created_at']); ?></span>
    </div>

    <div class="w3-container w3-hover-pale-yellow sew-cursor-pointer" onclick="window.location='/entry/view.php?entry_id=<?= $entry['id'] ?>'">
        <p><?= $entry['contents'] ?></p>

        <div class="w3-right w3-margin-bottom">
            <small><?= $blog['author'] ?></small>
        </div>
    </div>
</div>
