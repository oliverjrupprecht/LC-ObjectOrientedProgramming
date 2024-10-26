public class CustomerData {
    private double talkMinutess;
    private double talkMessages;
    private double dataNeeded;

    public void CustomerData(double talkMinutess, double talkMessages, double dataNeeded) {
        this.talkMinutess = talkMinutess;
        this.talkMessages = talkMessages;
        this.dataNeeded = dataNeeded;
    }

    public void setTalkMinutess(double talkMinutess) {
        this.talkMinutess = talkMinutess;
    }

    public void setTalkMessages(double talkMessages) {
        this.talkMessages = talkMessages;
    }

    public void setDataNeeded(double dataNeeded) {
        this.dataNeeded = dataNeeded;
    }

    public double getDataNeeded() {
        return dataNeeded;
    }

    public double getTalkMessages() {
        return talkMessages;
    }

    public double getTalkMinutess() {
        return talkMinutess;
    }
}
