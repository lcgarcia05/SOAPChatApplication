package com.client;

import java.util.List;

import com.Chatroom;
import com.User;

public class RunClient {
	
	

	public static void main(String[] args) {
		Client client = new Client();
		
		client.createUser("Client1");
		client.createRoom("TESTERROOM", "TESTER2");

		List<Chatroom> rooms = client.getRooms();
		List<User> users = client.getUsers();
		List<User> chatUsers = client.getChatUsers("TESTERROOM");
		List<String> messages = client.getMessages();
		
		for (User user : users) {
			System.out.println("GLOBAL " + user.getName());
		}
		
		for (User user : chatUsers) {
			System.out.println("CHAT USER: " + user.getName());
		}
		
		client.broadcast("HELLO FROM CLIENT 1", "Client1");
		System.out.println(client.getBroadcasted());
		
		for (String s : messages) {
			System.out.println(s);
		}
	}
}
