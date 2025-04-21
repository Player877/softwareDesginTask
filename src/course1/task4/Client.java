package course1.task4;

public class Client {
    public static void main(String[] args) {
        BaseBackupFacade mmcBackupFacade = new BaseBackupFacade(new MMCBackup());
        mmcBackupFacade.backupAll();
        BaseBackupFacade sdBackupFacade = new BaseBackupFacade(new SDBackup());
        sdBackupFacade.backupAll();
    }
}
