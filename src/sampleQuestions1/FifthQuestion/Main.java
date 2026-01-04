package sampleQuestions1.FifthQuestion;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LabTestInfo labTestInfo = new LabTestInfo();

        System.out.println("Enter the number of lab test details to be added: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter lab test details(testName:cost) ");
        for(int i = 0; i<n; i++){
            String temp = sc.nextLine();
            labTestInfo.addTest(temp);
        }

        System.out.println("enter the minimum cost: ");
        int min = sc.nextInt();
        sc.nextLine();

        System.out.println("enter the maximum cost: ");
        int max = sc.nextInt();
        sc.nextLine();

        List<String> results = labTestInfo.getTestWithinGivenRange(min, max);
        if(results.isEmpty()){
            System.out.println("no tests found within the specific cost range");
        }else{
            System.out.println("tests with cost between "+ min + " and "+ max+ " INR: ");
            for(String testName : results){
                System.out.println(testName);
            }
        }


    }
}
