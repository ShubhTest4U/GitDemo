package javaLearning;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		System.out.println("print value of array 2:"+ arr[2]);

		for (int element : arr) {
			System.out.println("Print all value of array:"+element);
		}

		int[] arr1 = {1,2,3,4,5};
		System.out.println("print value of array 1:"+ arr1[1]);

		for (int element : arr1) {
			System.out.println("All array value:"+element);
		}

		String[] name = {"Shubham", "Kori", "API", "Test"};
		for (String element : name) {
		System.out.println("Print string array value :"+element);
		}

		//Enhanced for loop

		for(String i : name)
		{
			System.out.println(i);
		}


}}