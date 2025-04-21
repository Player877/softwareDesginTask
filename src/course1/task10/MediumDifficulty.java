package course1.task10;

public class MediumDifficulty implements DifficultyStrategy{
    @Override
    public void enemyBehavior() {
        System.out.println("敌方士兵反应适度...");
    }

    @Override
    public void monsterBehavior() {
        System.out.println("怪兽步履速度中等...");
    }
}
