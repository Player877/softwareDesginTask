package course1.task10;

public class GameContext {
    private DifficultyStrategy strategy;

    // 设置当前难度
    public void setDifficulty(DifficultyStrategy strategy) {
        this.strategy = strategy;
    }

    // 运行游戏
    public void playGame() {
        if (strategy == null) {
            System.out.println("请先选择游戏难度！");
            return;
        }
        System.out.println("开始游戏...");
        strategy.enemyBehavior();
        strategy.monsterBehavior();
        System.out.println("游戏结束。\n");
    }
}
