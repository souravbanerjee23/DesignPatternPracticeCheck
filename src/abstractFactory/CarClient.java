package abstractFactory;

public class CarClient {

	public static void main(String[] args) {

		System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT));
		System.out.println(CarFactory.buildCar(CarType.MICRO, Location.USA));
		System.out.println(CarFactory.buildCar(CarType.MINI, Location.INDIA));
	}

}