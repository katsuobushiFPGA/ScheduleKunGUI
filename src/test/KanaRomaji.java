package test;

import java.util.HashMap;
public class KanaRomaji {
  HashMap<String,String> m = new HashMap<>();
  public KanaRomaji() {
    m.put("ア", "A");
    m.put("イ", "I");
    m.put("ウ", "U");
    m.put("エ", "E");
    m.put("オ", "O");
    m.put("カ", "KA");
    m.put("キ", "KI");
    m.put("ク", "KU");
    m.put("ケ", "KE");
    m.put("コ", "KO");
    m.put("サ", "SA");
    m.put("シ", "SHI");
    m.put("ス", "SU");
    m.put("セ", "SE");
    m.put("ソ", "SO");
    m.put("タ", "TA");
    m.put("チ", "CHI");
    m.put("ツ", "TU");
    m.put("テ", "TE");
    m.put("ト", "TO");
    m.put("ナ", "NA");
    m.put("ニ", "NI");
    m.put("ヌ", "NU");
    m.put("ネ", "NE");
    m.put("ノ", "NO");
    m.put("ハ", "HA");
    m.put("ヒ", "HI");
    m.put("フ", "FU");
    m.put("ヘ", "HE");
    m.put("ホ", "HO");
    m.put("マ", "MA");
    m.put("ミ", "MI");
    m.put("ム", "MU");
    m.put("メ", "ME");
    m.put("モ", "MO");
    m.put("ヤ", "YA");
    m.put("ユ", "YU");
    m.put("ヨ", "YO");
    m.put("ラ", "RA");
    m.put("リ", "RI");
    m.put("ル", "RU");
    m.put("レ", "RE");
    m.put("ロ", "RO");
    m.put("ワ", "WA");
    m.put("ヲ", "WO");
    m.put("ン", "N");
    m.put("ガ", "GA");
    m.put("ギ", "GI");
    m.put("グ", "GU");
    m.put("ゲ", "GE");
    m.put("ゴ", "GO");
    m.put("ザ", "ZA");
    m.put("ジ", "ZI");
    m.put("ズ", "ZU");
    m.put("ゼ", "ZE");
    m.put("ゾ", "ZO");
    m.put("ダ", "DA");
    m.put("ヂ", "DI");
    m.put("ヅ", "DU");
    m.put("デ", "DE");
    m.put("ド", "DO");
    m.put("バ", "BA");
    m.put("ビ", "BI");
    m.put("ブ", "BU");
    m.put("ベ", "BE");
    m.put("ボ", "BO");
    m.put("パ", "PA");
    m.put("ピ", "PI");
    m.put("プ", "PU");
    m.put("ペ", "PE");
    m.put("ポ", "PO");
    m.put("キャ", "KYA");
    m.put("キュ", "KYU");
    m.put("キョ", "KYO");
    m.put("シャ", "SYA");
    m.put("シュ", "SYU");
    m.put("ショ", "SYO");
    m.put("チャ", "TYA");
    m.put("チュ", "TYU");
    m.put("チョ", "TYO");
    m.put("ニャ", "NYA");
    m.put("ニュ", "NYU");
    m.put("ニョ", "NYO");
    m.put("ヒャ", "HYA");
    m.put("ヒュ", "HYU");
    m.put("ヒョ", "HYO");
    m.put("リャ", "RYA");
    m.put("リュ", "RYU");
    m.put("リョ", "RYO");
    m.put("ギャ", "GYA");
    m.put("ギュ", "GYU");
    m.put("ギョ", "GYO");
    m.put("ジャ", "ZYA");
    m.put("ジュ", "ZYU");
    m.put("ジョ", "ZYO");
    m.put("ヂャ", "DYA");
    m.put("ヂュ", "DYU");
    m.put("ヂョ", "DYO");
    m.put("ビャ", "BYA");
    m.put("ビュ", "BYU");
    m.put("ビョ", "BYO");
    m.put("ピャ", "PYA");
    m.put("ピュ", "PYU");
    m.put("ピョ", "PYO");
    m.put("ー", "-");
}
  public String kana2roma(String s) {
    StringBuilder t = new StringBuilder();
    for ( int i = 0; i < s.length(); i++ ) {
      if ( i <= s.length() - 2 )  {
        if ( m.containsKey(s.substring(i,i+2))) {
          t.append(m.get(s.substring(i, i+2)));
          i++;
        } else if (m.containsKey(s.substring(i, i+1))) {
          t.append(m.get(s.substring(i, i+1)));
        } else if ( s.charAt(i) == 'ッ' ) {
          t.append(m.get(s.substring(i+1, i+2)).charAt(0));
        } else {
          t.append(s.charAt(i));
        }
      } else {
        if (m.containsKey(s.substring(i, i+1))) {
          t.append(m.get(s.substring(i, i+1)));
        } else {
          t.append(s.charAt(i));
        }
      }
    }
    return t.toString();
  }
}