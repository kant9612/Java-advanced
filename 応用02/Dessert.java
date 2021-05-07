
public enum Dessert {

	APPLE(100){
		void advertise() {
			System.out.println("真っ赤な林檎が" + getPrice() + "円！");
		}
	},

	ICE_CREAM(200){
		void advertise() {
			System.out.println("夏にぴったりアイスクリームが" + getPrice() + "円！");
		}
	},

	CAKE(300){
		void advertise() {
			System.out.println("皆大好き甘いケーキが" + getPrice() + "円！");
		}
	},
	;

	private int price;

	private Dessert(int price) {
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	abstract void advertise();

	public static void main(String[] args) {
		Dessert.APPLE.advertise();
		Dessert.ICE_CREAM.advertise();
		Dessert.CAKE.advertise();
	}
}2