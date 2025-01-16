package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String []args) {
		
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher mellisa = new Teacher(2, "Mellisa", 700);
		Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);
				
		Student tamasha = new Student(1, "Tamasha", 4);
		Student rakshith = new Student(2, "Rakshith", 12);
		Student rabbi = new Student(3, "Rabbi", 5);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rakshith);
		studentList.add(rabbi);
		
		
		
		
		School ghs = new School(teacherList, studentList);
		
		Teacher megan = new Teacher(6, "Megan", 900);
		
		ghs.addTeacher(megan);		
		
		tamasha.payFees(5000);
		rakshith.payFees(6000);;
		System.out.println("Ghs has earned $"+ ghs.getTotalMoneyEarned());
		

		System.out.println();
		System.out.println("------------Making School Pay Salary---------------------");
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("School has spent for salary to " + lizzy.getName() + " and now has $" + ghs.getTotalMoneyEarned());
		
		
		vanderhorn.receiveSalary(vanderhorn.getSalary());
		System.out.println("School has spent for salary to " + vanderhorn.getName() + " and now has $" + ghs.getTotalMoneyEarned());
		
		
		System.out.println(rakshith);
		System.out.println(lizzy);
		
		
		
		
	}
}