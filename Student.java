package lab2;

public class Student extends UniversityStaff {
	
	private Lecturer lecturerForStudent = null;	//Препод, специально подобранный для этого студента
	
	//Конструктор для объектов Student
	public Student (String surname, String name, String patronymic, int age, String sex, int money, double averageRatingSession) {
		
		super(surname, name, patronymic, age, sex, money, averageRatingSession);
	}
	
	//Перегруженная функция toString
	public String toString() {
		
		return line + "\nМетод toString вызван из класса - " + getClass().getSimpleName() + "\n" + line + super.toString();
		
	}
	
	//Метод createPair, создающий пару студень - препод
	public void createPair(Object lecturerForStudent) {
		
		this.lecturerForStudent = (Lecturer)lecturerForStudent;
	}
	
	public Lecturer getLecturerForStudent() {
		
		return lecturerForStudent;
	}
	
	public String print() {
		
		return super.toString();
		
	}

}