package test;

import java.util.List;

import javafx.application.Application;


public class Main {

	public static void main(String args[]) throws Throwable{
		Application.launch(Window.class);//JavaFX�̋N��
	}

	public static void GenerateMain(List<Integer> schedule_time,List<String> schedule_text) throws Throwable{
		/* �K�v�ȃI�u�W�F�N�g�̐��� */
		final KanaRomaji k = new KanaRomaji();
		DotMatrix x = new DotMatrix();
		OnseiGengo on = new OnseiGengo();
		TextWriter t = new TextWriter();

		/* �t�@�C���p�X */
		final String outputPath = "C:\\ScheduleKun";
		String filename = "schedule.txt";
		StringBuilder connecter=new StringBuilder();
		connecter.append(outputPath).append("\\").append(filename);
		System.out.println(connecter.toString());

		/* ���[�U�[�������� */
		final String userInput = "����������";

//		System.out.println(k.kana2roma(on.onseiString("���͂悤�������܂��B")));
//		System.out.println("Hello");
//		System.out.println(x.toString("����ɂ���"));
		StringBuilder sb = new StringBuilder();
		int kv=0;
		for(int i=0;i < schedule_text.size()-1;i++){
			if(schedule_time.get(kv)==null || schedule_text.get(i) == null)break;
			sb.append("#time " + schedule_time.get(kv) + ":" + schedule_time.get(kv+1))
			  .append("\r\n")
			  .append("#Matrix:" + x.toString(schedule_text.get(i)))
			  .append("\r\n")
			  .append("#Onsei:" + k.kana2roma(on.onseiString(schedule_text.get(i))))
			  .append("\r\n");
			kv+=2;
		}
		/* �K�v���� */
		t.TextOutput2(connecter.toString(), "SJIS",sb.toString());
	}
}
