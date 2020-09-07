package entities;

public class Room {

	private int roomNumber;
	private String stundentName;
	private String studentEmail;
	
	public Room(int roomNumber, String stundentName, String studentEmail) {
		this.roomNumber = roomNumber;
		this.stundentName = stundentName;
		this.studentEmail = studentEmail;
	}

	public String getStundentName() {
		return stundentName;
	}

	public void setStundentName(String stundentName) {
		this.stundentName = stundentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
}
