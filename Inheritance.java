class Student{//Super class
	int roll,marks;
	String name;
	void input(){
		System.out.println("Enter roll no,marks,name");
	}
}

class Inheritance extends Student{
	void display(){
		roll=1;
		name="HNS";
		marks=92;

		System.out.println(roll+name+marks);
	}
	public static void main(String args[]){
		Inheritance r=new Inheritance ();
		r.input();
		r.display();
	}
}