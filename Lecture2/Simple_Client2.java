
import java.net.*;
import java.io.*;

public class Simple_Client2 {

public static void main(String[] args) {
  try
  {
  ServerSocket server = new ServerSocket(4444);
  System.out.println("The Server is waiting...");
  Socket socket = server.accept();
  System.out.println("There is first client!");
  InputStream in = socket.getInputStream();
  OutputStream out = socket.getOutputStream();
  out.write("Message from the SERVER :)".getBytes());
  in.close();
  out.close();
  socket.close();
  server.close();

  }
  catch (Exception e)
  {
  }

}
}
