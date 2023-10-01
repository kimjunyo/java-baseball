package baseball.dto;

public class User {
    private final int first;
    private final int second;
    private final int third;

    public User(int userNum) {
        this.first = userNum / 100;
        this.second = (userNum % 100) / 10;
        this.third = (userNum % 100) % 10;
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
