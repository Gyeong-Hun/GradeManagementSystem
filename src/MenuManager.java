import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		GradeManager gradeManager = new GradeManager(input);
		
		int num = -1;
		while (num != 5) {
			System.out.println("--- Grade Management System Menu ---");
			System.out.println("1. input Grade"); //그 학생의 성적(성적에는 과목, 학점, 받은성적이 들어갈 예정이다.)
			System.out.println("2. Delete Grade");
			System.out.println("3. Edit Grade");
			System.out.println("4. View Grade");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5 :");
			num = input.nextInt();
			if (num == 1) {
				gradeManager.inputGrade();
			}
			else if (num == 2) {
				gradeManager.deleteGrade();
			}
			else if (num == 3) {
				gradeManager.editGrade();
			}
			else if (num == 4) {
				gradeManager.viewGrade();
			}
			else {
				continue;
			}
		}
	}
	
}
	
	
