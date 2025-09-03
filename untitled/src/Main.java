
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Osama Hitler = new Osama(69, "Adolf");
        Zhirinovsky Zmievsky = new Zhirinovsky(true, 14, 88, "Igor");
        Zmievsky.Show_name();


        Scanner in = new Scanner(System.in);
        String Ss = in.next();
        //int n = in.nextInt();
        //for (int j = 0; j<n; j++ ) {
        //    System.out.println("Hello World");
        //}
        Zmievsky.switch_name(Ss);
        Zmievsky.Show_name();
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
class Zhirinovsky {
    boolean Is_gay;
    int age;
    int kills;
    String name;
    Zhirinovsky() {
        this(true, 69, 52, "undefined");

    }
    Zhirinovsky(boolean b, int a,int  k, String s) {
        this.Is_gay = b;
        this.age = a;
        this.kills = k;
        this.name = s;
    }
    public void Is_Gay() {
        System.out.println(Is_gay);
    }
    public void switch_name(String ss) {
        this.name = ss;
    }
    public void Show_name() {
        System.out.println(name);
    }
}