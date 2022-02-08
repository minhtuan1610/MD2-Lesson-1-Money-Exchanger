import java.util.Scanner;

public class MoneyExchanger {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien USD muon chuyen");
        usd = scanner.nextDouble();
        double money = usd * vnd;
        System.out.print("VND: " + money);
    }
}