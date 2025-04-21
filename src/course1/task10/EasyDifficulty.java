package course1.task10;

public class EasyDifficulty implements DifficultyStrategy{
    @Override
    public void enemyBehavior() {
        System.out.println("敌方士兵反应迟钝...");
    }

    @Override
    public void monsterBehavior() {
        System.out.println("怪兽步履缓慢...");
    }
}
