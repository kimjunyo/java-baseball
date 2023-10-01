package baseball;

import baseball.dto.User;
import baseball.util.ContinueGame;
import baseball.util.MakeNumber;
import baseball.util.MatchNumber;
import baseball.view.Message;

import java.util.List;
import java.util.Scanner;

public class Application {

    static boolean continueGame = true;
    public static List<Integer> computerNum = MakeNumber.makeRandomNumber();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Message.START);
        while (continueGame) {
            System.out.println(computerNum);
            System.out.print(Message.ENTER);
            int userNum = scan.nextInt();
            User user = new User(userNum);
            List<Integer> userNumList = MakeNumber.makeUserNumber(user);

            boolean match = MatchNumber.matchNumber(computerNum, userNumList);
            continueGame = ContinueGame.contiune(match);
        }
    }
}
