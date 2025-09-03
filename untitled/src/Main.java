
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Osama Hitler = new Osama(69, "Adolf");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int j = 0; j<n; j++ ) {
            System.out.println("Hello World");
        }
        Hitler.getAge();
    }
}
class Osama {
    int age;
    String name;
    Osama(int a, String s) {
        this.age = a;
        this.name = s;
    }
    public void getName() {
        System.out.println(name);
    }
    public void getAge() {
        System.out.printf("Age of %s is %d", name, age);
    }
}