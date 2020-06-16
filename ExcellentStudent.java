package lab2;

public final class ExcellentStudent extends Student {
	
	private CoolLecturer coolLecturerForExcellStudent = null;	//"Крутой" препод, специально подобранный для этого студента-отличника
	
	
	public ExcellentStudent (String name, String surname, String patronymic, int age, String sex, int money, double averageRatingSession) throws RuntimeException {
		
		super(name, surname, patronymic, age, sex, money, averageRatingSession);
		if (averageRatingSession < 5.0) throw new IllegalArgumentException();
	}
	
	public String toString() {
		
		return line + "\n" + line + "\nКласс - " + getClass().getSimpleName() + "\n" + super.toString();
		
	}
	
	public void createPair(Object lecturerForStudent) {
		
		this.coolLecturerForExcellStudent = (CoolLecturer)lecturerForStudent;
	}
	
	public CoolLecturer getCoolLecturerForExcellStudent() {
		
		return coolLecturerForExcellStudent;
	}
	
	public String print() {
		
		return super.print();
		
	}

}
