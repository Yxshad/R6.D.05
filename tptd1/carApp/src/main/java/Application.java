public class Application {
    public static void main(String[] args) {
        Car maCar = new Car("Sedan", "Bleu");
        Driver moi = new Driver("John", 20);

        Car.startCar(moi);
        maCar.accelerate();
        maCar.changeSpeed(80, moi);
        maCar.slowDown();
        maCar.changeSpeed(30, moi);
        Car.arreterVoiture(moi);
        System.out.println("fini");
    }
}
