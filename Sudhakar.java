package methods.com;

class Dog1
{
	int c;
	int add(int a,int b)
	{
		c=a+b;
		return c;
	}
}

public class Sudhakar {
	public static void main(String[] args) {
		Dog1 d=new Dog1();
		int num1=50;
		int num2=50;
		int res=d.add(num1, num2);
		System.out.println(res);
	}
}
