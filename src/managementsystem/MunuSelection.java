package managementsystem;

import java.util.Scanner;

public class MunuSelection {

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
		switch (num) {
		case 1:
			System.out.print("Your ID: "); //����� ���̵�
			String yi = input.next();
			System.out.print("Pet owner name: "); //�ֿϵ��� ���� �̸�
			String pon = input.next();
			System.out.print("Pet owner phone number: "); //�ֿϵ��� ���� ��ȭ��ȣ
			int popn = input.nextInt();
			System.out.print("Types of Pet: "); //�ֿϵ��� ����
			String top = input.next();
			System.out.print("Kind of Pet: "); //�ֿϵ��� ǰ��
			String kop = input.next();
			System.out.print("Note: "); //�ֿϵ��� ǰ��
			String nt = input.next();
			System.out.println("Register successfully!");
			break;
		case 2:
		case 3:
		case 4:
			System.out.print("Your ID: "); //����� ���̵�
			String ID = input.next();
			
		}
		
		
		}
		}

}
