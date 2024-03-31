package javaLearning;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<=4; i++)
		{
			System.out.println("Outer loop value: "+i);

			for(int j=0; j<=4; j++)
			{
				System.out.println("Inner loop value: "+j);
			}
		}



	}

}
