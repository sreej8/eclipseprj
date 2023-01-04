package coe;

public class SShape {
 
	void area(double r)
	{
		System.out.println("area : "+(3.14*r*r));
	}
	int area(int side)
	{
		System.out.println("Square :");
		return side*side;
		
	}
	double area(double base,double len)
	{
		System.out.println("Triangle :");
		return  (0.5)*base*len;
	}
	double area(int len ,int br)
	{
		System.out.println("Rectangle : ");
		return len*br;
	}
}
