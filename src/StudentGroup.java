import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
	  
		for(int i=0;i<students.length();i++)
			{
				return students[i];
			}
		
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			throws IllegalArgumentException
		int i;
		
		for(i=0;i<student.length();i++)
		{
			this.students[i]=Student[i];
		}	
        catch(IllegalArgumentException e){}		
	}

	@Override
	public Student getStudent(int index) {
		
		// Add your implementation here
		int i;
		if(index<0 || index>students.length())
			{
		        
				  throws IllegalArgumentException;
			}
		
		else
			return Student[index]=students[index];
		catch(IllegalArgumentException e){}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null && index<0 || index>student.length())
			throws IllegalArgumentException
		else
             this.Student[index]=student[index];
		catch(IllegalArgumentException e){}
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
			throws IllegalArgumentException
		else
		{
			int ele;
			Student[0]=student[ele];
		}
		catch(IllegalArgumentException e)
		{}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
			throws IllegalArgumentException
		else
		{
			int ele;
			Student.length()-1=student[ele];
		}
		catch(IllegalArgumentException e)
		{}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null && index<0 || index>student.length()))
			throws IllegalArgumentException;
		else
		{
			int ele=index;
			Student[index]=ele;
		}
		catch(IllegalArgumentException e)
		{}
			
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(students==null)
			throws IllegalArgumentException;
		else
		{
		      int ele;
			  Student[index]=null;
			  
		}
	catch(IllegalArgumentException e)
	{
		System.out.println("Student not exist");
	}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
