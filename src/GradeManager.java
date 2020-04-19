import java.util.ArrayList;
import java.util.Scanner;

import grade.Grade;
import grade.SophomoreGrade;

public class GradeManager {
	ArrayList<Grade> grades = new ArrayList<Grade>(); //성적을 제한되지 않고 관리하기 위해서 grades라는 이름의 리스트를 만들어준다.
	Scanner input;
	GradeManager(Scanner input){
		this.input = input;
	}
	
	public void inputGrade() {
		int kind = 0;
		Grade grade;
		while(kind != 1 && kind !=2) {
			System.out.println("1. for freshmen");
			System.out.println("2. for sophomore");
			System.out.print("Select num for Grade Kind between 1 and 2:");
			kind = input.nextInt();
			if (kind == 1) {
				grade = new Grade();
				grade.getUserInput(input);
				grades.add(grade);
				break;
			}
			else if (kind == 2) {
				grade = new SophomoreGrade();
				grade.getUserInput(input);
				grades.add(grade);
				break;
			}
			else {
				System.out.print("Select num for Grade Kind between 1 and 2:");
			}
		}
			

		 //grades목록에 add해서 new grade 정보를 추가해준다.
	}
	
	public void deleteGrade() { //과목번호 입력했을 때 아무것도 없으면 없다고 말해주고, 입력한 과목번호가 앞에서 입력한 과목번호라면 grade를 null로 만든다.
		System.out.print("Subject ID:");
		int subjectid = input.nextInt();
		int index = -1; //array에서 index를 못찾았다라는 의미
		for (int i=0; i<grades.size(); i++) {//입력받은 id와 같은 id가 있는지 찾아줘야한다.
			if (grades.get(i).getSubjectid() == subjectid) { //목록에서의 id와 내가 입력한 id가 같다면
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
			if (grade.getSubjectid() == subjectid) {
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
						String subjectname = input.next();
						grade.setSubjectname(subjectname);
					}
					else if (num == 2) {
						System.out.print("Input Subject Id:");
						int subjectid1 = input.nextInt();
						grade.setSubjectid(subjectid1);
					}
					else if (num == 3) {
						System.out.print("Input Subject credit:");
						int subjectcredit = input.nextInt();
						grade.setSubjectcredit(subjectcredit);
					}
					else if (num == 4) {
						System.out.print("Input your grade:");
						double yourgrade = input.nextDouble();
						grade.setYourgrade(yourgrade);
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
		System.out.println("# of registered grades:" + grades.size());
		for (int i=0; i<grades.size(); i++) {//여러개의 성적이 있으므로 for문을 통해서 출력한다.
			grades.get(i).printInfo();//grades의 add index의 i를 가져오고 그 객체의 정보를 출력해준다.
		}
	}
}
