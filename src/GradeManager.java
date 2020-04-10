import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {
	ArrayList<Grade> grades = new ArrayList<Grade>(); //성적을 제한되지 않고 관리하기 위해서 grades라는 이름의 리스트를 만들어준다.
	Scanner input;
	
	GradeManager(Scanner input){
		this.input = input;
	}
	
	public void inputGrade() {
		Grade grade = new Grade();//하나의 grade객체를 add grade해서 생성을 하였다.
		System.out.print("Input Subject Name:");
		grade.subjectname = input.next();
		System.out.print("Input Subject Id:");
		grade.subjectid = input.nextInt();
		System.out.print("Input Subject credit:");
		grade.subjectcredit = input.nextInt();
		System.out.print("Input your grade:");
		grade.yourgrade = input.nextDouble();
		grades.add(grade); //grades목록에 add해서 new grade 정보를 추가해준다.
	}
	
	public void deleteGrade() { //과목번호 입력했을 때 아무것도 없으면 없다고 말해주고, 입력한 과목이름이 앞에서 입력한 과목이름이라면 grade를 null로 만든다.
		System.out.print("Subject ID:");
		int subjectid = input.nextInt();
		int index = -1; //array에서 index를 못찾았다라는 의미
		for (int i=0; i<grades.size(); i++) {//입력받은 id와 같은 id가 있는지 찾아줘야한다.
			if (grades.get(i).subjectid == subjectid) { //목록에서의 id와 내가 입력한 id가 같다면
				index = i;
				break;
			}
		}
		
		if (index >= 0) {//array에서 index를 찾았다면
			
			grades.remove(index); //grades 목록의 index가 삭제가 된다
			System.out.println("the subject" + subjectid + "is deleted");
		}
		else {//index가 0보다 크지 않으면 못찾았다는 의미이다.
			System.out.println("the subject has not been registered");
			return;
		}
	}
	
	public void editGrade() {
		System.out.print("Subject ID:");
		int subjectid = input.nextInt();
		for (int i=0; i<grades.size(); i++) {//여러과목중 한개를 선택해야 하므로 for문 사용
			Grade grade = grades.get(i);
			if (grade.subjectid == subjectid) {
				int num = -1;
				while (num != 5) {
					System.out.println("- Grade Info Edit Menu -");
					System.out.println("1. Edit Subject Name");
					System.out.println("2. Edit Subject Id");
					System.out.println("3. Edit Subject credit");
					System.out.println("4. Edit Your Grade");
					System.out.println("5. Exit");
					System.out.println("Select number between 1 - 5 :");
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
					} //if
				} //while
				break;
			} //if
		} //for
	}
	
	public void viewGrades() { //
//		System.out.print("Subject ID:");
//		int subjectid = input.nextInt();
		for (int i=0; i<grades.size(); i++) {//여러개의 성적이 있으므로 for문을 통해서 출력한다.
			grades.get(i).printInfo();//grades의 add index의 i를 가져오고 그 객체의 정보를 출력해준다.
		}
	}
}
