import java.util.Scanner;
    //младше 14: прокол ушей в присутствии родителей;
    //     от 14 до 18: прокол ушей, пупка, языка, носа в присутствии родителей;
    //    от 18 лет: без ограничений.
public class GuessNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("vash vozrast: ");
            int vozrast = sc.nextInt();

                if (vozrast < 14) {
                    System.out.println("s roditelyami");
                }
                if (vozrast > 14 && vozrast < 18) {
                    System.out.println("s roditelyami ushi pupok nos");
                }
                if (vozrast > 18) {
                    System.out.println("bez roditelei");
                }


        }
    }

