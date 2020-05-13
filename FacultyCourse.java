
public class FacultyCourse {
    protected String departmet;
    protected String courseld;
    protected int credits;
    protected double fee;
    protected final  int CHARGE = 120;
    private static int numberOfCourses;
    protected double profitRate;
    static int i ;
  
    public FacultyCourse()
    {
        
      fee= credits *CHARGE;
       i++;
    }
    public FacultyCourse(String departmet,String courseld,int credits)
    {
        this.departmet=departmet;
        this.courseld=courseld;
        this.credits=credits;
        fee= credits *CHARGE;
        i++;
    }

    public String getDepartmet() {
        return departmet;
    }

    public void setDepartmet(String departmet) {
        this.departmet = departmet;
    }

    public String getCourseld() {
        return courseld;
    }

    public void setCourseld(String courseld) {
        this.courseld = courseld;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getFee() {
          fee= credits *CHARGE;
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public static int getNumberOfCourses() {
        return numberOfCourses;
    }

    public static void setNumberOfCourses(int numberOfCourses) {
        FacultyCourse.numberOfCourses = numberOfCourses;
    }

    public double getProfitRate() {
        return profitRate  = fee* profitRate ;
    }

    public void setProfitRate(double profitRate) {
        this.profitRate = profitRate;
    }
    
   
    public void display() 
    
    {
           
        System.out.println("The Depatement is:= "+ this.departmet);
         System.out.println("The courseld is:= "+this.courseld);
          System.out.println("The credits is:= "+this.credits);
           System.out.println("The fee is:= "+ this.fee);
            System.out.println("The CHARGE is:= "+ this.CHARGE);
            System.out.println( "The profitRate is:= " + this.profitRate);
             System.out.println("\n**********.........************");
    }
    
   public void counter(){
   System.out.println(":::::::::::::.The number of  Courses := " + i);
   
   }
  

    
    
}

