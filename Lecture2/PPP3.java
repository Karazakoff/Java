import java.net.*;

import java.io.*;

public class PPP3 {

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        // TODO code application logic here

        try

        {
            Socket mySocket = new Socket("www.facebook.com",80); //http:80 https:443

            InputStream in = mySocket.getInputStream();

            OutputStream out = mySocket.getOutputStream();

            byte[] query = ("GET / HTTP/1.1/rHost"+"www.facebook.com"+"\r\n\r\n").getBytes();

            out.write(query);

            //reading from the server
            int b = 0; //temporaty

            while((b=in.read())!=-1) //b=0-255

            {
                System.out.print((char)b);
            }
            in.close();

            out.close();

            mySocket.close();

        }

        catch (Exception e)

        {

            System.out.println("We have an error: "+e);

        }



    }



}
