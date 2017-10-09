package IT_chatbot;


public class check_gpa {
	public static String gpa_elegibility(Double GPA){
		String message="";
    	if(GPA<=3.5){
    		message = "Sorry you are not elegibile to take 5 subjects GPA is too low";
			System.out.println("Sorry you are not elegibile to take 5 subjects GPA is too low");
		}else if(GPA>3.5 && GPA<4.1){
			message = "You are elegible to enrol in 5 subjects";
			System.out.println("You are elegible to enrol in 5 subjects");
		}else {
			message = "The GPA you typed in is invalid";
			System.out.println("The GPA you typed in is invalid");
		}
			
		return message;
	}
    
}
