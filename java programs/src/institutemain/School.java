package institutemain;
import institutestudent.Student;
import instituteteacher.Teacher;
import institutecourse.Course;

public class School {

	public static void main(String[] args) {
		Student ob = new Student();
		ob.stdInfo();
		Teacher ob1 = new Teacher();
		ob1.teacherInfo();
		Course ob2 = new Course();
		ob2.courseInfo();
		

	}

}
