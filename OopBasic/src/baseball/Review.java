package baseball;

public class Review {
    public static void main (String[] args)
    {
        BaseBallTeam tigers = new BaseBallTeam("阪神タイガース", 85, 53, 5);
        BaseBallTeam carp = new BaseBallTeam("広島東洋カープ", 74, 65, 4);
        BaseBallTeam baystars = new BaseBallTeam("横浜DeNAベイスターズ", 74, 66, 3);
        BaseBallTeam giants = new BaseBallTeam("読売ジャイアンツ", 71, 70, 2);
        BaseBallTeam swallows = new BaseBallTeam("東京ヤクルトスワローズ", 57, 83, 3);
        BaseBallTeam dragons = new BaseBallTeam("中日ドラゴンズ", 56, 82, 5);

        tigers.report();
        carp.report();
        baystars.report();
        giants.report();
        swallows.report();
        dragons.report();
    }
}