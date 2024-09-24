import java.util.Scanner;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    INVALID_DAY;

    public static Day getDay(int userInput) {
        switch (userInput) {
            case 1:
                return SUNDAY;
            case 2:
                 return MONDAY;
            case 3:
                 return TUESDAY;
            case 4:
                 return WEDNESDAY;
            case 5:
                 return THURSDAY;
            case 6:
                 return FRIDAY;
            case 7:
                return SATURDAY;
            default:
                return INVALID_DAY;
        }
    }
}
public class WeekDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayInput = input.nextInt();

        System.out.println(Day.getDay(dayInput));

    }
}
