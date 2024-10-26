public class Numbers {
    private double num1;
    private double num2;
    private double num3;

    public Numbers(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    // Sort numbers in ascending order
    public void sortAscending() {
        double temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
    }

    // Sort numbers in descending order
    public void sortDescending() {
        double temp;

        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 < num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 < num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
    }

    @Override
    public String toString() {
        return "Number 1: " + num1 +
                "\nNumber 2: " + num2 +
                "\nNumber 3: " + num3;
    }
}

