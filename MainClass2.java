//To elucidate static and non-static block
//Name: Yogesh Pawar

class Demo 
{
	//non-static block (It will get executed during instance creation of class Demo)
	{
		System.out.println("Running non-static block1 of Demo class");
	}

	{
		System.out.println("Running non-static block2 of Demo class");
	}

	//static block (it will get executed at the time of loading of class Demo)
	static
	{
		System.out.println("Running static block1 of Demo class");
	} 
	static
	{
		System.out.println("Running static block2 of Demo class");
	} 
}

class MainClass2
{
	public static void main(String args[])
	{
		Demo d=new Demo();
	}
}