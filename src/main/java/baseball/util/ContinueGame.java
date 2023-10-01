package baseball.util;

import baseball.view.Message;

import static baseball.Application.computerNum;
import static baseball.Application.scan;

public class ContinueGame {
    public static boolean contiune(boolean match) {
        if (match) {
            System.out.println(Message.CORRECT);
            System.out.println(Message.CONTINUE);
            int continueNum = scan.nextInt();
            if (continueNum == 1) {
                computerNum = MakeNumber.makeRandomNumber();
            } else {
                return false;
            }
        }
        return true;
    }
}
