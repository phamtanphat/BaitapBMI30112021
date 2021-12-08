import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số cân nặng : ");
            double cannang = sc.nextDouble();
            System.out.print("Nhập số chiều cao : ");
            double chieucao = sc.nextDouble();

        double BMI = cannang / (chieucao * chieucao);
        String x;
        if(BMI < 16) {
            System.out.println("BMI < 16");
            x = "gầy độ 3";
        }else if(BMI >= 16 && BMI < 17){
            System.out.println("16 <= BMI < 17");
            x = "gầy dộ 2";
        }else if(BMI >= 17 && BMI < 18.5){
            System.out.println("17 <= BMI < 18.5");
            x = "gầy dộ 1";
        }else if(BMI >= 18.5 && BMI < 25){
            System.out.println("18.5 <= BMI < 25");
            x = "bình thường";
        }else if(BMI >= 25 && BMI < 30){
            System.out.println("25 <= BMI < 30");
            x = "thừa cân";}
        else if(BMI >= 30 && BMI < 35){
            System.out.println("30 <= BMI < 35");
            x = "béo phì độ 1";
        }else if(BMI >= 35 && BMI < 40) {
            System.out.println("35 <= BMI < 40");
            x = "béo phì độ 2";
        }else{
            System.out.println("BMI > 40");
            x = "béo phì độ 3";
        }
        System.out.println("Chỉ số BMI của bạn là : " + BMI + " , Bạn " + x +".");
    }
}

