import java.util.Scanner;

class Source {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(squareOfSum(number1, number2));
    }


    public static int squareOfSum(int x, int y){
        return (x + y) * (x + y);
    }
}