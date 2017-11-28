import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.Character;
import javax.sound.midi.SysexMessage;

class brailleTranslation
{   

    public static String answer(String plaintext)
    {
        Map<Character,String> dict = new HashMap<Character,String>();
        dict.put('a',"100000");
        dict.put('b',"110000");
        dict.put('c',"100100");
        dict.put('d',"100110");
        dict.put('e',"100010");
        dict.put('f',"110100");
        dict.put('g',"110110");
        dict.put('h',"110010");
        dict.put('i',"010100");
        dict.put('j',"010110");
        dict.put('k',"101000");
        dict.put('l',"111000");
        dict.put('m',"101100");
        dict.put('n',"101110");
        dict.put('o',"101010");
        dict.put('p',"111100");
        dict.put('q',"111110");
        dict.put('r',"111010");
        dict.put('s',"011100");
        dict.put('t',"011110");
        dict.put('u',"101001");
        dict.put('v',"111001");
        dict.put('w',"010111");
        dict.put('x',"101101");
        dict.put('y',"101111");
        dict.put('z',"101011");

        StringBuilder stringBuilder = new StringBuilder();
        for(char ch : plaintext.toCharArray())
            {
                if(Character.isUpperCase(ch))
                    stringBuilder.append("000001");

                if(ch == ' ')
                    stringBuilder.append(dict.get("000000"));
                
                else if(dict.containsKey(ch))
                    stringBuilder.append(dict.get(ch));
            }        
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String test = "code";
        answer(test);
    }
}