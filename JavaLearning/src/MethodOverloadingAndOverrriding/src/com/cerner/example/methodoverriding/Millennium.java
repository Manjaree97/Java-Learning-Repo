package MethodOverloadingAndOverrriding.src.com.cerner.example.methodoverriding;

public class Millennium extends Software {

  public static void main(String[] args)
  {
    Millennium millennium = new Millennium();

    /* Quiz: What will be printed?
        A: Software running...
        B: Millennium is running...
    */
    millennium.checkStatus();
  }

  /*
    Since super's access modifier is protected,
    we cannot use any modifier more restrictive here.
  */
  @Override
  protected String run()
  {
    return "Millennium is running...";
  }
}
