{"filter":false,"title":"List01.java","tooltip":"/応用03/List01.java","undoManager":{"mark":1,"position":1,"stack":[[{"start":{"row":0,"column":0},"end":{"row":40,"column":0},"action":"insert","lines":["","import java.util.ArrayList;","import java.util.List;","","public class List01 {","\tpublic static void main(String[] args) {","\t\t//ArrayListを生成","\t\tList<String> list1 = new ArrayList<String>();","\t\t//LinkdedListを生成","\t\t//List<Integer> list2 = new LinkedList<Integer>();","\t","\t\t// 要素を追加する","\t\tlist1.add(\"りんご\");","\t\tlist1.add(\"みかん\");","","\t\t// 位置を指定して要素を追加する","\t\tlist1.add(1, \"バナナ\");","\t\t","\t\t//コレクションの要素数より大きい位置を指定すると実行エラー","\t\t//list1.add(5,\"ドリアン\");","\t\t","\t\t//要素を取得する","\t\tlist1.get(0);","\t\t","\t\t//containsで存在チェック","\t\tlist1.contains(\"バナナ\");","\t\tlist1.contains(\"なし\");","\t\t","\t\t//コレクションの要素数を知りたい","\t\tlist1.size();","\t\t","\t\t// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)","\t\tlist1.remove(\"バナナ\");","\t\tlist1.remove(\"なし\"); // 何もしない","","\t\t// 位置を指定して要素を削除する","\t\tlist1.remove(0);","\t\t//list1.remove(5); // コレクションの要素数より大きい位置を指定すると実行時エラー","\t}","}",""],"id":1}],[{"start":{"row":10,"column":0},"end":{"row":10,"column":1},"action":"remove","lines":["\t"],"id":2},{"start":{"row":17,"column":0},"end":{"row":17,"column":2},"action":"remove","lines":["\t\t"]},{"start":{"row":20,"column":0},"end":{"row":20,"column":2},"action":"remove","lines":["\t\t"]},{"start":{"row":23,"column":0},"end":{"row":23,"column":2},"action":"remove","lines":["\t\t"]},{"start":{"row":27,"column":0},"end":{"row":27,"column":2},"action":"remove","lines":["\t\t"]},{"start":{"row":30,"column":0},"end":{"row":30,"column":2},"action":"remove","lines":["\t\t"]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":40,"column":0},"end":{"row":40,"column":0},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1620363594641,"hash":"629849a5c5b1d450cdee8b5d94625277c719af9f"}