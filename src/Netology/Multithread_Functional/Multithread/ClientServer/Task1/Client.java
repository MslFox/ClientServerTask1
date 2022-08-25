package Netology.Multithread_Functional.Multithread.ClientServer.Task1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable {
    public void run() {
        try (
                Socket clientSocket = new Socket("localhost", 22122);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
                Scanner scanner = new Scanner(System.in);
        ) {
            String msg;
            while (true) {
                System.out.println("Введите номер N-го члена ряда Фибоначчи, либо \"end\" для выхода");
                msg = scanner.nextLine();
                out.println(msg);
                if (msg.equalsIgnoreCase("end")) break;
                System.out.println(in.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
