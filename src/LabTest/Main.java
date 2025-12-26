package LabTest;
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        LabTestInfo labTestInfo = new LabTestInfo();
//
//        System.out.println("Enter the number of lab test details to be added");
//        int n = sc.nextInt();
//        sc.nextLine(); // consume newline
//
//        System.out.println("Enter lab test details (testName:cost)");
//        for (int i = 0; i < n; i++) {
//            String testDetails = sc.nextLine();
//            labTestInfo.addTestDetails(testDetails);
//        }
//
//        System.out.println("Enter the minimum cost");
//        int minCost = sc.nextInt();
//
//        System.out.println("Enter the maximum cost");
//        int maxCost = sc.nextInt();
//
//        List<String> result = labTestInfo.getTestsWithinGivenCostRange(minCost, maxCost);
//
//        if (result.isEmpty()) {
//            System.out.println("No Tests found within the specified cost range");
//        } else {
//            System.out.println("Tests with cost between " + minCost + " and " + maxCost + " INR:");
//            for (String test : result) {
//                System.out.println(test);
//            }
//        }
//    }
//}

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LabTestInfo labtestinfo = new LabTestInfo();
        System.out.println("How many test details you have");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter lab test details(testName:cost)");
        for(int i = 0; i<n; i++){
            String test = sc.nextLine();
            labtestinfo.addTestDetails(test);
        }

        System.out.println("Enter minimum cost you want");
        int minCost = sc.nextInt();
        System.out.println("Enter maximum cost you want");
        int maxCost = sc.nextInt();

        List<String> result = labtestinfo.getTestsWithinGivenCostRange(minCost, maxCost);
        if(result.isEmpty()){
            System.out.println("no test found within the specified cost range");
        }
        else{
            for(String test: result){
                System.out.println(test);
            }
        }

    }
}
