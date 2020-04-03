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
			int num = -1;
			while (num != 5) {
				System.out.println("- Grade Info Edit Menu -");
				System.out.println("1. Edit Subject Name"); //�� �л��� ����(�������� ����, ����, ���������� �� �����̴�.)
				System.out.println("2. Edit Subject Id");
				System.out.println("3. Edit Subject credit");
				System.out.println("4. Edit Your Grade");
				System.out.println("5. Exit");
				System.out.println("Select one number between 1 - 5 :");
				num = input.nextInt();
				if (num == 1) {
					System.out.print("Input Subject Name:");
					grade.subjectname = input.next();
				}
				else if (num == 2) {
					System.out.print("Input Subject Id:");
					grade.subjectid = input.nextInt();
				}
				else if (num == 3) {
					System.out.print("Input Subject credit:");
					grade.subjectcredit = input.nextInt();
				}
				else if (num == 4) {
					System.out.print("Input your grade:");
					grade.yourgrade = input.nextDouble();
				}
				else {
					continue;
				}
			}
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
