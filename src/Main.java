import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Main main = new Main();
        FileReader fileReader = new FileReader("ab.txt");

        FileWriter fileWriter = new FileWriter("a.txt");

        Scanner scanner = new Scanner(fileReader);
        int b = main.factorial(scanner.nextInt());
        String string = Integer.toString(b);
        fileWriter.write(string);

        fileReader.close();
        fileWriter.close();
        System.out.println(b);
    }
    int factorial(int x){
        if (x == 1) {
            return 1;
        }
        return x*factorial(x-1);
    }
}