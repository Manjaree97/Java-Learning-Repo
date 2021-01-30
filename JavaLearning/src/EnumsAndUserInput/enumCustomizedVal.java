package enums;

public class enumCustomizedVal {
	enum Mobile {
		APPLE(100), SAMSUNG, HTC(80);

		int price;

		Mobile() {
			price = 80;
		}

		Mobile(int p) {
			price = p;
		}

		public int getPrice() {
			return price;
		}
	}

	public static void main(String[] args) {
		System.out.println(Mobile.SAMSUNG.getPrice());

	}
}
