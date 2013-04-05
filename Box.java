
public class Box<T> 
{
	private T t;
	
	public void add(T t)
	{
		this.t= t;
	}
	public T get()
	{
		return t;
	}
	
	public static void main(String [] args)
	{
		Box<Integer> intBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		intBox.add(new Integer(100));
		stringBox.add(new String("Hello World"));
	    System.out.printf("int val: %d\n", intBox.get());
		System.out.printf("string val: %s\n", stringBox.get());
	}
}
