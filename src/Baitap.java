import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        System.out.println("nhap chieu cao");
        float chieuCao = new Scanner(System.in).nextFloat();
        System.out.println("nhap can nang");
        float canNang = new Scanner(System.in).nextFloat();
        float total = canNang/ (chieuCao * 2);
        if (total < 16.0) {
            System.out.println("gầy 3");
        } else if ( total >= 16 && total < 17) {
            System.out.println("gầy 2");
        } else if ( total>=17 && total < 18.5){
            System.out.println("gầy 1");
        }else if ( total>=18.5 && total < 25){
            System.out.println("bình thường");
        }else if ( total>=25 && total <30){
            System.out.println("thừa cân");
        }else if ( total>=30 && total < 35){
            System.out.println("béo phì 1");
        }else if ( total >=35 && total < 40){
            System.out.println("béo phì 2");
        }else if (  total > 40){
            System.out.println("béo phì 3");
        }else   {
            System.out.println("ko có trong dữ liệu");
        }
    }
}
