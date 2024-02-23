package baseball;

public class BaseBallTeam {
    private final String name;
    private final int win;
    private final int lose;
    private final int draw;

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public double getRate() {
        return (double) this.win / (this.win + this.lose);
    }

    public void report() {
        System.out.println(this.name + " の2023年の成績は " + this.win + "勝 " + this.lose + "敗 " + this.draw + "分、勝率は "
                + this.getRate() + "です。");
    }
}