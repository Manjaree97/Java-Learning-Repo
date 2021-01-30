package conditionalStats;

public class BreakContinueDemo {

	 public static void main(String args[]) {
	      int [] numbers = {10, 20, 30, 40, 50};
/*Break example*/
	      outer: for(int x : numbers ) {
	    	inner: for(int k : numbers) {
	         if( k == 30 ) {
	            break inner;
	            
	         }
	         System.out.print( k );
	         System.out.print("\n");
	    	 }
	      }

/*continue example*/
	      for(int x : numbers ) {
	          if( x == 30 ) {
	             continue;
	          }
	          System.out.print( x );
	          System.out.print("\n");
	       }
 }
}
