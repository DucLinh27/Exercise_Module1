import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten:");
        name = sc.nextLine();
        System.out.println("Moi nhap age:");
        age = sc.nextInt();
        System.out.println("Name"+" "+name+"\n"+ "age"+" "+age);

    }
}
