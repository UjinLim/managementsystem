package managementsystem;

import java.util.Scanner;

public class MenuSelection2 {

	public static void main(String[] args) {
		//애완동물 분양 관리 시스템을 만들고자함.
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 5) {
		System.out.println("1. Add Pet");
		System.out.println("2. View Pet");
		System.out.println("3. Edit Pet");
		System.out.println("4. Sell Pet");
		System.out.println("5. Exit ");
		System.out.print("Choose one number: ");
		num = input.nextInt();
		if (num == 1) {
			Addstudent();
		}
		else if (num == 2) {
			Viewstudent();
		}
		else if (num == 3) {
			Editstudent();
		}
		else if (num == 4) {
			Sellstudent();
		}
		else {
			continue;
		}
	  }
    }
	public static void Addstudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Your ID: "); //사용자 아이디 기입
		String yi = input.next();
		System.out.print("Pet owner name: "); //애완동물 주인 이름 기입
		String pon = input.next();
		System.out.print("Pet owner phone number: "); //애완동물 주인 전화번호 기입
		String popn = input.nextLine();
		System.out.print("Types of Pet: "); //애완동물 종류 기입
		String top = input.next();
		System.out.print("Kind of Pet: "); //애완동물 품종 기입
		String kop = input.next();
		System.out.print("Note: "); //주의사항 기입
		String nt = input.next();
		System.out.println("Register successfully!"); 
	}
	
	public static void Viewstudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Your ID: "); //사용자 아이디 기입
		String yi = input.next();
	}
	public static void Editstudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Your ID: "); //사용자 아이디 기입
		String yi = input.next();
	}
	public static void Sellstudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Your ID: "); //사용자 아이디 기입
		String yi = input.next();
	}

}
