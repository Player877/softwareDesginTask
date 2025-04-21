package course1.task4;

public class SDBackup implements BackupStrategy{
    private ContactManager contactManager = new ContactManager();
    private MessageManager messageManager = new MessageManager();
    private MusicManager musicManager = new MusicManager();
    private PhotoManager photoManager = new PhotoManager();

    @Override
    public void backupAll() {
        contactManager.backup();
        messageManager.backup();
        musicManager.backup();
        photoManager.backup();
    }
}
