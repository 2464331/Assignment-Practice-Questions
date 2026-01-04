package sampleQuestions2.thirdQuestion;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String parts[] = input.split(":");

        String learnerType = parts[0];
        long learnerId = Long.parseLong(parts[1]);
        String learnerName = parts[2];
        String programName = parts[3];
        int durationInMonths = Integer.parseInt(parts[4]);
        double baseFee = Double.parseDouble(parts[5]);

        if(learnerType.equalsIgnoreCase("OnCampus")){
            double labFee = Double.parseDouble(parts[6]);
            OnCampusLearner onCampusLearner = new OnCampusLearner(learnerId, learnerName, programName, durationInMonths, baseFee, labFee);
            double totalFee =  onCampusLearner.calculateOnCampusFee();
            if(totalFee == -1){
                System.out.println("You have provided invalid duration as " + durationInMonths + " for on-campus learner " + learnerName);
            }
            else{
                System.out.println("Calculated on-campus training fees for learner " + learnerName + " is " + totalFee);
            }
        } else if (learnerType.equalsIgnoreCase("Online")) {
            double platformFee = Double.parseDouble(parts[6]);
            OnlineLearner onlineLearner = new OnlineLearner(learnerId, learnerName, programName, durationInMonths, baseFee, platformFee);
            double totalFee = onlineLearner.calculateOnlineFee();
            if(totalFee == -1){
                System.out.println("You have provided invalid duration as " + durationInMonths + " for online learner " + learnerName);
            }
            else{
                System.out.println("Calculated on-campus training fees for learner " + learnerName + " is " + totalFee);
            }

        }
    }
}
