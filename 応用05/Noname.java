
public class Noname {

	public String hello() {
		return "Hello A!";
	}

	public static void main(String[] args) {
		Noname noname = new Noname() {
			// クラスAのhelloメソッドをオーバーライドします。
			  @Override
			  public String hello() {
			    // "Hello B!"を返します。
			    return "Hello B!";
			  }
		};
		System.out.println(noname.hello());
	}
}
