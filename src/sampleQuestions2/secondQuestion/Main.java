package sampleQuestions2.secondQuestion;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("Enter freelancer details: ");
        Scanner sc = new Scanner(System.in);
        String freelancerDetails = sc.nextLine();
        FreelanceUtility freelanceUtility = new FreelanceUtility();


        System.out.println(freelanceUtility.extractDetails(freelancerDetails).freelancerID);
        System.out.println(freelanceUtility.extractDetails(freelancerDetails).freelancerName);
        System.out.println(freelanceUtility.extractDetails(freelancerDetails).hourlyRate);
        System.out.println(freelanceUtility.extractDetails(freelancerDetails).hoursWorked);
        System.out.println(freelanceUtility.extractDetails(freelancerDetails).serviceChargePercentage);
        System.out.println(freelanceUtility.extractDetails(freelancerDetails).calculatePaymet());
    }
}
