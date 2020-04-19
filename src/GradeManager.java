import java.util.ArrayList;
import java.util.Scanner;

import grade.Grade;
import grade.SophomoreGrade;

public class GradeManager {
	ArrayList<Grade> grades = new ArrayList<Grade>(); //������ ���ѵ��� �ʰ� �����ϱ� ���ؼ� grades��� �̸��� ����Ʈ�� ������ش�.
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
			

		 //grades��Ͽ� add�ؼ� new grade ������ �߰����ش�.
	}
	
	public void deleteGrade() { //�����ȣ �Է����� �� �ƹ��͵� ������ ���ٰ� �����ְ�, �Է��� �����ȣ�� �տ��� �Է��� �����ȣ��� grade�� null�� �����.
		System.out.print("Subject ID:");
		int subjectid = input.nextInt();
		int index = -1; //array���� index�� ��ã�Ҵٶ�� �ǹ�
		for (int i=0; i<grades.size(); i++) {//�Է¹��� id�� ���� id�� �ִ��� ã������Ѵ�.
			if (grades.get(i).getSubjectid() == subjectid) { //��Ͽ����� id�� ���� �Է��� id�� ���ٸ�
				index = i;
				break;
			}
		}
		
		if (index >= 0) {//array���� index�� ã�Ҵٸ�
			
			grades.remove(index); //grades ����� index�� ������ �ȴ�
			System.out.println("the subject" + subjectid + "is deleted");
		}
		else {//index�� 0���� ũ�� ������ ��ã�Ҵٴ� �ǹ��̴�.
			System.out.println("the subject has not been registered");
			return;
		}
	}
	
	public void editGrade() {
		System.out.print("Subject ID:");
		int subjectid = input.nextInt();
		for (int i=0; i<grades.size(); i++) {//���������� �Ѱ��� �����ؾ� �ϹǷ� for�� ���
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
		for (int i=0; i<grades.size(); i++) {//�������� ������ �����Ƿ� for���� ���ؼ� ����Ѵ�.
			grades.get(i).printInfo();//grades�� add index�� i�� �������� �� ��ü�� ������ ������ش�.
		}
	}
}
