public class Play {
    public static void main(String[] args) {
        Player player = new Player();

        player.play(1);

        // 플레이어 업그레이드
        IntermediatePlayer intermediatePlayer = new IntermediatePlayer();
        player.upgradeLevel(intermediatePlayer);

        player.play(2);

        // 플레이어 업그레이드
        AdvancedPlayer advancedPlayer = new AdvancedPlayer();
        player.upgradeLevel(advancedPlayer);

        player.play(3);

        // 결과
        //--초급자 레벨입니다.--
        // 천천히 달려요!
        // X 점프는 못해요!
        // X 턴은 못해요!
        // --중급자 레벨입니다.--
        // 빠르게 달려요!
        // 낮게 점프!
        // 낮게 점프!
        // X 턴은 못해요!
        // --고급자 레벨입니다.--
        // 엄청 빠르게 달려요!
        // 높게 점프!
        // 높게 점프!
        // 높게 점프!
        // 천천히 턴!
    }
}
