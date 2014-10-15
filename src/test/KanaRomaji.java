package test;

import java.util.HashMap;
public class KanaRomaji {
  HashMap<String,String> m = new HashMap<>();
  public KanaRomaji() {
    m.put("�A", "A");
    m.put("�C", "I");
    m.put("�E", "U");
    m.put("�G", "E");
    m.put("�I", "O");
    m.put("�J", "KA");
    m.put("�L", "KI");
    m.put("�N", "KU");
    m.put("�P", "KE");
    m.put("�R", "KO");
    m.put("�T", "SA");
    m.put("�V", "SHI");
    m.put("�X", "SU");
    m.put("�Z", "SE");
    m.put("�\", "SO");
    m.put("�^", "TA");
    m.put("�`", "CHI");
    m.put("�c", "TU");
    m.put("�e", "TE");
    m.put("�g", "TO");
    m.put("�i", "NA");
    m.put("�j", "NI");
    m.put("�k", "NU");
    m.put("�l", "NE");
    m.put("�m", "NO");
    m.put("�n", "HA");
    m.put("�q", "HI");
    m.put("�t", "FU");
    m.put("�w", "HE");
    m.put("�z", "HO");
    m.put("�}", "MA");
    m.put("�~", "MI");
    m.put("��", "MU");
    m.put("��", "ME");
    m.put("��", "MO");
    m.put("��", "YA");
    m.put("��", "YU");
    m.put("��", "YO");
    m.put("��", "RA");
    m.put("��", "RI");
    m.put("��", "RU");
    m.put("��", "RE");
    m.put("��", "RO");
    m.put("��", "WA");
    m.put("��", "WO");
    m.put("��", "N");
    m.put("�K", "GA");
    m.put("�M", "GI");
    m.put("�O", "GU");
    m.put("�Q", "GE");
    m.put("�S", "GO");
    m.put("�U", "ZA");
    m.put("�W", "ZI");
    m.put("�Y", "ZU");
    m.put("�[", "ZE");
    m.put("�]", "ZO");
    m.put("�_", "DA");
    m.put("�a", "DI");
    m.put("�d", "DU");
    m.put("�f", "DE");
    m.put("�h", "DO");
    m.put("�o", "BA");
    m.put("�r", "BI");
    m.put("�u", "BU");
    m.put("�x", "BE");
    m.put("�{", "BO");
    m.put("�p", "PA");
    m.put("�s", "PI");
    m.put("�v", "PU");
    m.put("�y", "PE");
    m.put("�|", "PO");
    m.put("�L��", "KYA");
    m.put("�L��", "KYU");
    m.put("�L��", "KYO");
    m.put("�V��", "SYA");
    m.put("�V��", "SYU");
    m.put("�V��", "SYO");
    m.put("�`��", "TYA");
    m.put("�`��", "TYU");
    m.put("�`��", "TYO");
    m.put("�j��", "NYA");
    m.put("�j��", "NYU");
    m.put("�j��", "NYO");
    m.put("�q��", "HYA");
    m.put("�q��", "HYU");
    m.put("�q��", "HYO");
    m.put("����", "RYA");
    m.put("����", "RYU");
    m.put("����", "RYO");
    m.put("�M��", "GYA");
    m.put("�M��", "GYU");
    m.put("�M��", "GYO");
    m.put("�W��", "ZYA");
    m.put("�W��", "ZYU");
    m.put("�W��", "ZYO");
    m.put("�a��", "DYA");
    m.put("�a��", "DYU");
    m.put("�a��", "DYO");
    m.put("�r��", "BYA");
    m.put("�r��", "BYU");
    m.put("�r��", "BYO");
    m.put("�s��", "PYA");
    m.put("�s��", "PYU");
    m.put("�s��", "PYO");
    m.put("�[", "-");
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
        } else if ( s.charAt(i) == '�b' ) {
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