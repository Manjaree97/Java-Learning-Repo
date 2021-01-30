package conditionalStats;

public class ForEachDemo {

	public static void main(String[] args) {
		int b[] = {1,2,3,4};
		int a[][] = {
				{1,2,3,4},
				{2,4,8},
				{5,6,7,8,9}
		};
		
		for(int c : b)
		{
			System.out.println(" " +c);
		}
		
		for(int k[] : a)
		{
			for(int l : k) {
				System.out.println(" " + l);
			}
			System.out.println();		
		}
		

	}

}
