

public class CarInsurancePolicy2
{
   private int policyNum;
   private int numPay;
   private String residentCity;
   
   public CarInsurancePolicy2(int num, int payments, String city)
   {
      policyNum = num;
      numPay = payments;
      residentCity = city;
   }
   public CarInsurancePolicy2(int num, int payments)
   {
      this(num,payments,"Mayfield");
   }
   public CarInsurancePolicy2(int num)
   {
      this(num,2,"Mayfield");
   }
   public void display()
   {
      System.out.println("Pol# " + policyNum +
                         "\npayments " + numPay +
                         "\nLocation " + residentCity);
   }
   
   
   
}
