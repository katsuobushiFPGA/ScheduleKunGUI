package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TextWriter {
	private String onsei;
	private String matrix;

	public void setOnsei(String text){
		onsei = text;
	}
	public void setMatrix(String text){
		matrix = text;
	}
	/*@param path:�o�͐�p�X
	 * 		 code:�����R�[�h�̎w��*/
	public void TextOutput(String path,String code) throws IOException{
		/* �e�L�X�g�o�� */
		// FileOutputStream�I�u�W�F�N�g�����i�o�̓t�@�C���̎w��j
		FileOutputStream f = new FileOutputStream(path);
		// OutputStreamWriter�I�u�W�F�N�g�����i�����R�[�h�̎w��j
		OutputStreamWriter oall = new OutputStreamWriter(f, code);
		oall.write(onsei);
		oall.write("\r\n");
		oall.write(matrix);
		oall.close();
		f.close();
	}
}
