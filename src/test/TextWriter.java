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
	/*@param path:出力先パス
	 * 		 code:文字コードの指定*/
	public void TextOutput(String path,String code) throws IOException{
		/* テキスト出力 */
		// FileOutputStreamオブジェクト生成（出力ファイルの指定）
		FileOutputStream f = new FileOutputStream(path);
		// OutputStreamWriterオブジェクト生成（文字コードの指定）
		OutputStreamWriter oall = new OutputStreamWriter(f, code);
		oall.write(onsei);
		oall.write("\r\n");
		oall.write(matrix);
		oall.close();
		f.close();
	}
}
