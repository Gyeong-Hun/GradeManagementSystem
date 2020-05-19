package grade;

import java.util.Scanner;

public abstract class Grade implements GradeInput{ //abstract 붙어준다는것은 Grade라는 객체를 생성하지 않는다라는 걸 의미한다.
	protected GradeKind kind = GradeKind.freshmen;
	protected String subjectname; //protected는 자식한테 상속은 되는데 그 외의 클래스는 접근 못하도록하는 것이다.
	protected int subjectid;
	protected int subjectcredit;
	protected double yourgrade; //캡슐화부분이 된다.
	
	public Grade() {
	}
	
	public Grade(GradeKind kind) {
		this.kind = kind;
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
	
	public Grade(GradeKind kind, String subjectname, int subjectid, int subjectcredit, double yourgrade) { //생성자
		this.kind = kind;
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
	
	public abstract void printInfo();
	
	public void setSubjectName(Scanner input) {
		System.out.print("Input Subject Name:");
		String subjectname = input.next();
		this.setSubjectname(subjectname);
	}
	
	public void setSubjectId(Scanner input) {
		System.out.print("Input Subject Id:");
		int subjectid = input.nextInt();
		this.setSubjectid(subjectid);
	}
	
	public void setSubjectcredit(Scanner input) {
		System.out.print("Input Subject credit:");
		int subjectcredit = input.nextInt();
		this.setSubjectcredit(subjectcredit);
	}
	
	public void setYourgrade(Scanner input) {
		System.out.print("Input your grade:");
		double yourgrade = input.nextDouble();
		this.setYourgrade(yourgrade);
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case freshmen:
			skind = "1학년";
			break;
		case sophomore:
			skind = "2학년";
			break;
		case junior:
			skind = "3학년";
			break;
		case senior:
			skind = "4학년";
			break;
		default:
		}
		return skind;
	}
}

