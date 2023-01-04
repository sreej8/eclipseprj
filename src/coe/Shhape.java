package coe;

public class Shhape {
	int  area(int l)
	{
		return l;
		//System.out.println("Area : 3466");
	}
}
class rec extends Shhape
{
	
	int area(int l )
	{
		return l*3;
	}
}
class square extends Shhape
{
	int area(int s)
	{
		return s*s;
	}
}