package Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	String studentId;
	String name;
	String classStd;
	int percentage;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassStd() {
		return classStd;
	}
	public void setClassStd(String classStd) {
		this.classStd = classStd;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
