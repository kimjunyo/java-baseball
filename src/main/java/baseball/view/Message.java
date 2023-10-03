package baseball.view;

public interface Message {
    String START = "숫자 야구 게임을 시작합니다.";
    String CONTINUE = "새로운 게임을 하시려면 1, 종료하려면 2";
    String ENTER = "숫자를 입력해주세요 : ";
    String CORRECT = "모두 맞히셨습니다! 게임 종료";
    String STRIKE = "스트라이크";
    String BALL = "볼";
    String NOTHING = "낫싱";
    String ThreeNumException = "세 자리수만 입력해 주세요.";
    String NumException = "숫자만 입력해 주세요.";
    String DifferentException = "자릿수가 서로 다른 수를 입력해 주세요.";
    String NullException = "숫자를 입력해 주세요.";
}