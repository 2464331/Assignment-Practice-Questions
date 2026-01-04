package sampleQuestions2.thirdQuestion;

public class Learner {
    private long learnerID;
    private String learnerName;
    private String programName;
    private int durationInMonths;
    private double baseFee;

    public Learner(){}

    public Learner(long learnerID, String learnerName, String programName, int durationInMonths, double baseFee) {
        this.learnerID = learnerID;
        this.learnerName = learnerName;
        this.programName = programName;
        this.durationInMonths = durationInMonths;
        this.baseFee = baseFee;
    }

    public long getLearnerID() {
        return learnerID;
    }

    public void setLearnerID(long learnerID) {
        this.learnerID = learnerID;
    }

    public String getLearnerName() {
        return learnerName;
    }

    public void setLearnerName(String learnerName) {
        this.learnerName = learnerName;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }
}
