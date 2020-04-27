package grade;

import java.util.Scanner;
//�������� �θ��̸���, �θ�����ȣ -> ���� �л��� ���ߴ� ���� �ϳ��� �־��� (������ ������ ������ �����ϴϱ�)
public class SeniorGrade extends Grade {
	
	protected double wantedyourgrade;//�ٷ��� ���� ����
	
	public SeniorGrade(GradeKind kind) {
		super(kind); //super�� ���� �����ڸ� ���Ѵ�. 
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Input Subject Name:");
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
		//���ߴ� ��������� �ڵ�
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer!= 'N')
		{
			System.out.print("�ʰ� ���ߴ� ������ ���� �ִ�? (Y/N)");//���ߴ� ���� �־����� �����
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("�ϰ� ���ߴ� ������ �Է��� :");
				double wantedyourgrade = input.nextDouble();
				this.setYourgrade(wantedyourgrade);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setYourgrade(-1); //������ ���� ��쿡 �׳� �ƹ��͵� ���� �ʴ´�.
				break;
			}
			else {
			}
		}
		
		System.out.print("Input Subject credit:");
		int subjectcredit = input.nextInt();
		this.setSubjectcredit(subjectcredit);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case freshmen:
			skind = "1�г�";
			break;
		case sophomore:
			skind = "2�г�";
			break;
		case junior:
			skind = "3�г�";
			break;
		case senior:
			skind = "4�г�";
			break;
		default:
			
		}
		System.out.println("kind:" + skind + " subjectname:" + subjectname + " subjectid:" + subjectid + " subjectcredit:" + subjectcredit + " yourgrade:" + yourgrade + " wanted yourgrade:" + wantedyourgrade);
	}
	
	

}
