import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			System.out.println("Client Applcation:");
			// client must knw 1:ip add 2:port

			Socket socket = new Socket("172.25.10.6",7080);

			System.out.println("connected To server");

			// client will send data to server
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());

			// get data from server
			DataInputStream din = new DataInputStream(socket.getInputStream());

			Scanner sc = new Scanner(System.in);

			String str1 = "", str2 = "";

			while (str1 != null) {

				// send mesaage to server
				System.out.println("Write Message");
				str2 = sc.nextLine();
				dout.writeUTF(str2);// data from client to server

				// read reply sent by server

				str1 = din.readUTF();
				System.out.println("Server Said:" + str1);
			}

			System.out.println("done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}