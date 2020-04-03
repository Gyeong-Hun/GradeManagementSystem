import java.util.Scanner;

public class GradeManager {
	Grade grade;
	Scanner input;
	
	GradeManager(Scanner input){
		this.input = input;
	}
	
	public void inputGrade() {
		grade = new Grade();
		System.out.print("Input Subject Name:");
		grade.subjectname = input.next();
		System.out.print("Input Subject Id:");
		grade.subjectid = input.nextInt();
		System.out.print("Input Subject credit:");
		grade.subjectcredit = input.nextInt();
		System.out.print("Input your grade:");
		grade.yourgrade = input.nextDouble();
	}
	
	public void deleteGrade() { //과목이름 입력했을 때 아무것도 없으면 없다고 말해주고, 입력한 과목이름이 앞에서 입력한 과목이름이라면 grade를 null로 만든다.
		System.out.print("Subject ID");
		int subjectid = input.nextInt();
		if (grade == null) {
			System.out.println("the subject has not been registered");
			return;
		}
		if (grade.subjectid == subjectid) {
			grade = null;
			System.out.println("the subject is deleted");
		}
	}
	
	public void editGrade() {
		System.out.print("Subject ID:");
		int subjectid = input.nextInt();
		if (grade.subjectid == subjectid) {
			System.out.println("the subject to be edited is" + subjectid);
		}
	}
	
	
	public void viewGrade() {
		System.out.print("Subject ID:");
		int subjectid = input.nextInt();
		if (grade.subjectid == subjectid) {
			grade.printInfo();
		}
	}
}
