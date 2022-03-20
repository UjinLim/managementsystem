package managementsystem;

import java.util.Scanner;

public class MunuSelection {

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
		switch (num) {
		case 1:
			System.out.print("Your ID: "); //사용자 아이디
			String yi = input.next();
			System.out.print("Pet owner name: "); //애완동물 주인 이름
			String pon = input.next();
			System.out.print("Pet owner phone number: "); //애완동물 주인 전화번호
			int popn = input.nextInt();
			System.out.print("Types of Pet: "); //애완동물 종류
			String top = input.next();
			System.out.print("Kind of Pet: "); //애완동물 품종
			String kop = input.next();
			System.out.print("Note: "); //애완동물 품종
			String nt = input.next();
			System.out.println("Register successfully!");
			break;
		case 2:
		case 3:
		case 4:
			System.out.print("Your ID: "); //사용자 아이디
			String ID = input.next();
			
		}
		
		
		}
		}

}
