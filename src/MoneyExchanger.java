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
    /*let amount1 = Number(document.getElementById("amount1").value);
    let from1 = Number(document.getElementById("from1").value);
    let to1 = Number(document.getElementById("to1").value);
    let rate = to1 / from1;
    let result1 = amount1 * rate;*/