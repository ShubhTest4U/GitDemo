package javaLearning;

public class FirstClass {

	public void Getname() {

		System.out.println("My name is shubham");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstClass fc = new FirstClass();
		fc.Getname();

		System.out.println("This is public void class");

		SecondClass sc = new SecondClass();
		sc.Secondname();

	}

}
