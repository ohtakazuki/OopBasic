package cars;

public class Review {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new SportsCar("SAX", "7777", 200);
        cars[1] = new SportsCar("スーパーV", "0012", 180);
        cars[2] = new Minivan("フェレック", "1505", 50);
        cars[3] = new Minivan("ヴィラット", "7894", 60);

        for(int i = 0; i < cars.length; i++) {
            cars[i].description();
            cars[i].drive(200);
            System.out.println("");//間を一行空ける
        }
    }
}