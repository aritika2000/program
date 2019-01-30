import java.util.*;
public class years {

    public static void main(String[] Strings) {


        double minutesInYear = 60 * 24 * 365;

        Scanner s1 = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = s1.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) ;
        int months = (int) (min/60/24/30) ;

        System.out.println((int) min + " minutes is approximately " + years + " years  " + months + " months and " + days + " days");
    }}