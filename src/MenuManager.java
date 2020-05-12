import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		GradeManager gradeManager = new GradeManager(input);
		
		int num = -1;
		while (num != 5) {
			showMenu();
			num = input.nextInt();
			switch(num){
			case 1:
				gradeManager.inputGrade();
				break;
			case 2:
				gradeManager.deleteGrade();
				break;
			case 3:
				gradeManager.editGrade();
				break;
			case 4:
				gradeManager.viewGrades();
				break;
			default:
				continue;
			}
		}
	}
	
	public static void showMenu() {
	System.out.println("--- Grade Management System Menu ---");
	System.out.println("1. input Grade");
	System.out.println("2. Delete Grade");
	System.out.println("3. Edit Grade");
	System.out.println("4. View Grades");
	System.out.println("5. Exit");
	System.out.println("Select one number between 1 - 5 :");
	}
}
	
	
