public class JobApplicant {
    private String name;
    private double phoneNumber;

    private boolean wordProcessing;
    private boolean spreadsheets;
    private boolean databases;
    private boolean graphics;

    public JobApplicant(String name, double phoneNumber, boolean wordProcessing,
                        boolean spreadsheets, boolean databases, boolean graphics) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.wordProcessing = wordProcessing;
        this.spreadsheets = spreadsheets;
        this.databases = databases;
        this.graphics = graphics;
    }

    public String getName() {
        return name;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public boolean getWordProcessing() {
        return wordProcessing;
    }

    public boolean getSpreadsheets() {
        return spreadsheets;
    }

    public boolean getDatabases() {
        return databases;
    }

    public boolean getGraphics() {
        return graphics;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWordProcessing(boolean wordProcessing) {
        this.wordProcessing = wordProcessing;
    }

    public void setSpreadsheets(boolean spreadsheets) {
        this.spreadsheets = spreadsheets;
    }

    public void setDatabases(boolean databases) {
        this.databases = databases;
    }

    public void setGraphics(boolean graphics) {
        this.graphics = graphics;
    }

}
