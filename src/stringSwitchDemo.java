/**
 * Created by tfabella on 9/21/2017.
 * In Java SE 7 and later, you can use a String object in the switch statement's expression.
 * The following code example, StringSwitchDemo, displays the number of the month based on the value of the String named month:
 * The output from this code is 8.
 *
 * The String in the switch expression is compared with the expressions associated with each case label as if the String.equals method were being used.
 * In order for the StringSwitchDemo example to accept any month regardless of case, month is converted to lowercase (with the toLowerCase method),
 * and all the strings associated with the case labels are in lowercase.
 * Note: This example checks if the expression in the switch statement is null. Ensure that the expression in any switch statement is not null
 * to prevent a NullPointerException from being thrown.
 */
public class stringSwitchDemo {
    public static int getMonthNumber(String month) {

        int monthNumber = 0;

        if (month == null) {
            return monthNumber;
        }

        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }

        return monthNumber;
    }

    public static void main(String[] args) {

        String month = "August";

        int returnedMonthNumber =
                stringSwitchDemo.getMonthNumber(month);

        if (returnedMonthNumber == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(returnedMonthNumber);
        }
    }
}