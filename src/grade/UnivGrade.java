package grade;

import java.util.Scanner;

public abstract class UnivGrade extends Grade {
	
	public UnivGrade(GradeKind kind) {
		super(kind); //super�� ���� �����ڸ� ���Ѵ�. 
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " subjectname:" + subjectname + " subjectid:" + subjectid + " subjectcredit:" + subjectcredit + " yourgrade:" + yourgrade);
	}
	
	public void setYourGradewithYN(Scanner input) {
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
	}
}

