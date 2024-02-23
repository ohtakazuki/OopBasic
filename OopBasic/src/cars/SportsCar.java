package cars;

public class SportsCar extends Car {
    // コンストラクタ
    public SportsCar(String name, String carNumber, double speed) {
        super(name, carNumber, speed, 4);
    }

    @Override
    public void drive(double distance) {
        String str = "スポーツカー%sを運転し、%.2fkmを%.2f時間で移動しました。".formatted(name, distance, needTime(distance));
        System.out.println(str);
    }
}