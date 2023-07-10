package methods.com;

class Dog
{
	int c;
	void add(int a,int b)
	{
		c=a+b;
		System.out.println(c);
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Dog d=new Dog();
		int num1=50;
		int num2=40;
		d.add(num1,num2);
	}
	

}
