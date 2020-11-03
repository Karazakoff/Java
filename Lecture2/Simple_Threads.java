
class My_thread extends Thread
{
  @Override
  public void run()
  {
    try
    {
      for(int i = 0 ; i <= 100; i ++)
      {
      System.out.println("Yunus");
      sleep(2000);
      }
    }
    catch(Exception e)
    {}
  }
}
class My_thread2 extends Thread
{
  @Override
  public void run()
  {
    try
    {
      for(int i = 0 ; i <= 100; i ++)
      {
      System.out.println("Zangar");
      sleep(2000);
      }
    }
    catch(Exception e)
    {}
  }
}

public class Simple_Threads{
  public static void main(String[] args){
    My_thread t1 = new My_thread();
    t1.start();
    My_thread2 t2 = new My_thread2();
    t2.start();
  }
}
