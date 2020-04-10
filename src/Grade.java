
public class Grade {
	String subjectname;
	int subjectid;
	int subjectcredit;
	double yourgrade;
	
	public Grade() {
	}
	
	public Grade(String subjectname, int subjectid) { 
		this.subjectname = subjectname;
		this.subjectid = subjectid;
	}
	
	
	public Grade(String subjectname, int subjectid, int subjectcredit, double yourgrade) { //»ý¼ºÀÚ
		this.subjectname = subjectname;
		this.subjectid = subjectid;
		this.subjectcredit = subjectcredit;
		this.yourgrade = yourgrade;
	}
	
	public void printInfo() {
		System.out.println(" subjectname:" + subjectname + " subjectid:" + subjectid + " subjectcredit:" + subjectcredit + " yourgrade:" + yourgrade);
	}
}
