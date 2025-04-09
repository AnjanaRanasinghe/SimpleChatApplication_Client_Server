## Simple Chat Application (Client-Server)

# Overview

This project is an implementation of a simple client-server chat application in Java, developed as part of the 5COSC022W.2 Client-Server Architectures module, Socket Programming. The application demonstrates basic network programming concepts using TCP sockets, allowing a client and server to establish a connection, send messages, and receive responses.

**The repository contains two main classes:**

⚫ **SimpleChatServer:** A server that listens for client connections and responds to messages.

⚫ **SimpleChatClient:** A client that connects to the server and sends messages.

This project was built using the NetBeans IDE and follows the guidelines in the tutorial.

---

# Features

📌 Connection-Oriented Communication: Uses TCP sockets for reliable, ordered data delivery.

📌 Socket Programming: Implements ServerSocket for the server and Socket for the client.

📌 Input/Output Streams: Utilizes InputStream and OutputStream for sending and receiving raw byte data.

📌 Exception Handling: Includes try-catch blocks to manage network-related errors.

---

## Prerequisites

📌 Java Development Kit (JDK): Version 8 or higher.

📌 NetBeans IDE: Version 18 or higher (optional, for development).

📌 Git: For cloning and managing the repository.

---

## Setup Instructions
1. Clone the Repository
Clone this repository to your local machine:

text

Collapse

Wrap

Copy
git clone https://github.com/AnjanaRanasinghe/SimpleChatApplication_Client_Server.git
cd SimpleChatApplication_Client_Server
2. Open in NetBeans
Launch NetBeans IDE.
Go to File > Open Project.
Navigate to the cloned repository folder and select it.
Click Open Project.

---

# Running the Application

**1. Start the Server**
   
- Open SimpleChatServer.java in NetBeans.

- Run the file (right-click > Run File or press Shift + F6).

- The server will start listening on a specified port (e.g., 12345—check the code for the exact port).

**2. Start the Client**
   
- Open SimpleChatClient.java in NetBeans.

- Run the file in a separate instance or terminal.

- The client will connect to the server (ensure the hostname is localhost and the port matches the server’s).

**3. Test the Chat**

- Type a message in the client console and press Enter.

- The server will receive the message and send a response back to the client.

- Check the console output on both sides to see the communication.

---

## License

This project is distributed under the MIT License. Feel free to use it as you wish, and contributions are always welcome!

---

## Contact

For any inquiries, please contact [anjana.20231160@iit.ac.lk] or open an issue on GitHub.

---
