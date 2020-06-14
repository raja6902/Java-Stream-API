package priorityQueue;

public class Student implements Comparable<Student> {
  private int id;
  private String name;
  private int grade;
  private double gpa;

	public Student(int id, String name, int grade, double gpa) {

		this.id = id;
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public double getGpa() {
		return gpa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(gpa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + grade;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(gpa) != Double.doubleToLongBits(other.gpa))
			return false;
		if (grade != other.grade)
			return false;
		if (id != other.id)
 			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public int compareTo(Student other) {
		if (this.equals(other))
			return 0;
			else if(this.getGrade()>other.getGrade()) 
				return 1;
			else 
			return -1;
		}
	public String toString() {
		return "{ID: " + getId() + " Name:  " +  getName()+ " "+ "Grade:  " + getGrade() +" "+  "GPA:  " + getGpa() + "}";
	}
	}

	


