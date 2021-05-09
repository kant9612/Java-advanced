package ouyou06;

@FunctionalInterface
public interface Greeting {
	
	public String hello();
	
	Greeting greeting = () -> {
		return "こんにちは";
	};
	
	public static void sayHello(Greeting g) {
		System.out.println(g.hello());
	}
}
