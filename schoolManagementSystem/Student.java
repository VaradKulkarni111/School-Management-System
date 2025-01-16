package schoolManagementSystem;

/*
 * This class is responsible for keeping the track of student's
 * fees, feespaid, id, name and grade. 
 */
public class Student {
	
	//Initializing the fields of student.
	private int id;
	private String name;
	private int grade;
	private int feesTotal;
	private int feesPaid;
	
	/**
	 * Fees for every student is $30,000.
	 * Fees paid initially is 0. 
	 * @param id for the student : unique.
	 * @param name of the student. 
	 * @param grade of the student.
	 */
	// creating a constructor. 
	// which is used to create student obj and initialize the values.
	public Student(int id, String name, int grade) {
		
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id=id; // student class fields match/store them inside student constructor's id.
		this.name=name;
		this.grade=grade;
	}

	
	//Not altering the student'name and id field cause they should always remain the same.
	
	/**
	 * Used to update the student's grade.
	 * @param grade new grade of the student.
	 */
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	/**
	 * Keep adding the fees to feesPaid field.
	 * add the fees to fees paid.
	 * @param fees the student is going to pay.
	 */
	public void payFees(int fees) {
		feesPaid=feesPaid+fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	/*
	 * @return id of the student.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @return the name of the student.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return the grade of the student.
	 */
	public int getGrade() {
		return grade;
	}
	
	/**
	 * 
	 * @return the total fees of the student.
	 */
	public int getFeesTotal() {
		return feesTotal;
	}
	
	/**
	 * 
	 * @return the fees paid by the student.
	 */
	public int getFeesPaid() {
		return feesPaid;
	}
	
	/**
	 * 
	 * @return the remaining fees.
	 */
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
	
	public String toString() {
		return "Student's name :"+ name +
				" ,Total fees paid so far $" + feesPaid;
	}
	
}
