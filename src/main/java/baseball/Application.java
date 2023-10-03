package baseball;

import baseball.dto.User;
import baseball.util.ContinueGame;
import baseball.util.InputException;
import baseball.util.MakeNumber;
import baseball.util.MatchNumber;
import baseball.view.Message;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Application {

    static boolean continueGame = true;
    public static List<Integer> computerNum = MakeNumber.makeRandomNumber();
    public static Scanner scan = new Scanner(System.in);

    public static int inputUser() throws InputException {
        int userNum = scan.nextInt();
        if (userNum < 100 || userNum > 999) {
            InputException e = new InputException(Message.ThreeNumException);
            throw e;
        }
        if (Objects.isNull(userNum)) {
            InputException e = new InputException(Message.NullException);
            throw e;
        }
        return userNum;
    }

    public static void main(String[] args) {
        System.out.println(Message.START);
        while (continueGame) {
            System.out.println(computerNum);
            System.out.print(Message.ENTER);
            int userNum = 0;
            try {
                userNum = inputUser();
            } catch (InputException ie) {
                System.out.println(ie.getMessage());
                continue;
            } catch (InputMismatchException ime) {
                System.out.println(Message.NumException);
                scan.nextLine();
                continue;
            }

            User user = null;
            try {
                user = new User(userNum);
            } catch (InputException e) {
                System.out.println(e.getMessage());
                continue;
            }
            List<Integer> userNumList = MakeNumber.makeUserNumber(user);

            boolean match = MatchNumber.matchNumber(computerNum, userNumList);
            continueGame = ContinueGame.contiune(match);

        }
        scan.close();
    }
}
