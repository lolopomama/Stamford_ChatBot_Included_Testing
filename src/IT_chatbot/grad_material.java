package IT_chatbot;


public class grad_material {
	 public static boolean graduation_check(int credits){
	    	boolean graduation_require=false;
	    	if(credits<=164){
	    		graduation_require = false;
				System.out.println("Sorry you do not satisfy the number of credits required to graduate");
			}else if(credits>164){
				graduation_require = true;
				System.out.println("Congratualations you satisfy the number of credits required to graduate");
			}
			return graduation_require;
	  	}
}
