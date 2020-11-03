import java.io.*;
import java.net.*;

public class Simple_Client
{
  public static void main(String[] args)
  {
    try
    {
      Socket my_socket = new Socket("127.0.0.1", 4444);

      InputStream in = my_socket.getInputStream();
      OutputStream out = my_socket.getOutputStream();
      int b = 0; //temporaty

      while((b = in.read())!= -1) //b=0-255

      {
          System.out.print((char)b);
      }
    }
    catch(Exception e)
    {}
  }
}
