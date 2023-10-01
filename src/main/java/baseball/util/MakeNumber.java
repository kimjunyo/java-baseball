package baseball.util;

import baseball.dto.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MakeNumber {
    public static List<Integer> makeRandomNumber() {
        List<Integer> computerNum = new ArrayList<>();
        Random random = new Random();
        int computerFirst = random.nextInt(9) + 1;
        int computerSecond = random.nextInt(9) + 1;
        int computerThird = random.nextInt(9) + 1;
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
