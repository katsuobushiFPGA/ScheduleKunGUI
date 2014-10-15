package test;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
class DotMatrix {
	/** 後ろに偶数個の「"」が現れる「,」にマッチする正規表現 */
    static final String REGEX_CSV_COMMA = ",(?=(([^\"]*\"){2})*[^\"]*$)";
    /** 最初と最後の「"」にマッチする正規表現*/
    static final String REGEX_SURROUND_DOUBLEQUATATION = "^\"|\"$";
    /** 「""」にマッチする正規表現 */
    static final String REGEX_DOUBLEQUOATATION = "\"\"";
    
	private static HashMap<String,String> hm = new HashMap<>();
	public DotMatrix() throws Throwable{
		readCSV();
	}
    //外部用
    private static String pickUpChar(String key) throws Throwable{
    	return hm.get(key);
    }
    private static String userString(String s) throws Throwable{
    	StringBuilder sb = new StringBuilder();
    	for(int i=0;i<s.length();i++){
    		sb.append(DotMatrix.pickUpChar( String.valueOf(s.charAt(i)) ));
    		sb.append("\n");
    	}
    	return sb.toString();
    }
	public String toString(String s) throws Throwable{
		return userString(s);
	}
	private static void readCSV() throws Throwable{
    	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("FONT.csv"),"SJIS"));
        String s;
        // ファイルを行単位で読む
        while( (s = br.readLine()) != null ) {
            // 正規表現で分割する
            String[] array = splitLineWithComma(s);
            hm.put(array[0],array[1]);
        }
        br.close();
    }
    private static String[] splitLineWithComma(String line) {
        // 分割後の文字列配列
        String[] arr = null;

        try {
            // １、「"」で囲まれていない「,」で行を分割する。
            Pattern cPattern = Pattern.compile(REGEX_CSV_COMMA);
            String[] cols = cPattern.split(line, -1);

            arr = new String[cols.length];
            for (int i = 0, len = cols.length; i < len; i++) {
                String col = cols[i].trim();

                // ２、最初と最後に「"」があれば削除する。
                Pattern sdqPattern =
                    Pattern.compile(REGEX_SURROUND_DOUBLEQUATATION);
                Matcher matcher = sdqPattern.matcher(col);
                col = matcher.replaceAll("");

                // ３、エスケープされた「"」を戻す。
                Pattern dqPattern =
                    Pattern.compile(REGEX_DOUBLEQUOATATION);
                matcher = dqPattern.matcher(col);
                col = matcher.replaceAll("\"");

                arr[i] = col;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return arr;
    }
}
