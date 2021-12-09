import java.util.Scanner;

public class BaiTapBMI {
    public static void main(String[] args) {
        int Luachon  = 10;
        while (Luachon != 0)
        {
            if(Luachon == 10)
            {
                Scanner scanner10 = new Scanner(System.in);
                System.out.println("--------------------");
                System.out.println(" Nhap lựa chọn");
                System.out.println("1: Chạy bài xuất thông tin.");
                System.out.println("2: Chạy bài toán tử.");
                System.out.println("3: Chạy bài câu điều kiện.");
                System.out.println("4: Chạy bài loại khách hàng.");
                System.out.println("5: Chạy bài BMI.");
                System.out.println("0: Ket thuc.");
                Luachon = scanner10.nextInt();
            }
            else if( Luachon == 1 )
            {
//                1: Khai Báo biến và kiểu dữ liệu
//
//                kiểu dữ liệu nguyên thuy: String, int, double, long, float, boolean
//
//                Kiểu dữ liệu vùng nhớ ( object): object, Array,...

                String name = "Phan Thanh Hoài";
                int age = 23;
                float height = 1.68f;
                double weight = 55.5;
                boolean ismale = true;
                System.out.println("Ten la " + name + " ");
                System.out.println("Tuoi la " + age + " ");
                System.out.println("Cao " + height + " m ");
                System.out.println("Nang " + weight + " KG ");
                if(ismale)
                {
                    System.out.println("GIoi tinh Nam ");
                }
                else
                {
                    System.out.println("GIoi tinh Nu " );
                }
                Luachon  = 10;
            }
            else if( Luachon == 2)
            {
                //2. Toán tử
                int a = 5;
                int b = 10;
                int ketQua;
                ketQua = a + b;
                System.out.println("Tong 2 so " + a +  " và " + b + " là: " + ketQua );
                Luachon  = 10;

            }
            else if ( Luachon == 3)
            {
                //3: câu điều kiện

                //{} scope
                int a = 5 ;
                int b = 10 ;

                if (a > b) {
                    System.out.println(" A lon hon B");

                }
                else if( a < b)
                {
                    System.out.println("A nho hon b");
                }
                else
                {
                    System.out.println("A = b");
                }
                Luachon  = 10;
            }
            else  if ( Luachon == 4)
            {
                //mã khách hàng:
                // Khách mới: N
                //Khách cũ :  O
                //Khách vip : V

                //-TH không đúng mã
                // không phải các ký tự trên thì báo ra không tồn tại mã khash hàng
                // - TH đúng mã
                //N: giảm 2%
                //O: 5%
                //V: giảm 10%


                //output
                //Loại khách hàng : khách mới
                //Được giảm 2% trên tổng giá trị sản phẩm
                //Tổng tiền phải tr: 98000
                int total;
                Scanner scanner = new Scanner(System.in);
                System.out.println(" Nhap  Tổng tiền ");
                total = scanner.nextInt();
                String Loaikhachhang;
                Scanner scanner2 = new Scanner(System.in);
                System.out.println(" Nhap  loại khách hàng ");
                Loaikhachhang = scanner2.nextLine();
                String category = " Chưa đăng ký ";
                float percent = 0;

                if(Loaikhachhang.equals("N"))
                {
                    percent = 0.02f;
                    category = " Khách Mới ";
                }
                else if(Loaikhachhang.equals("O"))
                {
                    percent = 0.05f;
                    category = " Khách cũ ";
                }
                else if(Loaikhachhang.equals("V"))
                {
                    percent = 0.1f;
                    category = " Khách vip";
                }
                System.out.println("Loại khách hàng" + category);
                System.out.println(" Được giảm " + percent*100 + " % ");
                System.out.println("Tổng tiền giảm: " + percent*total);
                System.out.println(" Tổng tiền phải trả là: "+ (total - (percent*total)));
                Luachon  = 10;
            }
            else  if( Luachon == 5)
            {
                float Chieucao;
                Scanner scanner = new Scanner(System.in);
                System.out.println(" Nhap chieu cao");
                Chieucao = scanner.nextFloat();
                float Cannang;
                Scanner scanner2 = new Scanner(System.in);
                System.out.println(" Nhap can nang  ");
                Cannang = scanner2.nextFloat();
                float BMI;
                BMI = Cannang / (Chieucao * Chieucao);
                if (BMI < 16) {
                    System.out.println(" BMI =  " + BMI + " Gầy độ III");

                } else if (BMI >= 16 && BMI < 17) {
                    System.out.println(" BMI =  " + BMI + " Gầy độ II");
                } else if (BMI >= 17 && BMI < 18.5) {
                    System.out.println(" BMI =  " + BMI + " Gầy độ I");
                } else if (BMI >= 18.5 && BMI < 25) {
                    System.out.println(" BMI =  " + BMI + " Bình Thường");
                } else if (BMI >= 25 && BMI < 30) {
                    System.out.println(" BMI =  " + BMI + "Thừa cân");
                } else if (BMI >= 30 && BMI < 35) {
                    System.out.println(" BMI =  " + BMI + " Béo phì  độ 1");
                } else if (BMI >= 35 && BMI < 40) {
                    System.out.println(" BMI =  " + BMI + " Béo phì độ 2");
                } else if (BMI >= 40) {
                    System.out.println(" BMI =  " + BMI + " Béo phì độ 3");
                }
                Luachon  = 10;
            }
            else
            {
                System.out.println(" Nhập sai rồi nhập lại đi");
                Luachon  = 10;

            }
        }
        if( Luachon == 0)
        {
            System.out.println(" Xin chào và hẹn gặp lại ");
        }

    }
}
