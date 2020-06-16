package lab2;

public class Lecturer extends UniversityStaff {
	
	private Student studentForLecturer = null;
	
	public Lecturer (String surname, String name, String patronymic, int age, String sex, int money, double averageRatingSession) {
		
		super(surname, name, patronymic, age, sex, money, averageRatingSession);
	}
	
	public String toString() {
		
		return line + "\nМетод toString вызван из класса - " + getClass().getSimpleName() + "\n" + line + super.toString();
		
	}
	
	//Метод createPair, создающий пару препод - студент
	public void createPair(Object studentForLecturer) {
			
		this.studentForLecturer = (Student)studentForLecturer;
	}
	
	public Student getStudentForLecturer() {
		
		return studentForLecturer;
	}
	
	public String print() {
		
		return super.toString();
		
	}

}
