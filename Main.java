package RightWay2;

public class Main {
	public static void main(String[] args) {
		Car car = new Bus();
		car.run();
		
		Car car1 = new Taxi();
		car1.run();
		
		Car car2 = new FlyCar();
		car2.run();
	}
}
