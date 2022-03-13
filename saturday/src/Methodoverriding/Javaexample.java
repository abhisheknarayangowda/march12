package Methodoverriding;
class Parentclass
{
	Parentclass()
	{
		System.out.println("constructor of parent");
	}
	void disp()
	{
		System.out.println("parent method");
	}
}
public class Javaexample extends Parentclass
{
	Javaexample()
	{
		System.out.println("constructor of child");
	}
void disp()
{
	System.out.println("child method");
	super.disp();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Javaexample obj = new Javaexample();
obj.disp();
	}

}
