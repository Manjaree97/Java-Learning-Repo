package MethodOverloadingAndOverrriding.src.com.cerner.example.methodoverriding;

public class Software
{
  protected String run() {
    return "Software running...";
  }

  public void checkStatus() {
    System.out.println(run());
  }
}
