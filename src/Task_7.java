import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_7 {
    public static void main(String[] args) throws IOException {

        System.out.println("Введитес консоли число:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num = reader.readLine();
        int number = Integer.parseInt(num);
        int x = 3;
        int y = 6;
        int z = 9;

        if (number == x | number == y | number == z ){

            System.out.println("Данное значение имеется в константах");}

        else {
            System.out.println("Такой константы нет!");
        }
    }

}

