import java.util.ArrayList;
import java.util.Scanner;

import grade.Freshmen;
import grade.Grade;
import grade.GradeInput;
import grade.GradeKind;
import grade.SeniorGrade;
import grade.SophomoreGrade;

public class GradeManager {
	ArrayList<GradeInput> grades = new ArrayList<GradeInput>(); //성적을 제한되지 않고 관리하기 위해서 grades라는 이름의 리스트를 만들어준다.
	Scanner input;
	GradeManager(Scanner input){
		this.input = input;
	}
	public void inputGrade() {
		int kind = 0;
		GradeInput gradeInput;
		while(kind != 1 && kind !=2) {
			System.out.println("1. for freshmen");
			System.out.println("2. for sophomore");
			System.out.println("3. for senior");
			System.out.print("Select num 1, 2, or 3 for Grade Kind: ");
			kind = input.nextInt();
			if (kind == 1) {
				gradeInput = new Freshmen(GradeKind.freshmen);
				gradeInput.getUserInput(input);
				grades.add(gradeInput);
				break;
			}
			else if (kind == 2) {
				gradeInput = new SophomoreGrade(GradeKind.sophomore);
				gradeInput.getUserInput(input);
				grades.add(gradeInput);
				break;
			}
			else if (kind == 3) {
				gradeInput = new SeniorGrade(GradeKind.senior);
				gradeInput.getUserInput(input);
				grades.add(gradeInput);
				break;
			}
			
			else {
				System.out.print("Select num for Grade Kind between 1 and 2:");
			}
		}
	}
	
	public void deleteGrade() { //과목번호 입력했을 때 아무것도 없으면 없다고 말해주고, 입력한 과목번호가 앞에서 입력한 과목번호라면 grade를 null로 만든다.
		System.out.print("Subject ID:");
		int subjectid = input.nextInt();
		int index = findIndex(subjectid);
		removefromGrades(index, subjectid);
	}
	
	public int findIndex(int subjectid) {
		int index = -1; //array에서 index를 못찾았다라는 의미
		for (int i=0; i<grades.size(); i++) {//입력받은 id와 같은 id가 있는지 찾아줘야한다.
			if (grades.get(i).getSubjectid() == subjectid) { //목록에서의 id와 내가 입력한 id가 같다면
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromGrades(int index, int subjectid) {
		if (index >= 0) {//array에서 index를 찾았다면
			grades.remove(index); //grades 목록의 index가 삭제가 된다
			System.out.println("the subject" + subjectid + "is deleted");
			return 1;
		}
		else {//index가 0보다 크지 않으면 못찾았다는 의미이다.
			System.out.println("the subject has not been registered");
			return -1;
		}
	}
	public void editGrade() {
		System.out.print("Subject ID:");
		int subjectid = input.nextInt();
		for (int i=0; i<grades.size(); i++) {//여러과목중 한개를 선택해야 하므로 for문 사용
			GradeInput grade = grades.get(i);
			if (grade.getSubjectid() == subjectid) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						grade.setSubjectName(input);
						break;
					case 2:
						grade.setSubjectId(input);
						break;
					case 3:	
						grade.setSubjectcredit(input);
						break;
					case 4:	
						grade.setYourgrade(input);
						break;
					default:
						continue;
					}		
				} //while
				break;
			} //if
		} //for
	}
	
	public void viewGrades() {
		System.out.println("# of registered grades:" + grades.size());
		for (int i=0; i<grades.size(); i++) {//여러개의 성적이 있으므로 for문을 통해서 출력한다.
			grades.get(i).printInfo();//grades의 add index의 i를 가져오고 그 객체의 정보를 출력해준다.
		}
	}
	public void showEditMenu() {
		System.out.println("- Grade Info Edit Menu -");
		System.out.println("1. Edit Subject Name");
		System.out.println("2. Edit Subject Id");
		System.out.println("3. Edit Subject credit");
		System.out.println("4. Edit Your Grade");
		System.out.println("5. Exit");
		System.out.println("Select number between 1 - 5 :");
	}
}
