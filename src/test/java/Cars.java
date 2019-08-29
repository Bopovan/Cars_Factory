public class Cars {

    String mark;
    String model;
    String color;
    double mileage;
    int weigth;
    boolean crashed;
    int gasTankCapacity;

    Engine engine = new Engine(false, 78, 114, 16);


    public void consumption(double distance) {
        double result = (distance / 100) * engine.fuelConsumption;
        System.out.println("Расход топлива на " + distance + " км " + " составил " + result);
    }


    public void hornUse() {
        System.out.println("БИИИИИИП");
    }



    public static void main(String[] args) {

        Cars firstCar = new Cars();
        firstCar.mark = "Fiat";
        firstCar.model = "Albea";
        firstCar.weigth = 1700;

        firstCar.hornUse();
        firstCar.consumption(23);



    }
}
