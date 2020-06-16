package lab2;

/*Расширяем класс Human классом UniversityStaff - это студенты и преподаватели университета. 
 * У всех студентов и преподавателей есть общие параметры: карманные деньги, средняя оценка за сессию*/
public abstract class UniversityStaff extends Human {
	
	public static final String line = "--".repeat(50);
	private int money;
	private double averageRatingSession;
	
	//Пишем конструктор для UniversityStaff:
	public UniversityStaff (String surname, String name, String patronymic, int age, String sex, int money, double averageRatingSession) {
		
		super(surname, name, patronymic, age, sex);		//Вызов конструктора для класса Human
		
		//А теперь инициализируем переменные нашего класса:
		this.money = money;
		this.averageRatingSession = averageRatingSession;
	}
	
	//Переопределение метода toString:
	public String toString() { 
		
		return    "\n  Фамилия:  \t\t\t" + getSurname()
				+ "\n  Имя:  \t\t\t" + getName()
				+ "\n  Отчество:  \t\t\t" + getPatronymic()
				+ "\n  Возраст:  \t\t\t" + getAge()
				+ "\n  Пол:  \t\t\t" + getSex()
				+ "\n  Карманные деньги:  \t\t" + money
				+ "\n  Средняя оценка за сессию:  \t" + averageRatingSession
				;
				
	}
	
	public abstract void createPair(Object obj);
	
	public abstract String print();
	
	

}