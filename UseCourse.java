
import java.util.*;
import static jdk.nashorn.tools.ShellFunctions.input;


public class UseCourse {
      FacultyCourse courses[]; ///array of Course
   
    
 
    public UseCourse() {
           this.courses = new FacultyCourse[10]; ///Size of array-Course 
            }
    //////:::::::::::::::::TheoryCourse::::::::::::::::::::::::::::::://////
    public void Theory( ){
        String Profit_Of_TheoryCourse =null;
          courses[0]= new TheoryCourse("Eng_2","En003",3);
        double a = courses[0].getProfitRate();
        courses[0].display();
          courses[1]= new TheoryCourse("Eng_3","En004",4);
        double b =  courses[1].getProfitRate();
        courses[1].display();
           courses[2]= new TheoryCourse("Eng_4","En005",5);
        double c = courses[2].getProfitRate();
        courses[2].display();
                Profit_Of_TheoryCourse = String.valueOf(a+b+c);
            System.out.println(":::::::::::::..The _ToTaL_Of_Profit Of TheoryCourse::::::"+ Profit_Of_TheoryCourse);
           courses[2].counter();
           }
    
    // ::::::::::::::::LabCourse::::::::::::::::::::::::::::::://////
    public void Lab( ){
       String Profit_Of_LabCourse =null;
       
      courses[3]= new LabCourse("SIC_2","SIC02",4);
         double a1 = courses[3].getProfitRate();
         courses[3].display();
      courses[4]= new LabCourse("SIC_3","SIC03",5);
          double a2 =  courses[4].getProfitRate();
          courses[4].display();
      courses[5]= new LabCourse("SIC_4","SIC04",6);
         double a3 =  courses[5].getProfitRate();
         courses[5].display();
      courses[6]= new LabCourse("SIC_5","SIC05",3);
         double a4 = courses[6].getProfitRate();
         courses[6].display();
          Profit_Of_LabCourse = String.valueOf(a1+a2+a3+a4);
           System.out.println(":::::::::::::..The _ToTaL_Of_Profit Of LabCourse::::::"+Profit_Of_LabCourse);
            courses[6].counter();
            
    }
    public void ALl_Cousres( ){
    String Profit_Of_TheoryCourse =null;
          courses[0]= new TheoryCourse("Eng_2","En003",3);
        double a = courses[0].getProfitRate();
        courses[0].display();
          courses[1]= new TheoryCourse("Eng_3","En004",4);
        double b =  courses[1].getProfitRate();
        courses[1].display();
           courses[2]= new TheoryCourse("Eng_4","En005",5);
        double c = courses[2].getProfitRate();
        courses[2].display();
                Profit_Of_TheoryCourse = String.valueOf(a+b+c);
            System.out.println(":::::::::::::..The _ToTaL_Of_Profit Of TheoryCourse::::::"+ Profit_Of_TheoryCourse);
           String Profit_Of_LabCourse =null;
       
      courses[3]= new LabCourse("SIC_2","SIC02",4);
         double a1 = courses[3].getProfitRate();
         courses[3].display();
      courses[4]= new LabCourse("SIC_3","SIC03",5);
          double a2 =  courses[4].getProfitRate();
          courses[4].display();
      courses[5]= new LabCourse("SIC_4","SIC04",6);
         double a3 =  courses[5].getProfitRate();
         courses[5].display();
      courses[6]= new LabCourse("SIC_5","SIC05",3);
         double a4 = courses[6].getProfitRate();
         courses[6].display();
          Profit_Of_LabCourse = String.valueOf(a1+a2+a3+a4);
           System.out.println(":::::::::::::..The _ToTaL_Of_Profit Of LabCourse::::::"+Profit_Of_LabCourse);
            
    }
    
      public void PrintOutReport() {
          
     Scanner sc= new Scanner(System.in);
        String Name_Of_Course = null;
        System.out.println("\nPleas Enter Name Of Course:");
          Name_Of_Course =sc.nextLine();
          
           if ("Theory".equals(Name_Of_Course)){
                           Theory( );
                      }
           if ("Lab".equals(Name_Of_Course)){
               Lab();
                       }
           if ("All".equals(Name_Of_Course)){
               ALl_Cousres( );
                       }
                  else{
      System.out.println("\n ....Pleas Enter The Correct Name Of Course ");
                  } 
          
           for(int i=0; i<courses.length; i++){
     System.out.println(" FacultyCourse[" + i + "]: " + courses[i].getClass());
     courses[i].counter();
                  
           }
      }
      
   public static void main (String args[]){
        
        UseCourse v = new UseCourse();
        v.PrintOutReport();
        
                  
       
      }         
         
}
/*for (FacultyCourse course : v.courses) {
              course.counter(); ///Number Of Create Courses 
            v.PrintOutReport(); //Display data Of all Courses */