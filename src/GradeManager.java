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
	
	public void deleteGrade() { //�����̸� �Է����� �� �ƹ��͵� ������ ���ٰ� �����ְ�, �Է��� �����̸��� �տ��� �Է��� �����̸��̶�� grade�� null�� �����.
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
