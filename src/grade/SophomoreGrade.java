package grade;

import java.util.Scanner;
public class SophomoreGrade extends UnivGrade { //Grade가 하는 모든 것을 가지게 된다.
	
	public SophomoreGrade(GradeKind kind) {
		super(kind); //super는 위의 생성자를 뜻한다. 
	}
	
	public void getUserInput(Scanner input) {
		setSubjectName(input);
		setSubjectId(input);
		setYourGradewithYN(input);
		setSubjectcredit(input);
	}
}