package managementsystem;

import java.util.Scanner;

public class MenuSelection2 {

	public static void main(String[] args) {
		//�ֿϵ��� �о� ���� �ý����� ���������.
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
		System.out.print("Your ID: "); //����� ���̵� ����
		String yi = input.next();
		System.out.print("Pet owner name: "); //�ֿϵ��� ���� �̸� ����
		String pon = input.next();
		System.out.print("Pet owner phone number: "); //�ֿϵ��� ���� ��ȭ��ȣ ����
		String popn = input.nextLine();
		System.out.print("Types of Pet: "); //�ֿϵ��� ���� ����
		String top = input.next();
		System.out.print("Kind of Pet: "); //�ֿϵ��� ǰ�� ����
		String kop = input.next();
		System.out.print("Note: "); //���ǻ��� ����
		String nt = input.next();
		System.out.println("Register successfully!"); 
	}
	
	public static void Viewstudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Your ID: "); //����� ���̵� ����
		String yi = input.next();
	}
	public static void Editstudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Your ID: "); //����� ���̵� ����
		String yi = input.next();
	}
	public static void Sellstudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Your ID: "); //����� ���̵� ����
		String yi = input.next();
	}

}
