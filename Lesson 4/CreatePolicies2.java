
public class CreatePolicies2
{
   public static void main(String[] args)
   {
      CarInsurancePolicy2 c1 = new CarInsurancePolicy2(123);
      CarInsurancePolicy2 c2 = new CarInsurancePolicy2(456,4);
      CarInsurancePolicy2 c3 = new CarInsurancePolicy2(789,12,"NewBerlin");
      
      c1.display();
      c2.display();
      c3.display();
   }
}