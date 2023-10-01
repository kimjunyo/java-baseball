package baseball.util;

import baseball.view.Message;

import java.util.List;

public class MatchNumber {

    public static boolean matchNumber(List<Integer> computerNum, List<Integer> userNum) {
        int strike = 0;
        int ball = 0;
        boolean match = false;
        for (int i = 0; i < 3; i++) {
            if (userNum.get(i).equals(computerNum.get(i))) strike++;
            else if (computerNum.contains(userNum.get(i))) ball++;
        }

        System.out.println(judge(strike, ball));

        if (strike == 3) {
            match = true;
        }
        return match;
    }

    static String judge(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            return Message.NOTHING;
        } else if (strike == 0) {
            return ball + Message.BALL;
        } else if (ball == 0) {
            return strike + Message.STRIKE;
        } else {
            return ball + Message.BALL + " " + strike + Message.STRIKE;
        }
    }
}
