public class Cars {

    String mark;
    String model;
    String color;
    double mileage;
    int weigth;
    boolean crashed;
    int gasTankCapacity;
    double engine;

    public static class Engine {
        boolean hybryd;
        int strong;
        int horsepower;
        double fuelConsumption;


        public void consumption(double distance) {
            double result = (distance / 100) * fuelConsumption;
            System.out.println("Расход топлива на " + distance + " состваил " + result);
        }

    }

    public void hornUse() {
        System.out.println("БИИИИИИП");
    }


    public static void main(String[] args) {

        Cars firstCar = new Cars();
        firstCar.mark = "Fiat";
        firstCar.model = "Albea";
        firstCar.weigth = 1700;

        Engine firstCarEngine = new Engine();
        firstCarEngine.hybryd = false;
        firstCarEngine.horsepower = 77;
        firstCarEngine.fuelConsumption = 8.7;

        firstCar.hornUse();
        firstCarEngine.consumption(20);

        Cars secondCar = new Cars();
        secondCar.mark = "Toyota";
        secondCar.model = "Prado";
        secondCar.weigth = 2300;

    }
}