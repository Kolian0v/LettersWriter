import java.util.Scanner;

public class Parser {
    public long getNum() {
        return num;
    }

    private long num;

    public Parser(String[] num) {
        this.num = Integer.parseInt(num[0]);
    }
    public Parser() {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextLong();
    }
}
