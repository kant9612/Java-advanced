
public class Human {
	public class HumanLeg {
	    public void kick() {
	      System.out.println("蹴る");
	    }
	  }
}

//実行すると以下の通り
//Human human = new Human();
//Human.HumanLeg leg = human.new HumanLeg();
//leg.kick();

//1行で書くと以下の通り
//new Human().new HumanLeg().kick();