
public class Statistics {

    private int count;
    private int sum;
    private int sumEven;
    private int sumOdd;

    public Statistics(){
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
        if (number % 2 == 0) {
            this.sumEven += number;
        } else {
            this.sumOdd += number;
        }
        // TODO
    }
    public int getCount() {
        return this.count;
        // TODO
    }

    public int sum() {
        return this.sum;
        // TODO
    }

    public double average() {
        return 1.0*this.sum/this.count;
        // TODO
    }

    public int sumEven() {
        return this.sumEven;
    }

    public int sumOdd() {
        return this.sumOdd;
    }



}
