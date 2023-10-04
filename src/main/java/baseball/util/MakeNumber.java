package baseball.util;

import baseball.dto.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MakeNumber {
    public static List<Integer> makeRandomNumber() {
        int computerFirst = 0;
        int computerSecond = 0;
        int computerThird = 0;
        Random random = new Random();
        while (computerFirst == computerSecond || computerFirst == computerSecond || computerSecond == computerThird) {
            computerFirst = random.nextInt(9) + 1;
            computerSecond = random.nextInt(9) + 1;
            computerThird = random.nextInt(9) + 1;
        }
        List<Integer> computerNum = new ArrayList<>();
        computerNum.add(computerFirst);
        computerNum.add(computerSecond);
        computerNum.add(computerThird);
        return computerNum;
    }

    public static List<Integer> makeUserNumber(User user) {
        List<Integer> userNum = new ArrayList<>();
        userNum.add(user.getFirst());
        userNum.add(user.getSecond());
        userNum.add(user.getThird());
        return userNum;
    }
}
