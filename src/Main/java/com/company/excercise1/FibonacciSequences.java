package Main.java.com.company.excercise1;

public class FibonacciSequences {


    /**
     * @param numberN number of sequence Fibonacci download from user which this method calculate
     * @param number1 first number of Fibonacci sequence- constant
     * @param number2 second number of Fibonacci sequence- constant
     */
    public long calculateSequenceNumber(long number1, long number2, byte numberN){

        if (numberN == 1){
            return number1;
        }
        if (numberN == 2) {
            return number2;
        }

        return calculateSequenceNumber(number2, number1+number2, --numberN);
    }

}
