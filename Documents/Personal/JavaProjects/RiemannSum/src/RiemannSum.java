public class RiemannSum{
   private double startingX;
   private double endingX;
   private double deltaX;
   private double n;
   
   public RiemannSum(double startingX, double endingX, double deltaX){
      this.startingX = startingX;
      this.endingX = endingX;
      this.deltaX = deltaX;
   }
   
   public RiemannSum(){}

   public double getStartX(){
      return startingX;
   }
   
   public double getEndX(){
      return endingX;
   }
   
   public double getN(){
      return n;
   }
   
   public double getDelta(){
      return deltaX;
   }
    
   public void setN(double n){
      this.n = n;
   }
   
   public void setStartX(double x){
      startingX = x;
   }
   
   public void setEndX(double x){
      endingX = x;
   }
   
   public void setDelta(double x){
      deltaX = x;
   }

   public void calculateDelta(double n){
      deltaX = (getEndX() - getStartX()) / n;
   }
      
   public double equation(double x){
      return (Math.pow(x, 2) + 5*x - 2); //change the f(x) equation given by the problem here
      
      /* For Example
       
         1. x^2 would be "Math.pow(x, 2)"
         2. x^3 would be "Math.pow(x, 3)"
         3. 3 − 1/2X would be "(3 - (0.5*x))"
         4. 2sin(X) would be "(2 * Math.sin(x))"
         5. x^2 + 5x - 2 would be "Math.pow(x, 2) + 5*x - 2"
         
         If there are other operators you may need, check
         http://tutorials.jenkov.com/java/math-operators-and-math-class.html
      */
   }
   
   public void calculateMSum(){
      double sum = 0.0;
      for (double i = getStartX() + (getDelta()/2); i <= getEndX(); i += getDelta()){
        sum += (equation(i)*(getDelta()));
      }
      System.out.print(sum);
     
   }
   
   public void calculateLSum(){
      double sum = 0.0;
      for (double i = getStartX(); i <= getEndX() - getDelta(); i += getDelta()){
        sum += (equation(i)*(getDelta()));
      }
      System.out.print(sum);
     
   }
   
   public void calculateRSum(){
      double sum = 0.0;
      for (double i = getStartX() + getDelta(); i <= getEndX(); i += getDelta()){
        sum += (equation(i)*(getDelta()));
      }
      System.out.print(sum);
     
   }


}