import java.util.ArrayList;
import java.util.Scanner;

import grade.Freshmen;
import grade.Grade;
import grade.GradeInput;
import grade.GradeKind;
import grade.SeniorGrade;
import grade.SophomoreGrade;

public class GradeManager {
	ArrayList<GradeInput> grades = new ArrayList<GradeInput>(); //������ ���ѵ��� �ʰ� �����ϱ� ���ؼ� grades��� �̸��� ����Ʈ�� ������ش�.
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
	
	public void deleteGrade() { //�����ȣ �Է����� �� �ƹ��͵� ������ ���ٰ� �����ְ�, �Է��� �����ȣ�� �տ��� �Է��� �����ȣ��� grade�� null�� �����.
		System.out.print("Subject ID:");
		int subjectid = input.nextInt();
		int index = findIndex(subjectid);
		removefromGrades(index, subjectid);
	}
	
	public int findIndex(int subjectid) {
		int index = -1; //array���� index�� ��ã�Ҵٶ�� �ǹ�
		for (int i=0; i<grades.size(); i++) {//�Է¹��� id�� ���� id�� �ִ��� ã������Ѵ�.
			if (grades.get(i).getSubjectid() == subjectid) { //��Ͽ����� id�� ���� �Է��� id�� ���ٸ�
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromGrades(int index, int subjectid) {
		if (index >= 0) {//array���� index�� ã�Ҵٸ�
			grades.remove(index); //grades ����� index�� ������ �ȴ�
			System.out.println("the subject" + subjectid + "is deleted");
			return 1;
		}
		else {//index�� 0���� ũ�� ������ ��ã�Ҵٴ� �ǹ��̴�.
			System.out.println("the subject has not been registered");
			return -1;
		}
	}
	public void editGrade() {
		System.out.print("Subject ID:");
		int subjectid = input.nextInt();
		for (int i=0; i<grades.size(); i++) {//���������� �Ѱ��� �����ؾ� �ϹǷ� for�� ���
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
		for (int i=0; i<grades.size(); i++) {//�������� ������ �����Ƿ� for���� ���ؼ� ����Ѵ�.
			grades.get(i).printInfo();//grades�� add index�� i�� �������� �� ��ü�� ������ ������ش�.
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
