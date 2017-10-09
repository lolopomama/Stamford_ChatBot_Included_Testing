package IT_chatbot;


import java.io.IOException;
import java.util.Scanner;

public class chat_bot {
  
	
	public static void main(String[] args) throws IOException {
		System.out.println("--------------------------------------------------");
		System.out.println("Welcome to IT Department ChatBot by Team");
		System.out.println("--------------------------------------------------");
		
		Scanner console = new Scanner (System.in);
		String previous_transcript;
		String courseCode="";
		String studentID="";
		String courseName="Programming 1";
		String message="";
		Double GPA=0.0;
		int credits;
		int option=0;
		
		
		while (option!=-1){
		System.out.println("");
		System.out.println("Please choose from the list below the task you would like to perform (-1 to exit):");
		System.out.println(" 1) View available IT courses for this term ");       
		System.out.println(" 2) View course Time, Date and Instructor ");            //Junit test complete
		System.out.println(" 3) Check my GPA and eligibility to take 5 courses ");   //Junit test complete
		System.out.println(" 4) Contact head of department ");
		System.out.println(" 5) Enrol in an IT course now");
		System.out.println(" 6) Drop an IT course that you are enrolled in ");
		System.out.println(" 7) Request a remark for a recent past IT exam ");
		System.out.println(" 8) View all planned IT trips for this term  ");
		System.out.println(" 9) View Competitions ");
		System.out.println("10) Graduation Check ");                                 //Junit test complete

		System.out.println("");
		System.out.println("option chosen:");
		option = console.nextInt();
		
		switch (option){
		
		case 1:System.out.println("The following courses are being offered this coming term:");
		available.view_courses_available();
        break;
        
		case 2:System.out.println("");
		System.out.println("Please enter the course code:");
		courseCode = console.nextLine();
		courseCode =console.nextLine();
		course_details.view_course_details(courseCode);
        break;
        
		case 3:System.out.println("");
		System.out.println("Please enter your GPA:");
		GPA = console.nextDouble();
		check_gpa.gpa_elegibility(GPA);
        break;
        
		case 4:System.out.println("");
		System.out.println("Please enter your student id:");
		studentID = console.nextLine();
		studentID = console.nextLine();
		contact_hod.send(studentID);
        break;
        
        case 5:System.out.println("");
        System.out.print("Enter the course code: ");
        courseCode = console.nextLine();
        enrol_now.enter_courses(courseCode,courseName);
        break;
        
        case 6:System.out.println("");
            System.out.println("Please enter the course code to drop:");
			courseCode = console.nextLine();
			courseCode =console.nextLine();
			drop_course.drop(studentID,courseCode);
      
        break;
        
        case 7:System.out.println("");	
            System.out.println("Please enter your student id:");
			studentID = console.nextLine();
			studentID = console.nextLine();
			System.out.println("");
		//	 request_remark.remark(studentID);
			
		break;
		
        case 8:System.out.println("");
        view_trips.it_trips();
        break;
        
        case 9:System.out.println("");
		check_competitions.compete();
        break;
        
        case 10:System.out.println("");
        System.out.println("");
		System.out.println("Please input the number of credits earned to date:");
		credits = console.nextInt();
		grad_material.graduation_check(credits);
        break;
		
		}
		}
	}
}
