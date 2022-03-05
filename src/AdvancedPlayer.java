public class AdvancedPlayer extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("엄청 빠르게 달려요!");
    }

    @Override
    public void jump() {
        System.out.println("높게 점프!");
    }

    @Override
    public void turn() {
        System.out.println("천천히 턴!");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("--고급자 레벨입니다.--");
    }
}
