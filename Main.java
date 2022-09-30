import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        int alankare;
        int cevre;
        Scanner scanner =new Scanner(System.in);
        System.out.println("İlk kenari veriniz:");
        a= scanner.nextInt();
        System.out.println("ikinci kenari veriniz:");
        b= scanner.nextInt();
        System.out.println("ucuncu kenari veriniz:");
        c= scanner.nextInt();
       cevre=(a+b+c)/2;
       alankare=cevre*(cevre-a)*(cevre-b)*(cevre-c);
       double alan=Math.sqrt(alankare);
       System.out.println("Alan:"+alan);

    }
}