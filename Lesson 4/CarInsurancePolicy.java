

public class CarInsurancePolicy
{
   private int policyNum;
   private int numPay;
   private String residentCity;
   
   public CarInsurancePolicy(int num, int payments, String city)
   {
      policyNum = num;
      numPay = payments;
      residentCity = city;
   }
   public CarInsurancePolicy(int num, int payments)
   {
      policyNum = num;
      numPay = payments;
      residentCity = "Mayfield";
   }
   public CarInsurancePolicy(int num)
   {
      policyNum = num;
      numPay = 2;
      residentCity = "Mayfield";
   }
   public void display()
   {
      System.out.println("Pol# " + policyNum +
                         "\npayments " + numPay +
                         "\nLocation " + residentCity);
   }
   
   
   
}
