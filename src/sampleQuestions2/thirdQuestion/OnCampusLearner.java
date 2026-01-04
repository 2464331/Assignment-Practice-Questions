package sampleQuestions2.thirdQuestion;

public class OnCampusLearner extends Learner{
    private double labFee;

    public OnCampusLearner(long learnerID, String learnerName, String programName, int durationInMonths, double baseFee, double labFee) {
        super(learnerID, learnerName, programName, durationInMonths, baseFee);
        this.labFee = labFee;
    }

    public double getLabFee() {
        return labFee;
    }

    public void setLabFee(double labFee) {
        this.labFee = labFee;
    }

    public double calculateOnCampusFee(){
        int duration = getDurationInMonths();
        double base = getBaseFee();
        if(!(duration>=0 && duration<=24)){
            return -1;
        }
        return (base* duration) + labFee;
    }
}
