package grade;

import java.util.Scanner;//교수님은 부모이메일, 부모폰번호 -> 나는 학생이 원했던 성적 하나만 넣었음 (과목의 학점은 어차피 동일하니까)
public class SeniorGrade extends UnivGrade {
	
	protected double wantedyourgrade;//바랬던 성적 변수
	
	public SeniorGrade(GradeKind kind) {
		super(kind); //super는 위의 생성자를 뜻한다. 
	}
	
	public void getUserInput(Scanner input) {
		setSubjectName(input);
		setSubjectId(input);
		setYourGradewithYN(input);
		setWantedYourGradewithYN(input);
		setSubjectcredit(input);
	}
	
	public void setWantedYourGradewithYN(Scanner input) {
		//원했던 성적물어보는 코드
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer!= 'N')
		{
			System.out.print("너가 원했던 성적이 따로 있니? (Y/N)");//원했던 성적 있었는지 물어보기
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setYourgrade(input);
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
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " subjectname:" + subjectname + " subjectid:" + subjectid + " subjectcredit:" + subjectcredit + " yourgrade:" + yourgrade + " wanted yourgrade:" + wantedyourgrade);
	}
}
