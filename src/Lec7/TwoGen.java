package Lec7;

public class TwoGen<T, V> {

	T ob1;
	V ob2;

	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}

	void showType() {
		System.out.println("Type of T is : " + ob1.getClass().getName());
		System.out.println("Type of T is : " + ob2.getClass().getName());
	}

	T getOb1() {
		return ob1;
	}

	V getOb2() {
		return ob2;
	}

	void setOb1(T ob1) {
		this.ob1 = ob1;
	}

	void setOb2(V ob2) {
		this.ob2 = ob2;
	}

}
