package test;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class DotMatrix {
	/** ���ɋ����́u"�v�������u,�v�Ƀ}�b�`���鐳�K�\�� */
    static final String REGEX_CSV_COMMA = ",(?=(([^\"]*\"){2})*[^\"]*$)";
    /** �ŏ��ƍŌ�́u"�v�Ƀ}�b�`���鐳�K�\��*/
    static final String REGEX_SURROUND_DOUBLEQUATATION = "^\"|\"$";
    /** �u""�v�Ƀ}�b�`���鐳�K�\�� */
    static final String REGEX_DOUBLEQUOATATION = "\"\"";

	private static HashMap<String,String> hm = new HashMap<>();
	public DotMatrix() throws Throwable{
		readCSV();
	}
    //�O���p
    private static String pickUpChar(String key) throws Throwable{
    	return hm.get(key);
    }
    private static String userString(String s) throws Throwable{
    	StringBuilder sb = new StringBuilder();
    	for(int i=0;i<s.length();i++){
    		sb.append(DotMatrix.pickUpChar( String.valueOf(s.charAt(i)) ));
    		if(i!=s.length()-1)sb.append(",");
    	}
    	return sb.toString();
    }

    public String toString(String s) throws Throwable{
		return userString(s);
	}
	private static void readCSV() throws Throwable{
    	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("FONT.csv"),"SJIS"));
        String s;
        // �t�@�C�����s�P�ʂœǂ�
        while( (s = br.readLine()) != null ) {
            // ���K�\���ŕ�������
            String[] array = splitLineWithComma(s);
            hm.put(array[0],array[1]);
        }
        br.close();
    }
    private static String[] splitLineWithComma(String line) {
        // ������̕�����z��
        String[] arr = null;

        try {
            // �P�A�u"�v�ň͂܂�Ă��Ȃ��u,�v�ōs�𕪊�����B
            Pattern cPattern = Pattern.compile(REGEX_CSV_COMMA);
            String[] cols = cPattern.split(line, -1);

            arr = new String[cols.length];
            for (int i = 0, len = cols.length; i < len; i++) {
                String col = cols[i].trim();

                // �Q�A�ŏ��ƍŌ�Ɂu"�v������΍폜����B
                Pattern sdqPattern =
                    Pattern.compile(REGEX_SURROUND_DOUBLEQUATATION);
                Matcher matcher = sdqPattern.matcher(col);
                col = matcher.replaceAll("");

                // �R�A�G�X�P�[�v���ꂽ�u"�v��߂��B
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
