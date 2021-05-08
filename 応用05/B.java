package ouyou05;

public interface B {
	public String hello();
	
	public static void main(String[] args) {
		// ()のあとに{}を追加
		B b = new B() {
		  // helloメソッドを実装
		  @Override
		  public String hello() {
		    return "Hello B!";
		  }
		};
		System.out.println(b.hello());
	}
}
