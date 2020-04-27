package grade;

import java.util.Scanner;
//교수님은 부모이메일, 부모폰번호 -> 나는 학생이 원했던 성적 하나만 넣었음 (과목의 학점은 어차피 동일하니까)
public class SeniorGrade extends Grade {
	
	protected double wantedyourgrade;//바랬던 성적 변수
	
	public SeniorGrade(GradeKind kind) {
		super(kind); //super는 위의 생성자를 뜻한다. 
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
		//원했던 성적물어보는 코드
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer!= 'N')
		{
			System.out.print("너가 원했던 성적이 따로 있니? (Y/N)");//원했던 성적 있었는지 물어보기
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("니가 원했던 성적을 입력해 :");
				double wantedyourgrade = input.nextDouble();
				this.setYourgrade(wantedyourgrade);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setYourgrade(-1); //성적이 없을 경우에 그냥 아무것도 넣지 않는다.
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
			skind = "1학년";
			break;
		case sophomore:
			skind = "2학년";
			break;
		case junior:
			skind = "3학년";
			break;
		case senior:
			skind = "4학년";
			break;
		default:
			
		}
		System.out.println("kind:" + skind + " subjectname:" + subjectname + " subjectid:" + subjectid + " subjectcredit:" + subjectcredit + " yourgrade:" + yourgrade + " wanted yourgrade:" + wantedyourgrade);
	}
	
	

}
