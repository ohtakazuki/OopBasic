package cars;

public abstract class Car {
    // フィールド
    protected final String name;
    private final String carNumber;
    private final double speed;
    private final int seatNum;

    // コンストラクタ
    public Car(String name, String carNumber, double speed, int seatNum) {
        this.name = name;
        this.carNumber = carNumber;
        this.speed = speed;
        this.seatNum = seatNum;
    }

    public void description() {
        String str = "この車の名前は%sです。ナンバーは%s、座席数は%d、速度は%.2fです。".formatted(name, carNumber, seatNum, speed);
        System.out.println(str);
    }

    protected double needTime(double distance) {
        return distance / speed;
    }

    public abstract void drive(double distance);
}