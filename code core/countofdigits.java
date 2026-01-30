package PST;

public class countofdigits {

    public static void main(String[] args) {
        int num = 123456789;
        int countOfDigits = 0;

        while (num != 0) {
            num = num / 10;
            countOfDigits++;
        }

        
        System.out.println(" count of digits: " + countOfDigits);
    }
}




