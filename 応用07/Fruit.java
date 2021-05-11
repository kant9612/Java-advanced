package ouyou07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fruit {
	//名前
	public String name;
	//在庫数
	public int quantity;

	//名前と在庫数を引数にしたコンストラクタ
	public Fruit(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	//在庫数を増やしたフルーツを返すメソッド
	public Fruit order(int quantityToAdd) {
		return new Fruit(this.name, this.quantity + quantityToAdd);
	}

	//出力数にtoStringをオーバーライド
	@Override
	public String toString() {
		return name + ": " + quantity + "個";
	}

	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("りんご", 7));
		fruits.add(new Fruit("みかん", 15));
		fruits.add(new Fruit("いちご", 4));
		fruits.add(new Fruit("メロン", 8));
		fruits.add(new Fruit("ぶどう", 20));

		fruits.stream()
			.filter(f -> f.quantity <= 10)
			.map(f -> f.order(20))
			.sorted((f1, f2) -> f1.quantity - f2.quantity)
			.forEach(System.out::println);

		//確認問題1
		long count = fruits.stream()
			.filter(f -> f.quantity <= 10)
			.count();

		System.out.println(count);

		//確認問題2
		List<Fruit> sortedFruits = fruits.stream()
			.sorted((f1, f2) -> f2.quantity - f1.quantity)
			.collect(Collectors.toList());

		System.out.println(sortedFruits);
	}
}
