public class FizzBuzz {

    public void execute() {
    }

    public String processNumber(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number == 5) {
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
