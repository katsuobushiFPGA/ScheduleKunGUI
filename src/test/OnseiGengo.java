package test;

//漢字、ひらがな→カタカナ
//カタカナ→ローマ字


import org.atilika.kuromoji.Token;
import org.atilika.kuromoji.Tokenizer;

public class OnseiGengo {

		public String onseiString(String msg){
			StringBuilder sb = new StringBuilder();
			Tokenizer tokenizer = Tokenizer.builder().build();
			for (Token token : tokenizer.tokenize(msg)) {
				System.out.println(token.getAllFeaturesArray()[8]);
				sb.append(token.getAllFeaturesArray()[8]);
				sb.append("\n");
			}
			return sb.toString();
		}
}
