/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial.week03.socket2;

//import necessary libraries

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



public class SimpleChatServer {
        private static final Logger LOG = Logger.getLogger(SimpleChatClient.class.getName());
    
    static {
        try {
            FileHandler fileHandler = new FileHandler("Log.txt",true);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            LOG.addHandler(fileHandler);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Failded to set up file handler for logger", e);
        }
        
    }
    
    public static void main(String[] args) {
        try {
            //Create a new instance of the Server Socket and pass port number
            ServerSocket serverSocket = new ServerSocket(12345);
            
            //print out a message to say Server is running 
            LOG.log(Level.INFO, "[SERVER] - Server is running...");
            
            // Wait for a client to connect and accept the client request
            Socket socket = serverSocket.accept();

            //print out a message to say client connected and get the IP ddress
            LOG.log(Level.INFO,"[SERVER] - Client has connected {%s}.\n" + socket.getInetAddress().toString());

            // Input stream to receive messages from the client
            InputStream inputStream = socket.getInputStream();

            // Output stream to send messages to the client
            OutputStream outputStream = socket.getOutputStream();

            
            //Create a buffer array with type byte, the size must be 1024
            byte[] buffer = new byte[10240];
            int totalByte;
           
            // Read messages from the client and print them
            while ((totalByte = inputStream.read(buffer)) != -1){
                String clientMsg = new String(buffer, 0, totalByte);
                
                LOG.log(Level.INFO,"[SERVER] - Client said: " + clientMsg);
                
                outputStream.write("Message received".getBytes());
            }
            
            // Close the sockets
            socket.close();
           
            
        //catch IO exception
        } catch(IOException e){
            System.out.println("[SERVER] - Error occured...");
        }
        
    }
}
