import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        System.out.println("Hello");
    double Chieucao;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập Chiều Cao = ");
    Chieucao = scanner.nextDouble();

    double Cannang;
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Nhập Cân Nặng = ");
    Cannang = scanner2.nextDouble();

    double BMI;
    BMI =  Cannang/(Chieucao*2);

    if (BMI < 16) {
            System.out.println("BMI =" + BMI + " Gầy độ III ");
        }else if (BMI >= 16 & BMI < 17) {
        System.out.println("BMI =" + BMI + " Gầy độ II ");
        }else if (BMI >= 17 & BMI < 18.5) {
        System.out.println("BMI =" + BMI + " Gầy độ I ");
        }else if (BMI >= 18.5 & BMI < 25) {
        System.out.println("BMI =" + BMI + " Bình thường ");
        }else if (BMI >= 25 & BMI < 30) {
        System.out.println("BMI = " + BMI + " Thừa cân ");
        }else if (BMI >= 30 & BMI < 35) {
        System.out.println("BMI = " + BMI + " Béo phì độ I ");
        }else if (BMI >= 35 & BMI <40) {
        System.out.println("BMI = " + BMI + " Béo phì độ II ");
        }else if (BMI>40){
        System.out.println("BMI = " + BMI + " Béo phì độ III ");
        }
    }
}
