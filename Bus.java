package RightWay2;

public class Bus extends Car{
	@Override
	public void run() {
		System.out.println("버스가 달린다!");
	}
	
	public void customer() {
		System.out.println("버스가 손님을 태운다!");
	}
}
