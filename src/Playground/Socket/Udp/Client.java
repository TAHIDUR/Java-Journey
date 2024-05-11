package Playground.Socket.Udp;

import static Utilities.Helper.print;
import java.io.IOException;
import java.util.Scanner;
import java.net.*;


public class Client {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            String message = new Scanner(System.in).nextLine();
            byte[] info = message.getBytes();

            InetAddress address = InetAddress.getLocalHost();
            DatagramPacket packet = new DatagramPacket(info, info.length, address, 9999);
            socket.send(packet);

            byte[] replay = new byte[1024];
            DatagramPacket resPacket = new DatagramPacket(replay, replay.length, InetAddress.getLocalHost(), packet.getPort());
            socket.receive(resPacket);

            print(new String(resPacket.getData(), 0, resPacket.getLength()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
