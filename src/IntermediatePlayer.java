public class IntermediatePlayer extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빠르게 달려요!");
    }

    @Override
    public void jump() {
        System.out.println("낮게 점프!");
    }

    @Override
    public void turn() {
        System.out.println("X 턴은 못해요!");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("--중급자 레벨입니다.--");
    }
}
