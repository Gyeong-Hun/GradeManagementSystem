package grade;

import java.util.Scanner;

public class Freshmen extends Grade {
	
	public Freshmen(GradeKind kind) {
		super(kind); //super�� ���� �����ڸ� ���Ѵ�. 
	}
	
	public void getUserInput(Scanner input) {
		setSubjectName(input); //StudentID -> SubjctName
		setSubjectId(input); // StudentName -> SsubjectId
		setYourgrade(input); // StudentEmail -> Yourgrade
		setSubjectcredit(input); // StudentPhone -> Subjectcredit
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " subjectname:" + subjectname + " subjectid:" + subjectid + " subjectcredit:" + subjectcredit + " yourgrade:" + yourgrade);
	}
}