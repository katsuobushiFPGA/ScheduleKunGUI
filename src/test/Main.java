package test;

import javafx.application.Application;


public class Main {
	public static void main(String args[]) throws Throwable{


		/* 必要なオブジェクトの生成 */
		final KanaRomaji k = new KanaRomaji();
		DotMatrix x = new DotMatrix();
		OnseiGengo on = new OnseiGengo();
		TextWriter t = new TextWriter();

		/* ファイルパス */
		final String outputPath = "D:\\jaavtest";
		String filename = "test.txt";
		StringBuilder connecter=new StringBuilder();
		connecter.append(outputPath).append("\\").append(filename);
		System.out.println(connecter.toString());

		/* ユーザー文字入力 */
		final String userInput = "あいうえお";



		System.out.println(k.kana2roma(on.onseiString("おはようございます。")));
		System.out.println("Hello");

		System.out.println(x.toString("こんにちは"));



		/* 必要処理 */

		t.setMatrix("#Matrix:" + x.toString(userInput));
		t.setOnsei("#Onsei:" + k.kana2roma(on.onseiString(userInput)));
		t.TextOutput(connecter.toString(), "SJIS");



		Application.launch(Window.class);
	}
}
