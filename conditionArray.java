package javaLearning;

public class conditionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i] % 2 == 0)
//			{
//				System.out.println( arr[i] +" Multiplay by two" );
//
//			}
//			else
//			{
//				System.out.println(arr[i] +" Not multiplay by two");
//			}
//		}

		for (int element : arr) {
			System.out.println(element*3);
		}
	}

}
