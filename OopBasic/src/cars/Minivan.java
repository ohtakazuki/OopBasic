package cars;

public class Minivan extends Car {
    // コンストラクタ
    public Minivan(String name, String carNumber, double speed) {
        super(name, carNumber, speed, 6);
    }

    @Override
    public void drive(double distance) {
        String str = "ミニバン%sを運転し、%.2fkmを%.2f時間で移動しました。".formatted(name, distance, needTime(distance));
        System.out.println(str);
    }
}