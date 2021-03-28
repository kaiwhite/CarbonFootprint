package c1;

import java.util.*;

public class CarbonFootprint {
    public static Double TotalGrams;
    public static Double CarbonImpact;
    Scanner number = new Scanner(System.in);
    Scanner string = new Scanner(System.in);

    public void ID(String UserID) {
        HashMap User = new HashMap();
        boolean MoreUsers = true;

        PlasticFootprint();

        MilesDriven();

        ArrayList Week = new ArrayList();
        double[] UserInfo = new double[2];
        String Person = (String) User.put(UserID, Week);
        if (MoreUsers) {
            System.out.println("Do you have more people? (Answer yes or no)");
            String More = string.nextLine();
            if (More.equals("Yes") || More.equals("yes")){
                System.out.println("Enter User ID");
                String New = string.nextLine();
                ID(New);
            }
            else {
                MoreUsers = false;
            }
        }

        UserInfo[0] = CarbonImpact;
        UserInfo[1] = TotalGrams;

        Week.add(UserInfo);
        User.put(UserID, Week);

        Set<Map.Entry<String, Double>> entries = User.entrySet();

        for (Map.Entry<String, Double> entry : entries) {
            System.out.print(entry.getKey() + ":");
            System.out.println(" Carbon Impact per week "+ Arrays.toString(UserInfo));
        }

        System.out.println("Your plastic footprint per week: " + (TotalGrams) + " grams.");
        System.out.println("Your plastic footprint per year: " + (TotalGrams * 52) + " grams.");
        System.out.println("Your car's carbon impact per week is " + CarbonImpact + " Pounds of CO2");
        System.out.println("Your car's carbon impact per year is " + (CarbonImpact * 52) + " Pounds of CO2");
        }


        public void PlasticFootprint () {
            System.out.println("How many plastic bottles have you used this week?");
            int NumberOfBottles = number.nextInt();
            System.out.println("How many plastic bags have you used this week?");
            int NumberOfBags = number.nextInt();
            Double GramsPerWeekBottle = 9.9 * NumberOfBottles;
            Double GramsPerWeekBag = 5.5 * NumberOfBags;
            TotalGrams = GramsPerWeekBag + GramsPerWeekBottle;
            return;
        }

        public void MilesDriven () {
            System.out.println("Is your car Diesel? (Type yes or no)");
            String Diesel = string.nextLine();
            System.out.println("How many miles did you drive this week?");
            int MilesDriven = number.nextInt();
            System.out.println("What is your car's MPG?");
            int MPG = number.nextInt();
            double Calc = MilesDriven / MPG;
            if (Diesel.equals("Yes") || Diesel.equals("yes")) {
                CarbonImpact = 22.38 * Calc;
                return;
            } else {
                CarbonImpact = 19.6 * Calc;
                return;
            }
        }
        public void Account() {
            System.out.println("Make a user ID");
            String ID = string.nextLine();
            ID(ID);
        }

}
