import java.util.Scanner;

import java.util.InputMismatchException;

public class TryCatchTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài 3 cạnh tam giác");
      try{  double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        TryCatchTriangle.IllegalTriangleException(a, b, c);
    } catch (InputMismatchException e) {
        System.out.println("Khong phai la so thuc");
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
    } catch (Exception e) {
        System.out.println("Error");
    } finally {
        System.out.println("End");
    }

}

    public static void IllegalTriangleException(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
            throw new ArithmeticException("Triangle");
        } else {
            throw new ArithmeticException("Not a triangle");
        }
    }
    }

