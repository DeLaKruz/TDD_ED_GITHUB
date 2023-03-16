public class FizzBuzz {
    public String pedirNumero(int n){
        String n2 = "";

        if (n%3 == 0 && n%5 == 0){
            return "FizzBuzz";
        } else if (n%3 == 0) {
            return "Fizz";
        } else if (n%5 == 0){
            return "Buzz";
        } else {
            return n2 + n;
        }
    }
}
