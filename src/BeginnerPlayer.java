public class BeginnerPlayer extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달려요!");
    }

    @Override
    public void jump() {
        System.out.println("X 점프는 못해요!");
    }

    @Override
    public void turn() {
        System.out.println("X 턴은 못해요!");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("--초급자 레벨입니다.--");
    }
}
