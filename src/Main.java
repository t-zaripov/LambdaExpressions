import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

//        причина в делении на 0, для ее предотвращения можно в классе Calculator
//        заменить BinaryOperator<Integer> devide = (x, y) -> x / y; на
//        BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;
        int c = calc.devide.apply(a, b);
        calc.println.accept(10);
    }
}
