
public class TheoryCourse extends FacultyCourse {
double profitRate_2 ;
     double Fee_3 ;
     
    public TheoryCourse() {
      
         Fee_3 = fee +30;
    }

    public TheoryCourse(String departmet, String courseld, int credits) {
        
        super(departmet, courseld, credits);
        Fee_3 = fee +30;
    }
    
      
     @Override
        public void display()
    
    {
           
        System.out.println("The Depatement is:= "+ this.departmet);
         System.out.println("The courseld is:= "+this.courseld);
          System.out.println("The credits is:= "+this.credits);
           System.out.println("The fee is:= "+ Fee_3);
            System.out.println("The CHARGE is:= "+ this.CHARGE);
            System.out.println( "The profitRate is:...= " + this.profitRate);
                  System.out.println("\n**********.........************");
    }
    
    /**
     *
     * @return
     */
    @Override
     public double getProfitRate() {
        return profitRate  = Fee_3* .2 ;
    }
     
}
