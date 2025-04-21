package course1.task4;

public class SDBackup implements BackupStrategy{
    private ContactManager contactManager;
    private MessageManager messageManager;
    private MusicManager musicManager;
    private PhotoManager photoManager;

    @Override
    public void backupAll() {
        contactManager.backup();
        messageManager.backup();
        musicManager.backup();
        photoManager.backup();
    }
}
