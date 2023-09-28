package tasks;

import util.Ks;

import java.util.Locale;
import java.util.Stack;

public class FirstTask {

    public static boolean balanced(String symbolsSequence) {
        int len = symbolsSequence.length();
        if (len % 2 == 1)
            return false;

        Stack<Byte> Bytes = new Stack<>();
        for (int i = 0; i < len; i++) {
            byte primitiveByte = (byte)symbolsSequence.charAt(i);
            if (!Bytes.isEmpty()) {
                int valid = primitiveByte - Bytes.peek();
                if (valid == 1 || valid == 2) {
                    Bytes.pop();
                    continue;
                }
            }
            Bytes.push(primitiveByte);
        }

        return Bytes.isEmpty();
    }

    public static void main(String[] args) {
        // suvienodiname skaičių formatus pagal LT lokalę (10-ainis kablelis)
        Locale.setDefault(new Locale("LT"));

        while (true){
            String sequence = Ks.giveString("Įveskite duomenis: ");
            Ks.oun(balanced(sequence));
        }
    }
}
