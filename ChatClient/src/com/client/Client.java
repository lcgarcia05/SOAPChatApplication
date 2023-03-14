package com.client;

import java.util.List;

import com.ChatServer;
import com.ChatServerImplService;
import com.Chatroom;
import com.User;

public class Client {
	private ChatServerImplService wsdl;
	private ChatServer service; 
	
	public Client() {
		wsdl = new ChatServerImplService();
		service = wsdl.getChatServerImplPort();
		
	}
	
	public void createRoom(String name, String creator) {
		service.makeRoom(name, creator);
	}
	
	public void createUser(String name) {
		service.createUser(name);
	}
	
	public List<User> getUsers(){
		return service.getUsers();
	}
	
	public List<Chatroom> getRooms(){
		return service.getRooms();
	}
	
	public String getBroadcasted() {
		return service.broadcastedMessage();
	}
	
	public void broadcast(String message, String sender) {
		service.broadcast(message, sender);
	}
	
	public List<User> getChatUsers(String name) {
		return service.getChatUsers(name);
	}
	
	public List<String> getMessages(){
		return service.getMessageHistory();
	}

}
