public class main {
    public static void main(String[] args) {
        Parser parser;

        if (args.length == 0)
            parser = new Parser();
        else
            parser = new Parser(args);

        long i = 1000000000000000000L;
        while (parser.getNum() / i == 0)
            i/=10;
        i *= 10;
        printLetters(parser.getNum(), i, 0);
        System.out.println("");

        main(args);
    }

    private static void printLetters(long num, long i, int order) {
        if (i == 0)
            return;

        printLetters(num/1000, i/1000, order+1);

        long num2 = num % i;

        IsMany is_many = new IsMany();

        printHundreds(num2, is_many);

        printTens(num2 % 100, is_many);

        printUnits(num2 % 10, is_many);

        if (num2 % 1000 != 0)
            printOrders(order, is_many);
    }

    private static void printOrders(int order, IsMany is_many) {
        switch (order){
            case (1):
                if (is_many.isMany() == true)
                    System.out.print("thousands ");
                else
                    System.out.print("thousand ");
                break ;
            case (2):
                if (is_many.isMany() == true)
                    System.out.print("millions ");
                else
                    System.out.print("million ");
                break ;
            case (3):
                if (is_many.isMany() == true)
                    System.out.print("billions ");
                else
                    System.out.print("billion ");
                break ;
            case (4):
                if (is_many.isMany() == true)
                    System.out.print("trillions ");
                else
                    System.out.print("trillion ");
                break ;
            case (5):
                if (is_many.isMany() == true)
                    System.out.print("quadrillions ");
                else
                    System.out.print("quadrillion ");
                break ;
            case (6):
                if (is_many.isMany() == true)
                    System.out.print("quintillions ");
                else
                    System.out.print("quintillion ");
                break ;
            case (7):
                if (is_many.isMany() == true)
                    System.out.print("sextillions ");
                else
                    System.out.print("sextillion ");
                break ;
            default:
                break ;
        }
    }

    private static void printUnits(long num2, IsMany is_many) {
        if (is_many.isTens() == false)
        switch ((int) num2){
            case (1):
                System.out.print("one ");
                break ;
            case (2):
                System.out.print("two ");
                is_many.setMany(true);
                break ;
            case (3):
                System.out.print("three ");
                is_many.setMany(true);
                break ;
            case (4):
                System.out.print("four ");
                is_many.setMany(true);
                break ;
            case (5):
                System.out.print("five ");
                is_many.setMany(true);
                break ;
            case (6):
                System.out.print("six ");
                is_many.setMany(true);
                break ;
            case (7):
                System.out.print("seven ");
                is_many.setMany(true);
                break ;
            case (8):
                System.out.print("eight ");
                is_many.setMany(true);
                break ;
            case (9):
                System.out.print("nine ");
                is_many.setMany(true);
                break ;
            default:
                break ;
        }
    }

    private static void printTens(long num2, IsMany is_many) {
        switch ((int) (num2/10%10)){
            case (1):
                switch ((int) (num2 % 10)){
                    case (1):
                        System.out.print("eleven ");
                        is_many.setMany(true);
                        is_many.setTens(true);
                        break ;
                    case (2):
                        System.out.print("twelve ");
                        is_many.setMany(true);
                        is_many.setTens(true);
                        break ;
                    case (3):
                        System.out.print("thirteen ");
                        is_many.setMany(true);
                        is_many.setTens(true);
                        break ;
                    case (4):
                        System.out.print("fourteen ");
                        is_many.setMany(true);
                        is_many.setTens(true);
                        break ;
                    case (5):
                        System.out.print("fiveteen ");
                        is_many.setMany(true);
                        is_many.setTens(true);
                        break ;
                    case (6):
                        System.out.print("sixteen ");
                        is_many.setMany(true);
                        is_many.setTens(true);
                        break ;
                    case (7):
                        System.out.print("seventeen ");
                        is_many.setMany(true);
                        is_many.setTens(true);
                        break ;
                    case (8):
                        System.out.print("eighteen ");
                        is_many.setMany(true);
                        is_many.setTens(true);
                        break ;
                    case (9):
                        System.out.print("nineteen ");
                        is_many.setMany(true);
                        is_many.setTens(true);
                        break ;
                    default:
                        System.out.print("ten ");
                        is_many.setMany(true);
                        is_many.setTens(true);
                }
                break ;
            case (2):
                System.out.print("twenty ");
                is_many.setMany(true);
                break ;
            case (3):
                System.out.print("thirty ");
                is_many.setMany(true);
                break ;
            case (4):
                System.out.print("fourty ");
                is_many.setMany(true);
                break ;
            case (5):
                System.out.print("fifty ");
                is_many.setMany(true);
                break ;
            case (6):
                System.out.print("sixty ");
                is_many.setMany(true);
                break ;
            case (7):
                System.out.print("seventy ");
                is_many.setMany(true);
                break ;
            case (8):
                System.out.print("eighty ");
                is_many.setMany(true);
                break ;
            case (9):
                System.out.print("ninety ");
                is_many.setMany(true);
                break ;
            default:
                break ;
        }
    }

    private static void printHundreds(long num2, IsMany is_many) {
        switch ((int) (num2/100%10)){
            case (1):
                System.out.print("one hundred ");
                is_many.setMany(true);
                break ;
            case (2):
                System.out.print("two hundreds ");
                is_many.setMany(true);
                break ;
            case (3):
                System.out.print("three hundreds ");
                is_many.setMany(true);
                break ;
            case (4):
                System.out.print("four hundreds ");
                is_many.setMany(true);
                break ;
            case (5):
                System.out.print("five hundreds ");
                is_many.setMany(true);
                break ;
            case (6):
                System.out.print("six hundreds ");
                is_many.setMany(true);
                break ;
            case (7):
                System.out.print("seven hundreds ");
                is_many.setMany(true);
                break ;
            case (8):
                System.out.print("eight hundreds ");
                is_many.setMany(true);
                break ;
            case (9):
                System.out.print("nine hundreds ");
                is_many.setMany(true);
                break ;
            default:
        }
    }
}
