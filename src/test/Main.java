package test;

public class Main {
	public static void main(String args[]) throws Throwable{
		System.out.println("Hello");
		TextWriter t = new TextWriter();
		final DotMatrix x = new DotMatrix();
		System.out.println(x.toString("こんにちは"));
		t.setMatrix("てｓ");
		t.setOnsei("てｓ");
		
		t.TextOutput("C:\\Users\\hiroto\\Documents\\NetBeansProjects", "SJIS");
	}
}
