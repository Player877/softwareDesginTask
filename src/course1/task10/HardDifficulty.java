package course1.task10;

public class HardDifficulty implements DifficultyStrategy{
    @Override
    public void enemyBehavior() {
        System.out.println("敌方士兵反应敏捷...");
    }

    @Override
    public void monsterBehavior() {
        System.out.println("怪兽步履如飞...");
    }
}
