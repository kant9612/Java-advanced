package ouyou07;

import java.util.ArrayList;
import java.util.Comparator;
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
//		10こ以下に絞り込まれたリストを作る
		List<Fruit> filtered = new ArrayList<>();
//		拡張for文でfruitsをループ
		for(Fruit fruit: fruits) {
//			if文で10個以下に絞る
			if(fruit.quantity <= 10) {
//				絞り込まれたリストに追加
				filtered.add(fruit);
			}
		}
//		20個ずつ追加する
		List<Fruit> ordered = new ArrayList<>();
		for(Fruit fruit: filtered) {
			ordered.add(fruit.order(20));
		}
//		個数がすくない順に並べる
		ordered.sort(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit f1, Fruit f2) {
				return f1.quantity - f2.quantity;
			}
		});
		
//		絞り込んで並び替えたリストを拡張for文でループしながら出力する
		for(Fruit fruit: ordered) {
			System.out.println(fruit);
		}
	}
}
