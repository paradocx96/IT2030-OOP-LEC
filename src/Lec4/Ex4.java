package Lec4;

interface IA {
	void MethodA1();

	void MethodA2();
	
	default void Method3() {
		System.out.println("Default method can be Declared in Interface");
	}
}

interface IB {
	void MethodB1();

	void MethodB2();
}

interface IC extends IA, IB{
	void MethodC1();

	void MethodC2();
}

class Sample1 implements IA, IB, IC {

	@Override
	public void MethodC1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MethodC2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MethodB1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MethodB2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MethodA1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MethodA2() {
		// TODO Auto-generated method stub
		
	}
}

class Sample2 implements IC {

	@Override
	public void MethodA1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MethodA2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MethodB1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MethodB2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MethodC1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MethodC2() {
		// TODO Auto-generated method stub
		
	}
}

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
