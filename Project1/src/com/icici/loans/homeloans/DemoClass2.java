package com.icici.loans.homeloans;

public class DemoClass2 implements DemoInterface{
	int a=10;
	String var="Hello";
	
	public void loans()
	{
		System.out.println("Hai to everyone");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass2 i=new DemoClass2();
		i.loans();
		System.out.println(i.a);
		System.out.println(i.var);
		
		DemoClass2 j=new DemoClass2();
		j.loans();
        
	}

	@Override
	public void home() {
		// TODO Auto-generated method stub
		System.out.println("interface");
		
	}

}
