package fizzbuzz;

class FizzBuzz {

    public String test(int number) {
        if (isDivisivelPor5(number) && isDivisivelPor3(number)) {
            return "Fizz Buzz";
        }
        if (isDivisivelPor5(number)) {
            return "Buzz";
        }
        if (isDivisivelPor3(number)) {
            return "Fizz";
        }

        return String.valueOf(number);
    }

    private static boolean isDivisivelPor3(int number) {
        return (number % 3) == 0;
    }

    private static boolean isDivisivelPor5(int number) {
        return (number % 5) == 0;
    }

}
