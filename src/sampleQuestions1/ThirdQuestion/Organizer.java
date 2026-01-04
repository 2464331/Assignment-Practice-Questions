package sampleQuestions1.ThirdQuestion;

// Organizer class
//class Organizer extends ParticipantInfo {
//    private int ticketsAvailable;
//
//    public Organizer(String participantId, String name, String email, long phoneNumber, int ticketsAvailable) {
//        super(participantId, name, email, phoneNumber);
//        this.ticketsAvailable = ticketsAvailable;
//    }
//
//    public int getTicketsAvailable() {
//        return ticketsAvailable;
//    }
//
//    public void setTicketsAvailable(int ticketsAvailable) {
//        this.ticketsAvailable = ticketsAvailable;
//    }
//
//    public double calculateSellingRevenue(int ticketsToSell, double pricePerTicket) {
//        if (ticketsToSell > ticketsAvailable) {
//            return -1;
//        }
//        return ticketsToSell * pricePerTicket;
//    }
//}



class Organizer extends ParticipantInfo{
    private int ticketsAvailable;

    public Organizer(String participantId, String name, String email, long phoneNumber, int ticketsAvailable){
        super(participantId, name, email, phoneNumber);
        this.ticketsAvailable = ticketsAvailable;

    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    public void setTicketsAvailable(int ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }


    public double calculateSellingRevenue(int ticketsToSell, double pricePerTicket){
        if(ticketsToSell > ticketsAvailable){
            return -1;
        }
        else{
            return ticketsToSell * pricePerTicket;
        }
    }
}