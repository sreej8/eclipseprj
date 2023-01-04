package coe;

public interface Shape1 {
	 void area(int l);
}
class SSquare implements Shape1
{

	@Override
	public void area(int l) {
		// TODO Auto-generated method stub
		System.out.println("area = "+ l*l);
	}
	
}
class CCircle implements Shape1
{

	@Override
	public void area(int l) {
		// TODO Auto-generated method stub
		System.out.println("area = "+3.14*l*l);
	}
	
}
