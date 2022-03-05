public class Player {
    private PlayerLevel playerLevel;

    // constructor
    public Player() {
        this.playerLevel = new BeginnerPlayer();
        playerLevel.showLevelMessage();
    }

    // 플레이어 업그레이드
    public void upgradeLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
        playerLevel.showLevelMessage();
    }

    // 플레이어 이벤트 실행
    public void play(int count) {
        playerLevel.go(count);
    }
}
