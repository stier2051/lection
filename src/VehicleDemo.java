
class Vehicle {
    int passengers; //количество пассажиров
    int fuelcap; //емкость топливного бака
    int mpg; //потребление топлива в милях на галлон
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //расчитать дальность поездки при полном баке
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние " + range + " миль");
    }
}
