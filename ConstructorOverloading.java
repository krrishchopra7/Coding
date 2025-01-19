class A{
	int a;
	double b;
	String c;
A(){
	a=100;
	b=7.7;
	c="Hello";
}
A(int x){
	a=x;
}
A(double y,String z){
	b=y;
	c=z;
}
}
class ConstructorOverloading{
	public static void main(String[] args){
		A r=new A();
		A r2=new A(10);
		A r3= new A(17.7,"World");
		System.out.println(r.a);
		System.out.println(r.b);
		System.out.println(r.c);
		System.out.println(r2.a);
		System.out.println(r3.b);
		System.out.println(r3.c);
	}
}