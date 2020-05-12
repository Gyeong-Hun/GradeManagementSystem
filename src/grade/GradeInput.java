package grade;

import java.util.Scanner;

public interface GradeInput {
	
	public int getSubjectid();
	
	public void setSubjectid(int subjectid);
	
	public void setSubjectname(String subjectname);
	
	public void setSubjectcredit(int subjectcredit);//교수님은 email 나는 과목학점
	
	public void setYourgrade(double yourgrade);//교수님은 setphone
	
	public void getUserInput(Scanner input);

	public void printInfo();//구현은 부모클래스에 있고, 이것을 사용하는 파트에 대해서는 gradeinput에 있다.
	
	public void setSubjectName(Scanner input);
	
	public void setSubjectId(Scanner input);
	
	public void setSubjectcredit(Scanner input);
	
	public void setYourgrade(Scanner input);
}
