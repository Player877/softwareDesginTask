package course1.task4;

public class BaseBackupFacade {
    private BackupStrategy backupStrategy;

    public BaseBackupFacade(BackupStrategy backupStrategy){
        this.backupStrategy = backupStrategy;
    }

    public void backupAll(){
        backupStrategy.backupAll();
    }
}
