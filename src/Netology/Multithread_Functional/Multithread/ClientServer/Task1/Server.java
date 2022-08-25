package Netology.Multithread_Functional.Multithread.ClientServer.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(3333);
             Socket socket = serverSocket.accept();
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            String incomeString;
            while ((incomeString = in.readLine()) != null) {
                if (incomeString.equals("end")) break;
                try {
                    out.println(incomeString + " член ряда Фибоначчи = " + fibonacciValue(Integer.parseInt(incomeString)));
                } catch (NumberFormatException e) {
                    out.println("Некорректные данные ввода");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private BigDecimal fibonacciValue(int numberN) {
        if (numberN < 1) return new BigDecimal(0);
        if (numberN == 1) return new BigDecimal(1);

        BigDecimal num0 = new BigDecimal(0);
        BigDecimal num1 = new BigDecimal(1);
        BigDecimal num2 = new BigDecimal(0);

        for (int i = 0; i < numberN; i++) {
            num2 = num1.add(num0);
            num0 = num1;
            num1 = num2;
        }
        return num2;
    }
}
