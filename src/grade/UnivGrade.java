package grade;

import java.util.Scanner;

public abstract class UnivGrade extends Grade {
	
	public UnivGrade(GradeKind kind) {
		super(kind); //super는 위의 생성자를 뜻한다. 
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
			System.out.print("Do you have grades? (Y/N)");//성적을 받았는지 물어본다.
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Input your grade:");
				double yourgrade = input.nextDouble();
				this.setYourgrade(yourgrade);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setYourgrade(-1); //성적이 없을 경우에 그냥 아무것도 넣지 않는다.
				break;
			}
			else {
			}
		}
	}
}

