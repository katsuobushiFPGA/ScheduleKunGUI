package test;

public class Main {
	public static void main(String args[]) throws Throwable{
		System.out.println("Hello");
		TextWriter t = new TextWriter();
		final DotMatrix x = new DotMatrix();
		System.out.println(x.toString("����ɂ���"));
		t.setMatrix("�Ă�");
		t.setOnsei("�Ă�");
		
		t.TextOutput("C:\\Users\\hiroto\\Documents\\NetBeansProjects", "SJIS");
	}
}
