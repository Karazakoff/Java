import java.net.*;
import java.io.*;
import java.util.Scanner;

class Sending extends Thread{
  OutputStream out;
  Scanner fk;
  String user;
  public Sending(OutputStream out, String user){
    this.out = out;
    this.user = user;
  }
  @Override
  public void run(){

    try{

      fk = new Scanner(System.in);
      while(true){
        String data = fk.nextLine();
        out.write(data.getBytes());
        out.write("\r\n".getBytes());
      }

    }
    catch(Exception e) {}

  }
}

class Receiving extends Thread{
  InputStream in;
  String user;
  public Receiving(InputStream in, String user){
    this.in = in;
    this.user = user;
  }
  @Override
  public void run(){
    try{

      while(true){
        int b = 0;
        StringBuffer sb = new StringBuffer();
        while((b = in.read()) != -1 && b != '\n'){
          sb.append((char)b);
        }
        String msg = sb.toString();
        System.out.println(this.user + msg);
      }


    }
    catch(Exception e) {}

  }
}

public class Server{
  public static void main(String[] args){
    try{
      ServerSocket server = new ServerSocket(2020);
      Socket socket = server.accept();
      InputStream in = socket.getInputStream();
      OutputStream out = socket.getOutputStream();

      Sending s1 = new Sending(out, "Server: ");
      s1.start();

      Receiving r1 = new Receiving(in, "Client: ");
      r1.start();

    }
    catch(Exception e){}

  }
}
