import java.util.Scanner; 

public class TimesAndInstructors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter course name: ");

		String subject = sc.nextLine();
			
		String [][] courses = new String [5][3];
		
		courses [0][0]= "CS1301"; courses [0][1]= "Tue 2pm"; courses [0][2]= "Johnson"; 
		courses [1][0]= "CS2510"; courses [1][1]= "Mon 12pm"; courses [1][2]= "Smith"; 
		courses [2][0]= "ENG1101"; courses [2][1]= "Wed 1pm"; courses [2][2]= "Stevens"; 
		courses [3][0]= "MATH2212"; courses [3][1]= "Fri 10am"; courses [3][2]= "Lewis"; 
		courses [4][0]= "CS1302"; courses [4][1]= "Thu 4pm"; courses [4][2]= "Brown"; 
	
			
		boolean a = false;
		while (!a)
		{
			for (int x = 0; x <= courses.length; ++x)
			{
				if (subject.equals(courses[x][0]))
				{
					a = true;
						
					System.out.println("Course: " + courses [x][0] + " Time: " + courses [x][1] + " Instructor: " + courses [x][2]);         
					x = courses.length;
				}
				
				if(!a) 
				{
					System.out.println("Invalid Entry");
				}
			}
		}
		sc.close();
	}
}
