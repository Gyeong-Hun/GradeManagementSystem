package grade;

import java.util.Scanner;

public interface GradeInput {
	
	public int getSubjectid();
	
	public void setSubjectid(int subjectid);
	
	public void setSubjectname(String subjectname);
	
	public void setSubjectcredit(int subjectcredit);//�������� email ���� ��������
	
	public void setYourgrade(double yourgrade);//�������� setphone
	
	public void getUserInput(Scanner input);

	public void printInfo();//������ �θ�Ŭ������ �ְ�, �̰��� ����ϴ� ��Ʈ�� ���ؼ��� gradeinput�� �ִ�.
	
	public void setSubjectName(Scanner input);
	
	public void setSubjectId(Scanner input);
	
	public void setSubjectcredit(Scanner input);
	
	public void setYourgrade(Scanner input);
}
