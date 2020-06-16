package lab2;

public final class CoolLecturer extends Lecturer {
	
	private ExcellentStudent excellStudForCoolLectur = null;
	
	public CoolLecturer (String surname, String name, String patronymic, int age, String sex, int money, double averageRatingSession) throws RuntimeException {
		
		super(surname, name, patronymic, age, sex, money, averageRatingSession);
		if (averageRatingSession < 5.0) throw new IllegalArgumentException();
		
	}
	
	public String toString() {
		
		return line + "\n" + line + "\nКласс - " + getClass().getSimpleName() + "\n"  + super.toString();
	}
	
	//Метод createPair, создающий пару препод - студент
	public void createPair(Object studentForLecturer) {
				
		this.excellStudForCoolLectur = (ExcellentStudent)studentForLecturer;
	}
	
	public ExcellentStudent getExcellStudForCoolLectur() {
		
		return excellStudForCoolLectur;
	}
	
	public String print() {
		
		return super.print();
		
	}

}
