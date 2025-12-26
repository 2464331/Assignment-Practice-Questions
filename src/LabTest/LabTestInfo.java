package LabTest;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LabTestInfo {
//    // Private attribute to store test details
//    private List<String> testList;
//
//    // Constructor
//    public LabTestInfo() {
//        testList = new ArrayList<>();
//    }
//
//    // Requirement 1: Add test details
//    public void addTestDetails(String testDetails) {
//        // testDetails format: "testName:cost"
//        if (testDetails != null && testDetails.contains(":")) {
//            testList.add(testDetails);
//        } else {
//            System.out.println("Invalid test detail format. Use testName:cost");
//        }
//    }
//
//    // Requirement 2: Get tests within given cost range
//    public List<String> getTestsWithinGivenCostRange(int minimumCost, int maximumCost) {
//        List<String> filteredTests = new ArrayList<>();
//
//        for (String detail : testList) {
//            String[] parts = detail.split(":");
//            String testName = parts[0];
//            int cost = Integer.parseInt(parts[1]);
//
//            if (cost >= minimumCost && cost <= maximumCost) {
//                filteredTests.add(testName);
//            }
//        }
//
//        return filteredTests;
//    }
//}


import java.util.*;

public class LabTestInfo{
    private List<String> testlink;

    public LabTestInfo(){
        testlink = new ArrayList<>();
    }
    public void addTestDetails(String testDetails){
        if(testDetails != null && testDetails.contains(":")){
            testlink.add(testDetails);
        }
        else{
            System.out.println("Invalid test detail format. use testName:cost");
        }
    }

    public List<String> getTestsWithinGivenCostRange(int minimunCost, int maximumCost){
        List<String> filteredTests = new ArrayList<>();

        for(String detail : testlink){
            String parts[] = detail.split(":");
            String testName = parts[0];
            int cost = Integer.parseInt(parts[1]);

            if(cost >= minimunCost && cost <= maximumCost){
                filteredTests.add(testName);
            }
        }
        return filteredTests;
    }

}
