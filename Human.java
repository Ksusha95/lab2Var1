package lab2;

public abstract class Human {	//Класс ЧЕЛОВЕК, а у всех людей параметры только: имя, фамилия, отчество, возраст, пол
	
	private String name;
	private String surname;
	private String patronymic;
	private int age = 0;
	private String sex;	//Пол
	
	public Human (String surname, String name, String patronymic, int age, String sex) {
		
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.sex = sex;
		
		if (age < 0)
			System.out.println("Возраст не может быть отрицательным. Оставлено значение по умолчанию");
		else this.age = age;
	}
	
	//Делаем геттеры для приватных переменных name, age и sex: (Их будем использовать в методе toString)
	public String getName() {
		
		return name;
	}
	
	public String getSurname() {
		
		return surname;
	}
	
	public String getPatronymic() {
		
		return patronymic;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public String getSex() {
		
		return sex;
	}

	public void setAge() {
		
		this.age = 0;
	}
	
	

}
