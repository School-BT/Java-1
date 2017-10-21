
public class CreatePolicies
{
   public static void main(String[] args)
   {
      CarInsurancePolicy c1 = new CarInsurancePolicy(123);
      CarInsurancePolicy c2 = new CarInsurancePolicy(456,4);
      CarInsurancePolicy c3 = new CarInsurancePolicy(789,12,"NewBerlin");
      
      c1.display();
      c2.display();
      c3.display();
   }
}