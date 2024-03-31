package javaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("Shubh");
		a.add("Ravi");
		a.add("Ankit");
		a.add("Baheti");
		a.add("Rahul");
		//System.out.println(a.get(2));

		for (String element : a) {
			System.out.println(element);
		}

		System.out.println(" ********** Enhanced loop **********");

		for(String val : a)
		{
			System.out.println(val);
		}
		System.out.println("Find value in arraylist: "+a.contains("Shubh"));

		//Convert list into arraylist to find data

		String[] name = {"Raj", "Syam", "Mehul", "Dinesh"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("TEE"));
	}

}
