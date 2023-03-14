
package com;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ChatServer", targetNamespace = "http://com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ChatServer {


    /**
     * 
     * @return
     *     returns java.util.List<com.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://com/", className = "com.GetUsers")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://com/", className = "com.GetUsersResponse")
    public List<User> getUsers();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "broadcast", targetNamespace = "http://com/", className = "com.Broadcast")
    @ResponseWrapper(localName = "broadcastResponse", targetNamespace = "http://com/", className = "com.BroadcastResponse")
    public void broadcast(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "makeRoom", targetNamespace = "http://com/", className = "com.MakeRoom")
    @ResponseWrapper(localName = "makeRoomResponse", targetNamespace = "http://com/", className = "com.MakeRoomResponse")
    public void makeRoom(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCurrentSize", targetNamespace = "http://com/", className = "com.GetCurrentSize")
    @ResponseWrapper(localName = "getCurrentSizeResponse", targetNamespace = "http://com/", className = "com.GetCurrentSizeResponse")
    public int getCurrentSize();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMessageHistory", targetNamespace = "http://com/", className = "com.GetMessageHistory")
    @ResponseWrapper(localName = "getMessageHistoryResponse", targetNamespace = "http://com/", className = "com.GetMessageHistoryResponse")
    public List<String> getMessageHistory();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "broadcastedMessage", targetNamespace = "http://com/", className = "com.BroadcastedMessage")
    @ResponseWrapper(localName = "broadcastedMessageResponse", targetNamespace = "http://com/", className = "com.BroadcastedMessageResponse")
    public String broadcastedMessage();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "createUser", targetNamespace = "http://com/", className = "com.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://com/", className = "com.CreateUserResponse")
    public void createUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getChatUsers", targetNamespace = "http://com/", className = "com.GetChatUsers")
    @ResponseWrapper(localName = "getChatUsersResponse", targetNamespace = "http://com/", className = "com.GetChatUsersResponse")
    public List<User> getChatUsers(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.Chatroom>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRooms", targetNamespace = "http://com/", className = "com.GetRooms")
    @ResponseWrapper(localName = "getRoomsResponse", targetNamespace = "http://com/", className = "com.GetRoomsResponse")
    public List<Chatroom> getRooms();

}