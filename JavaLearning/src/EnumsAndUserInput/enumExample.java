package enums;


interface Fruits{
	 static String RED ="RED";
	 static String GREEN ="GREEN";
}

//class Mobile
//{
//     public static final Mobile APPLE = new Mobile();
//     public static final Mobile SAMSUNG = new Mobile();
//     public static final Mobile HTC = new Mobile();
//}

enum Mobile {
	APPLE, SAMSUNG, HTC;
	
}


public class enumExample {
	

	public static void main(String[] args) {
		

		System.out.println(Mobile.APPLE);

		Mobile m1 = Mobile.APPLE;
		
		//System.out.println(Mobile.HTC.ordinal());
		System.out.println(Mobile.valueOf("APPLE"));
		
//		Mobile m[] = Mobile.values();
//		
//		for(Mobile mob : m) {
//			System.out.println(mob);
//		}

//		switch (m1) {
//		case APPLE:
//			System.out.println("PRINT APPLE");
//			break;
//
//		}

	}

}
