import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Socket_making {

	public static void main(String[] args) throws UnknownHostException {
		
		System.out.println(InetAddress.getLocalHost().getHostName());
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("this is server side");
			ServerSocket server = new ServerSocket(7080);
			System.out.println("---------------server waiting for connection---------");
			Socket socket = server.accept();
			
			System.out.println("connected");
			
			
			
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());

			String ser = "";
			String cli = "";
			
			while(!cli.equalsIgnoreCase("stop"))
			{
				cli=din.readUTF();
				System.out.println("Client said :"+cli);
				
				ser=sc.next();
				dout.writeUTF(ser);
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
