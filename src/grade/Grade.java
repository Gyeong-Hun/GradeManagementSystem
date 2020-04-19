package grade;

import java.util.Scanner;

public class Grade {
	protected GradeKind kind = GradeKind.freshmen;
	protected String subjectname; //protected는 자식한테 상속은 되는데 그 외의 클래스는 접근 못하도록하는 것이다.
	protected int subjectid;
	protected int subjectcredit;
	protected double yourgrade; //캡슐화부분이 된다.
	
	public Grade() {
	}
	
	public Grade(String subjectname, int subjectid) { 
		this.subjectname = subjectname;
		this.subjectid = subjectid;
	}
	
	
	public Grade(String subjectname, int subjectid, int subjectcredit, double yourgrade) { //생성자
		this.subjectname = subjectname;
		this.subjectid = subjectid;
		this.subjectcredit = subjectcredit;
		this.yourgrade = yourgrade;
	}
	
	public GradeKind getKind() {
		return kind;
	}

	public void setKind(GradeKind kind) {
		this.kind = kind;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public int getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}

	public int getSubjectcredit() {
		return subjectcredit;
	}

	public void setSubjectcredit(int subjectcredit) {
		this.subjectcredit = subjectcredit;
	}

	public double getYourgrade() {
		return yourgrade;
	}

	public void setYourgrade(double yourgrade) {
		this.yourgrade = yourgrade;
	}
	
	public void printInfo() {
		System.out.println(" subjectname:" + subjectname + " subjectid:" + subjectid + " subjectcredit:" + subjectcredit + " yourgrade:" + yourgrade);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Input Subject Name:");
		String subjectname = input.next();
		this.setSubjectname(subjectname);
		
		System.out.print("Input Subject Id:");
		int subjectid = input.nextInt();
		this.setSubjectid(subjectid);
		
		System.out.print("Input Subject credit:");
		int subjectcredit = input.nextInt();
		this.setSubjectcredit(subjectcredit);
		
		System.out.print("Input your grade:");
		double yourgrade = input.nextDouble();
		this.setYourgrade(yourgrade);
	}
}
