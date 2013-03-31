public class iOS
{
  private int iPhone;
  public iOS()
  {
    iPhone = 5;
  }
  
  public iOS(int iPhone)
  {
    this.iPhone = iPhone;
  }
  
  public void magicFeature()
  {
    //Integrates iPhone into human body.
    this.IntegrateIntoHumanBody();
  }
  
  public static void main(String[] args)
  {
    iOS myIOS = new iOS(42);
    System.out.println(myIOS.iPhone + "iPhones!");
  }
  
}