{"filter":false,"title":"Chapter14.java","tooltip":"/応用03/practice/Chapter14.java","undoManager":{"mark":1,"position":1,"stack":[[{"start":{"row":0,"column":0},"end":{"row":21,"column":0},"action":"insert","lines":["package practice;","","import java.util.ArrayList;","import java.util.List;","","public class Chapter14 {","\tpublic static void main(String[] args) {","\t\tList<Character> party = new ArrayList<Character>();","\t\tparty.add(new Soldier());","\t\tparty.add(new Playboy());","\t\t","\t\tChapter14.partyAttack(party);","\t}","\t","\tpublic static void partyAttack(List<Character> party) {","\t\tfor(Character character : party) {","\t\t\tint hp = character.attack();","\t\t\tSystem.out.println(\"ヒットポイント\" + hp);","\t\t}","\t}","}",""],"id":1}],[{"start":{"row":10,"column":0},"end":{"row":10,"column":2},"action":"remove","lines":["\t\t"],"id":2},{"start":{"row":13,"column":0},"end":{"row":13,"column":1},"action":"remove","lines":["\t"]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":21,"column":0},"end":{"row":21,"column":0},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1620366981083,"hash":"45f62054bdf910b0dce7863698d55f5afddd098b"}