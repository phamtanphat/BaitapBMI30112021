package Buoi02;

import java.util.Scanner;

public class Buoi02 {
	public static void main(String[] args) {
		// khai báo thư viện
		Scanner sc = new Scanner(System.in);

		// khai báo biến chieuDai, canNang, BMI
		double  chieuDai = 0,BMI = 0,canNang = 0 ;
		
		// Nhập chiều dài
		System.out.println("Nhập chiều dài (m): ");
		chieuDai = sc.nextDouble();

		// Nhập chiều rộng
		System.out.println("Nhập cân nặng (kg): ");
		canNang = sc.nextDouble();
		
		// gán giá trị cho BMI = canNang / (chieuDai) ^ 2
		BMI = canNang / (chieuDai * chieuDai);

		// BMI <16: Gầy độ III
		if (BMI < 16) {
			System.out.println("Gầy độ III");
		}

		// 16 ≤ BMI <17: Gầy độ II
		else if (BMI < 17) {
			System.out.println("Gầy độ II");
		}

		// 17 ≤ BMI <18.5: Gầy độ I
		else if (BMI < 18.5) {
			System.out.println("Gầy độ I");
		}

		// 25 ≤ BMI <30: Thừa cân
		else if (BMI < 30) {
			System.out.println("Thừa cân");
		}

		// 30 ≤ BMI 35: Béo phì độ 1
		else if (BMI < 35) {
			System.out.println("Béo phì độ I");
		}

		// 35 ≤ BMI <40: Béo phì độ II
		else if (BMI < 40) {
			System.out.println("Béo phì độ II");
		}

		// BMI >40: Béo phì độ III
		else if (BMI >= 40) {
			System.out.println("Béo phì độ III");
		}

		// Trường hợp nhặp sai số liệu
		else {
			System.out.println("Nhập sai thông tin");
		}
	}
}
