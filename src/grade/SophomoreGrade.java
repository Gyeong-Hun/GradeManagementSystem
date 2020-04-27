package grade;

import java.util.Scanner;

public class SophomoreGrade extends Grade { //Grade�� �ϴ� ��� ���� ������ �ȴ�.
	
	public SophomoreGrade(GradeKind kind) {
		super(kind); //super�� ���� �����ڸ� ���Ѵ�. 
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Input Subject Name:");//�л��й� -> �����̸�
		String subjectname = input.next();
		this.setSubjectname(subjectname);
		
		System.out.print("Input Subject Id:");
		int subjectid = input.nextInt();
		this.setSubjectid(subjectid);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer!= 'N')
		{
			System.out.print("Do you have grades? (Y/N)");//������ �޾Ҵ��� �����.
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Input your grade:");
				double yourgrade = input.nextDouble();
				this.setYourgrade(yourgrade);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setYourgrade(-1); //������ ���� ��쿡 �׳� �ƹ��͵� ���� �ʴ´�.
				break;
			}
			else {
			}
		}
		System.out.print("Input Subject credit:"); //����ȣ -> ��������
		int subjectcredit = input.nextInt();
		this.setSubjectcredit(subjectcredit);
	}
}
