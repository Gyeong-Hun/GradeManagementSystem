import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		while (num != 6) {
			System.out.println("--- Grade Management System Menu ---");
			
			System.out.println("1. input Student"); //성적을 입력할 학생(학생의 ID와 이름)
			System.out.println("2. input Grade"); //그 학생의 성적(성적에는 과목, 학점, 받은성적이 들어갈 예정이다.) 
			System.out.println("3. Edit Grade"); 
			System.out.println("4. Show Grade");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit"); 	
			System.out.println("Select one number between 1 - 6 :");
			num = input.nextInt();
			if (num == 1) {
				inputStudent();
			}
			else if (num == 2) {
				inputGrade();
			}
			else if (num == 3) {
				EditGrade();
			}
			else if (num == 4) {
				ShowGrade();
			}
			else {
				continue;
			}
		}
	}
	
	public static void inputStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int StudentId = input.nextInt();
		System.out.print("Student Name :");
		String StudentName = input.next();
	}
	
	public static void inputGrade() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Subject Name:");
		String Subjectname = input.next();
		System.out.print("Input Subject credit:");
		int Subjectcredit = input.nextInt();
		System.out.print("Input your grade:");
		double  Yourgrade = input.nextDouble();
	}
	
	public static void EditGrade() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int StudentId = input.nextInt();
	}
	
	public static void ShowGrade() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student ID:");
		int StudentId = input.nextInt();
	}
	
}
	
	
