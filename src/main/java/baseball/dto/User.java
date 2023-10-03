package baseball.dto;

import baseball.util.InputException;
import baseball.view.Message;

public class User {
    private final int first;
    private final int second;
    private final int third;

    public User(int userNum) throws InputException {
        this.first = userNum / 100;
        this.second = (userNum % 100) / 10;
        this.third = (userNum % 100) % 10;

        if (this.first == this.second || this.first == this.third || this.second == this.third) {
            InputException e = new InputException(Message.DifferentException);
            throw e;
        }
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }
}
