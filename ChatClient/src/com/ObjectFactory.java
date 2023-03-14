
package com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUsers_QNAME = new QName("http://com/", "getUsers");
    private final static QName _GetMessageHistoryResponse_QNAME = new QName("http://com/", "getMessageHistoryResponse");
    private final static QName _GetRoomsResponse_QNAME = new QName("http://com/", "getRoomsResponse");
    private final static QName _GetUsersResponse_QNAME = new QName("http://com/", "getUsersResponse");
    private final static QName _BroadcastedMessage_QNAME = new QName("http://com/", "broadcastedMessage");
    private final static QName _BroadcastedMessageResponse_QNAME = new QName("http://com/", "broadcastedMessageResponse");
    private final static QName _CreateUser_QNAME = new QName("http://com/", "createUser");
    private final static QName _GetRooms_QNAME = new QName("http://com/", "getRooms");
    private final static QName _CreateUserResponse_QNAME = new QName("http://com/", "createUserResponse");
    private final static QName _BroadcastResponse_QNAME = new QName("http://com/", "broadcastResponse");
    private final static QName _Broadcast_QNAME = new QName("http://com/", "broadcast");
    private final static QName _MakeRoom_QNAME = new QName("http://com/", "makeRoom");
    private final static QName _GetCurrentSize_QNAME = new QName("http://com/", "getCurrentSize");
    private final static QName _GetMessageHistory_QNAME = new QName("http://com/", "getMessageHistory");
    private final static QName _GetChatUsersResponse_QNAME = new QName("http://com/", "getChatUsersResponse");
    private final static QName _GetChatUsers_QNAME = new QName("http://com/", "getChatUsers");
    private final static QName _MakeRoomResponse_QNAME = new QName("http://com/", "makeRoomResponse");
    private final static QName _GetCurrentSizeResponse_QNAME = new QName("http://com/", "getCurrentSizeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Broadcast }
     * 
     */
    public Broadcast createBroadcast() {
        return new Broadcast();
    }

    /**
     * Create an instance of {@link MakeRoom }
     * 
     */
    public MakeRoom createMakeRoom() {
        return new MakeRoom();
    }

    /**
     * Create an instance of {@link BroadcastResponse }
     * 
     */
    public BroadcastResponse createBroadcastResponse() {
        return new BroadcastResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link GetCurrentSizeResponse }
     * 
     */
    public GetCurrentSizeResponse createGetCurrentSizeResponse() {
        return new GetCurrentSizeResponse();
    }

    /**
     * Create an instance of {@link GetChatUsers }
     * 
     */
    public GetChatUsers createGetChatUsers() {
        return new GetChatUsers();
    }

    /**
     * Create an instance of {@link MakeRoomResponse }
     * 
     */
    public MakeRoomResponse createMakeRoomResponse() {
        return new MakeRoomResponse();
    }

    /**
     * Create an instance of {@link GetChatUsersResponse }
     * 
     */
    public GetChatUsersResponse createGetChatUsersResponse() {
        return new GetChatUsersResponse();
    }

    /**
     * Create an instance of {@link GetMessageHistory }
     * 
     */
    public GetMessageHistory createGetMessageHistory() {
        return new GetMessageHistory();
    }

    /**
     * Create an instance of {@link GetCurrentSize }
     * 
     */
    public GetCurrentSize createGetCurrentSize() {
        return new GetCurrentSize();
    }

    /**
     * Create an instance of {@link GetMessageHistoryResponse }
     * 
     */
    public GetMessageHistoryResponse createGetMessageHistoryResponse() {
        return new GetMessageHistoryResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link GetRooms }
     * 
     */
    public GetRooms createGetRooms() {
        return new GetRooms();
    }

    /**
     * Create an instance of {@link BroadcastedMessageResponse }
     * 
     */
    public BroadcastedMessageResponse createBroadcastedMessageResponse() {
        return new BroadcastedMessageResponse();
    }

    /**
     * Create an instance of {@link BroadcastedMessage }
     * 
     */
    public BroadcastedMessage createBroadcastedMessage() {
        return new BroadcastedMessage();
    }

    /**
     * Create an instance of {@link GetRoomsResponse }
     * 
     */
    public GetRoomsResponse createGetRoomsResponse() {
        return new GetRoomsResponse();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link Chatroom }
     * 
     */
    public Chatroom createChatroom() {
        return new Chatroom();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getMessageHistoryResponse")
    public JAXBElement<GetMessageHistoryResponse> createGetMessageHistoryResponse(GetMessageHistoryResponse value) {
        return new JAXBElement<GetMessageHistoryResponse>(_GetMessageHistoryResponse_QNAME, GetMessageHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getRoomsResponse")
    public JAXBElement<GetRoomsResponse> createGetRoomsResponse(GetRoomsResponse value) {
        return new JAXBElement<GetRoomsResponse>(_GetRoomsResponse_QNAME, GetRoomsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadcastedMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "broadcastedMessage")
    public JAXBElement<BroadcastedMessage> createBroadcastedMessage(BroadcastedMessage value) {
        return new JAXBElement<BroadcastedMessage>(_BroadcastedMessage_QNAME, BroadcastedMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadcastedMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "broadcastedMessageResponse")
    public JAXBElement<BroadcastedMessageResponse> createBroadcastedMessageResponse(BroadcastedMessageResponse value) {
        return new JAXBElement<BroadcastedMessageResponse>(_BroadcastedMessageResponse_QNAME, BroadcastedMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRooms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getRooms")
    public JAXBElement<GetRooms> createGetRooms(GetRooms value) {
        return new JAXBElement<GetRooms>(_GetRooms_QNAME, GetRooms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadcastResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "broadcastResponse")
    public JAXBElement<BroadcastResponse> createBroadcastResponse(BroadcastResponse value) {
        return new JAXBElement<BroadcastResponse>(_BroadcastResponse_QNAME, BroadcastResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Broadcast }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "broadcast")
    public JAXBElement<Broadcast> createBroadcast(Broadcast value) {
        return new JAXBElement<Broadcast>(_Broadcast_QNAME, Broadcast.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "makeRoom")
    public JAXBElement<MakeRoom> createMakeRoom(MakeRoom value) {
        return new JAXBElement<MakeRoom>(_MakeRoom_QNAME, MakeRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getCurrentSize")
    public JAXBElement<GetCurrentSize> createGetCurrentSize(GetCurrentSize value) {
        return new JAXBElement<GetCurrentSize>(_GetCurrentSize_QNAME, GetCurrentSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getMessageHistory")
    public JAXBElement<GetMessageHistory> createGetMessageHistory(GetMessageHistory value) {
        return new JAXBElement<GetMessageHistory>(_GetMessageHistory_QNAME, GetMessageHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChatUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getChatUsersResponse")
    public JAXBElement<GetChatUsersResponse> createGetChatUsersResponse(GetChatUsersResponse value) {
        return new JAXBElement<GetChatUsersResponse>(_GetChatUsersResponse_QNAME, GetChatUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChatUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getChatUsers")
    public JAXBElement<GetChatUsers> createGetChatUsers(GetChatUsers value) {
        return new JAXBElement<GetChatUsers>(_GetChatUsers_QNAME, GetChatUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "makeRoomResponse")
    public JAXBElement<MakeRoomResponse> createMakeRoomResponse(MakeRoomResponse value) {
        return new JAXBElement<MakeRoomResponse>(_MakeRoomResponse_QNAME, MakeRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentSizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getCurrentSizeResponse")
    public JAXBElement<GetCurrentSizeResponse> createGetCurrentSizeResponse(GetCurrentSizeResponse value) {
        return new JAXBElement<GetCurrentSizeResponse>(_GetCurrentSizeResponse_QNAME, GetCurrentSizeResponse.class, null, value);
    }

}
