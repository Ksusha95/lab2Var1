/**
 * ЗАДАНИЕ № 1.
	1. Разработать иерархию людей, начиная от общего понятия «Человек» (абстрактный класс):
		a. Слушатель
		b. Преподаватель
		c. Отличник
		d. Крутой преподаватель (ставит одни 5-ки)
	2. Переопределить для каждого класса метод toString, возвращающий соответствующее описание человека:
	 		(Фамилия, имя, отчество, возраст, пол, карманные деньги, среднюю оценку за сессию)
	3. Cделать правильную реализацию метода CreatePair, создающего пару для данного человека по следующим правилам:
		a. По слушателю — преподавателя
		b. По отличнику — крутого преподавателя
	4. Разработать программу для демонстрации классов.*/

package lab2;

import java.util.InputMismatchException;
import java.util.Scanner;
import static lab2.UniversityStaff.line;

public class Main {
	

	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		boolean programExecution = true;
		int choose = 0;
		int lectorCount = 2;
		int studentCount = 2;
		
		CoolLecturer [] coolLecturerStaff = new CoolLecturer[lectorCount]; 
		Lecturer [] lecturerStaff = new Lecturer[lectorCount]; 
		Student [] studentStaff = new Student[studentCount]; 
		ExcellentStudent [] excellentStudentStaff = new ExcellentStudent[studentCount]; 
		
		
		try {
		
			//Заполним массив из 2-х элементов, где будут 2 обычных препода:
			lecturerStaff[0] = new Lecturer("Касимов ", "Рустам ", "Азатович ", 32, "мужской", 99999, 3.7);
			lecturerStaff[1] = new Lecturer("Беклемишев ", "Дмитрий ", "Николаевич ", 30, "мужской", 91998, 4.0);
		
			//Заполним массив из 2-х элементов, где будут 2 классных препода:
			coolLecturerStaff[0] = new CoolLecturer("Орлов ", "Александр ", "Николаевич ", 34, "мужской", 94565, 5.0);
			coolLecturerStaff[1] = new CoolLecturer("Стрельцов ", "Евгений ", "Вадимович ", 35, "мужской", 97463, 5.0);
		
			//Заполним массив из 2-х элементов, где будут 2 обычных студента:
			studentStaff[0] = new Student("Горин ", "Никита ", "Андреевич ", 24, "мужской", 69000, 3.8);
			studentStaff[1] = new Student("Касатина ", "Юлия ", "Сергеевна ", 23, "женский", 61998, 3.0);
		
			//Заполним массив из 2-х элементов, где будут 2 студента-отличника:
			excellentStudentStaff[0] = new ExcellentStudent("Фролов ", "Михаил ", "Анатольевич ", 25, "мужской", 64565, 5.0);
			excellentStudentStaff[1] = new ExcellentStudent("Шишкина ", "Ксения ", "Сергеевна ", 24, "женский", 67463, 5.0);
		}
		
		catch(IllegalArgumentException ex) {
			
			System.out.println(line + "\nОдин из объектов был создан неправильно.\n"
									+ "(Средняя оценка за сессию у отличников и \"крутых\" преподавателей не должна быть меньше 5.0)\n"
									+ "\nПрограмма не может корректно работать и будет завершена\n"+ line);
			System.exit(0);	//Завершение программы
			
		}
		
		
		//Если все элементы были созданы правильно, то программа начнёт выполняться
		System.out.println(line + "\nПрограмма демонстрирует созданную иерархию классов\n" + line);
		startPage();
			
			
		while (programExecution) {
			
			try {
				
				choose = in.nextInt();
				
				switch (choose) {
				
				case 1:
					for (int i = 0; i < lectorCount; i++)
						System.out.println("\n" + lecturerStaff[i].toString());
				break;
				
				case 2:
					for (int i = 0; i < lectorCount; i++)
						System.out.println("\n" + coolLecturerStaff[i].toString());
				break;
				
				case 3:
					for (int i = 0; i < studentCount; i++)
						System.out.println("\n" + studentStaff[i].toString());
				break;
				
				case 4:
					for (int i = 0; i < studentCount; i++)
						System.out.println("\n" + excellentStudentStaff[i].toString());
				break;
				
				case 5:
					for (int i = 0; i < studentCount; i++) {
						
						studentStaff[i].createPair(lecturerStaff[i]);
						System.out.println("\n" + line + "\nДля студента: \n" + studentStaff[i].print()
											+ "\n\nПодобран преподаватель: \n"+ studentStaff[i].getLecturerForStudent().print() + "\n" + line);
					}
				break;
					
				case 6:
					for (int i = 0; i < studentCount; i++) {
						
						excellentStudentStaff[i].createPair(coolLecturerStaff[i]);
						System.out.println("\n" + line + "\nДля студента-отличника: \n" + excellentStudentStaff[i].print()
											+ "\n\nПодобран \"крутой\" преподаватель: \n"+ excellentStudentStaff[i].getCoolLecturerForExcellStudent().print() + "\n" + line);
					}	
				break;
				
				case 7:
					for (int i = 0; i < lectorCount; i++) {
						
						lecturerStaff[i].createPair(studentStaff[i]);
						System.out.println("\n" + line + "\nДля преподавателя: \n" + lecturerStaff[i].print()
											+ "\n\nПодобран студент: \n"+ lecturerStaff[i].getStudentForLecturer().print() + "\n" + line);
					}	
				break;
				
				case 8:
					for (int i = 0; i < lectorCount; i++) {
						
						coolLecturerStaff[i].createPair(excellentStudentStaff[i]);
						System.out.println("\n" + line + "\nДля \"крутого\" преподавателя: \n" + coolLecturerStaff[i].print()
											+ "\n\nПодобран студент-отличник: \n"+ coolLecturerStaff[i].getExcellStudForCoolLectur().print() + "\n" + line);
					}	
				break;
				
				case 0:
					System.out.println(line + "\n\nВыход");
					programExecution = false;
				break;
				
				default: 
					System.out.println("\n Для этого числа нет никакого действия");
				break;
				}
			}
				
			catch(InputMismatchException ex) {
				System.out.print (line + "\nОшибка ввода");
			}
			
			finally {
				
				if (programExecution) {
					programExecution = continueWhile(programExecution);
			
					in.nextLine();	//Поглощение лишней строки
				}
			}
		}
		
		in.close();
	}
	
	public static boolean continueWhile(boolean restart) {
		
		var sc = new Scanner(System.in);
		String choose;
	
		System.out.print ("\n" + line + "\nПродолжить выполнение программы? [Д/н]: ");
		choose = sc.next();
		System.out.println(line);
		
		if (choose.toLowerCase().equals("н")) {
			restart = false;
			System.out.print ("\nВыход");
			sc.close(); 	
		}
		
		else if (choose.toLowerCase().equals("д")) 
			startPage();
		
		else {
			System.out.print ("Ошибка ввода");
			restart = continueWhile(restart);
		}
	
		return restart;
	}	
	
	public static void startPage() {
		
		System.out.print ("Выберите действие: "
				+ "\n [*] Вызвать метод toString для: "
				+ "\n     [1] Массива обычных преподавателей "
				+ "\n     [2] Массива \"крутых\" преподавателей "
				+ "\n     [3] Массива обычных студентов "
				+ "\n     [4] Массива студентов-отличников "
				+ "\n [*] Применить метод createPair для: "
				+ "\n     [5] Студент - Преподаватель"
				+ "\n     [6] Отличник - \"Крутой\" преподаватель"
				+ "\n     [7] Преподаватель - Студент"
				+ "\n     [8] \"Крутой\" преподаватель - Отличник"
				+ "\n [0] Выйти из программы"
				+ "\n\n Ваш ввод: ");
	}
		
		
}
