package methods.com;

class Calculator2
{
	int a=10;
	int b=20;
	int add()
	{
		int c=a+b;
		return c;
	}
}

public class Method {
	public static void main(String[] args) {
		Calculator2 calc=new Calculator2();
		int res=calc.add();
	}

}
