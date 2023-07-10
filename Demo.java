//Methods:Methods is nothing but a methdos has a method name and methods has parameter methods have method body method has return type is called as method.

package methods.com;
class Calculator
{
	int  a=50;
	int  b=40;
	void add()
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
	
}
public class Demo {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add();
	}

}
