package grade;

import java.util.Scanner;

public abstract class Grade implements GradeInput{ //abstract �پ��شٴ°��� Grade��� ��ü�� �������� �ʴ´ٶ�� �� �ǹ��Ѵ�.
	protected GradeKind kind = GradeKind.freshmen;
	protected String subjectname; //protected�� �ڽ����� ����� �Ǵµ� �� ���� Ŭ������ ���� ���ϵ����ϴ� ���̴�.
	protected int subjectid;
	protected int subjectcredit;
	protected double yourgrade; //ĸ��ȭ�κ��� �ȴ�.
	
	public Grade() {
	}
	
	public Grade(GradeKind kind) {
		this.kind = kind;
	}
	
	public Grade(String subjectname, int subjectid) { 
		this.subjectname = subjectname;
		this.subjectid = subjectid;
	}
	
	public Grade(String subjectname, int subjectid, int subjectcredit, double yourgrade) { //������
		this.subjectname = subjectname;
		this.subjectid = subjectid;
		this.subjectcredit = subjectcredit;
		this.yourgrade = yourgrade;
	}
	
	public Grade(GradeKind kind, String subjectname, int subjectid, int subjectcredit, double yourgrade) { //������
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
			skind = "1�г�";
			break;
		case sophomore:
			skind = "2�г�";
			break;
		case junior:
			skind = "3�г�";
			break;
		case senior:
			skind = "4�г�";
			break;
		default:
		}
		return skind;
	}
}

