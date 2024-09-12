package Com.model;

public class Student {
	private int Sid;
	private String CollageName;
	private String Faculty;
	private String Course;
	private int Fee;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		this.Sid = sid;
	}
	public String getCollageName() {
		return CollageName;
	}
	public void setCollageName(String collageName) {
		CollageName = collageName;
	}
	public String getFaculty() {
		return Faculty;
	}
	public void setFaculty(String faculty) {
		Faculty = faculty;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getFee() {
		return Fee;
	}
	public void setFee(int fee) {
		Fee = fee;
	}
	@Override
	public String toString() {
		return "Student [sid=" + Sid + ", CollageName=" + CollageName + ", Faculty=" + Faculty + ", Course=" + Course
				+ ", Fee=" + Fee + "]";
	}
	
	
	

}
