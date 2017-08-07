//To elucidate static blocks
//Name: Yogesh Pawar

class Demo
{
	static
	{
		System.out.println("Running static block of Demo class");
	}
}

class MainClass
{
	public static void main(String arg[])
	{
		System.out.println("Program Started....");
		//static block will be executed at the time of class loading
		new Demo();
		System.out.println("Program Ended....");
	}
}