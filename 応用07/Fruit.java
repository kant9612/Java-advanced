package ouyou07;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
	public String name;

	public int quantity;

	public Fruit(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public Fruit order(int quantityToAdd) {
		return new Fruit(this.name, this.quantity + quantityToAdd);
	}

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

		long count = fruits.stream()
			.filter(f -> f.quantity <= 10)
			.count();

		System.out.println(count);
	}
}
