package grade;

import java.util.Scanner;
public class SophomoreGrade extends UnivGrade { //Grade�� �ϴ� ��� ���� ������ �ȴ�.
	
	public SophomoreGrade(GradeKind kind) {
		super(kind); //super�� ���� �����ڸ� ���Ѵ�. 
	}
	
	public void getUserInput(Scanner input) {
		setSubjectName(input);
		setSubjectId(input);
		setYourGradewithYN(input);
		setSubjectcredit(input);
	}
}