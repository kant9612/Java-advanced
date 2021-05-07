
import java.util.ArrayList;
import java.util.List;

public class List01 {
	public static void main(String[] args) {
		//ArrayListを生成
		List<String> list1 = new ArrayList<String>();
		//LinkdedListを生成
		//List<Integer> list2 = new LinkedList<Integer>();

		// 要素を追加する
		list1.add("りんご");
		list1.add("みかん");

		// 位置を指定して要素を追加する
		list1.add(1, "バナナ");

		//コレクションの要素数より大きい位置を指定すると実行エラー
		//list1.add(5,"ドリアン");

		//要素を取得する
		list1.get(0);

		//containsで存在チェック
		list1.contains("バナナ");
		list1.contains("なし");

		//コレクションの要素数を知りたい
		list1.size();

		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		list1.remove("バナナ");
		list1.remove("なし"); // 何もしない

		// 位置を指定して要素を削除する
		list1.remove(0);
		//list1.remove(5); // コレクションの要素数より大きい位置を指定すると実行時エラー
	}
}
