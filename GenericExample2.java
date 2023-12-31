package source;
class Box<T>
{
	T length;
	T breadth;
	
	void set(T length,T breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	T getL()
	{
		return length;
	}
	T setL(T length)
	{
		return length;
	}
	T getB() 
	{
		return breadth;
		
	}
	T setB(T breadth)
	{
		return breadth;
	}
	
}


public class GenericExample2 {

	public static void main(String[] args) {
		Box <Integer> obj1=new Box<Integer>();
		obj1.set(3, 5);
		
		System.out.println("integer box values for length: " + obj1.getL()) ;
		System.out.println("integer box values for breadth: " + obj1.getB());
		
		Box <Double> obj2=new Box<Double>();
		obj2.set(4.2,4.6);
		
		System.out.println("Double Box values for length: " + obj2.getL());
		System.out.println("Double Box values for breadth: " + obj2.getB());
	}

}
