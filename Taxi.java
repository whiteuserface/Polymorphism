package RightWay2;

public class Taxi extends Car{
	@Override
	public void run() {
		System.out.println("택시가 달린다!");
	}
	
	public void customer() {
		System.out.println("손님을 태운다!");
	}
}
