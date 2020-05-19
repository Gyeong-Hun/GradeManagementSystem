package grade;

import java.util.Scanner;

public class Freshmen extends UnivGrade {
	
	public Freshmen(GradeKind kind) {
		super(kind); //super는 위의 생성자를 뜻한다. 
	}
	public void getUserInput(Scanner input) {
		setSubjectName(input); //StudentID -> SubjctName
		setSubjectId(input); // StudentName -> SsubjectId
		setSubjectcredit(input); // StudentEmail -> Subjectcredit
		setYourgrade(input); // StudentPhone -> Yourgrade
		
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " subjectname:" + subjectname + " subjectid:" + subjectid + " subjectcredit:" + subjectcredit + " yourgrade:" + yourgrade);
	}
}