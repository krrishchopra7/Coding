class StaticBlock{
	public static void main(String args[]){
		StaticBlock r=new StaticBlock();
	}
	StaticBlock(){//Constructor=Least Priority
		System.out.println("Constructor");
	}
	{//Instance= 2 precidence
		System.out.println("Instance");
	}
	static{
		System.out.println("Static");//highest precidence
	}
}

