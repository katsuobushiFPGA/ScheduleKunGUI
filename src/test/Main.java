package test;

import javafx.application.Application;


public class Main {
	public static void main(String args[]) throws Throwable{


		/* �K�v�ȃI�u�W�F�N�g�̐��� */
		final KanaRomaji k = new KanaRomaji();
		DotMatrix x = new DotMatrix();
		OnseiGengo on = new OnseiGengo();
		TextWriter t = new TextWriter();

		/* �t�@�C���p�X */
		final String outputPath = "D:\\jaavtest";
		String filename = "test.txt";
		StringBuilder connecter=new StringBuilder();
		connecter.append(outputPath).append("\\").append(filename);
		System.out.println(connecter.toString());

		/* ���[�U�[�������� */
		final String userInput = "����������";



		System.out.println(k.kana2roma(on.onseiString("���͂悤�������܂��B")));
		System.out.println("Hello");

		System.out.println(x.toString("����ɂ���"));



		/* �K�v���� */

		t.setMatrix("#Matrix:" + x.toString(userInput));
		t.setOnsei("#Onsei:" + k.kana2roma(on.onseiString(userInput)));
		t.TextOutput(connecter.toString(), "SJIS");



		Application.launch(Window.class);
	}
}
