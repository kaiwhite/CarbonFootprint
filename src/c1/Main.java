package c1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Start = new Scanner(System.in);
        CarbonFootprint User1 = new CarbonFootprint();
        System.out.println("User ID: ");
        String UserID = Start.nextLine();
        User1.ID(UserID);
    }
}
