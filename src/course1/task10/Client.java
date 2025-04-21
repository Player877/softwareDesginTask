package course1.task10;

public class Client {
    public static void main(String[] args) {
        // 创建游戏环境
        GameContext gameContext = new GameContext();

        // 初等级别
        System.out.println("选择初等级别...");
        gameContext.setDifficulty(new EasyDifficulty());
        gameContext.playGame();

        // 中间级别
        System.out.println("选择中间级别...");
        gameContext.setDifficulty(new MediumDifficulty());
        gameContext.playGame();

        // 高难级别
        System.out.println("选择高难级别...");
        gameContext.setDifficulty(new HardDifficulty());
        gameContext.playGame();
    }
}
