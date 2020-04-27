package grade;

import java.util.Scanner;

public class SophomoreGrade extends Grade { //Grade가 하는 모든 것을 가지게 된다.
	
	public SophomoreGrade(GradeKind kind) {
		super(kind); //super는 위의 생성자를 뜻한다. 
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Input Subject Name:");//학생학번 -> 과목이름
		String subjectname = input.next();
		this.setSubjectname(subjectname);
		
		System.out.print("Input Subject Id:");
		int subjectid = input.nextInt();
		this.setSubjectid(subjectid);
		
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
		System.out.print("Input Subject credit:"); //폰번호 -> 과목학점
		int subjectcredit = input.nextInt();
		this.setSubjectcredit(subjectcredit);
	}
}
