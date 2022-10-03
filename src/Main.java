import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double metricMeters;
        double metersMiles;
        double metersFeet;
        double metersInches;
        String trash = "";

        System.out.println("Enter a measurement in meters: ");

        if(in.hasNextDouble())
        {
            metricMeters = in.nextDouble();
            metersMiles = metricMeters * 0.000621;
            metersFeet = metricMeters * 3.28;
            metersInches = metricMeters * 39.37;
            System.out.println("The measurement in miles is " + metersMiles);
            System.out.println("The measurement in feet is " + metersFeet);
            System.out.println("The measurement in inches is " + metersInches);
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Incorrect values. Try again.");
        }
    }
}