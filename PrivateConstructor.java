class PrivateConstructor{
	int a;
	double b;
	String c;
	private PrivateConstructor(){
		a=10;
		b=30.56;
		c="Hello World";
		System.out.println("a="+a +"b=" + b +"c=" +c);
	}
	public static void main(String[] args)
{
	PrivateConstructor r=new PrivateConstructor();
}
}