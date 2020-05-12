package grade;

import java.util.Scanner;//�������� �θ��̸���, �θ�����ȣ -> ���� �л��� ���ߴ� ���� �ϳ��� �־��� (������ ������ ������ �����ϴϱ�)
public class SeniorGrade extends UnivGrade {
	
	protected double wantedyourgrade;//�ٷ��� ���� ����
	
	public SeniorGrade(GradeKind kind) {
		super(kind); //super�� ���� �����ڸ� ���Ѵ�. 
	}
	
	public void getUserInput(Scanner input) {
		setSubjectName(input);
		setSubjectId(input);
		setYourGradewithYN(input);
		setWantedYourGradewithYN(input);
		setSubjectcredit(input);
	}
	
	public void setWantedYourGradewithYN(Scanner input) {
		//���ߴ� ��������� �ڵ�
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer!= 'N')
		{
			System.out.print("�ʰ� ���ߴ� ������ ���� �ִ�? (Y/N)");//���ߴ� ���� �־����� �����
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setYourgrade(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setYourgrade(-1); //������ ���� ��쿡 �׳� �ƹ��͵� ���� �ʴ´�.
				break;
			}
			else {
			}
		}
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " subjectname:" + subjectname + " subjectid:" + subjectid + " subjectcredit:" + subjectcredit + " yourgrade:" + yourgrade + " wanted yourgrade:" + wantedyourgrade);
	}
}
