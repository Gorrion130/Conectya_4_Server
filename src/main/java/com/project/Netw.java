package com.project;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.net.http.WebSocket;
import java.nio.ByteBuffer;
import java.util.Collections;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.ServerHandshake;
import org.java_websocket.server.WebSocketServer;

public class Netw extends WebSocketServer {
  
  public Netw(InetSocketAddress port) {
    super(port);
    //TODO Auto-generated constructor stub
  }

  private String lmessage;

  @Override
  public void onOpen(org.java_websocket.WebSocket conn, ClientHandshake handshake) {
    // TODO Auto-generated method stub
    System.out.println(conn.getRemoteSocketAddress().getAddress().getHostAddress()+" se ha conectado :D");
  }

  @Override
  public void onClose(org.java_websocket.WebSocket conn, int code, String reason, boolean remote) {
    // TODO Auto-generated method stub
    System.out.println(conn.getRemoteSocketAddress().getAddress().getHostAddress()+" se ha desconectado :C");
  }

  @Override
  public void onMessage(org.java_websocket.WebSocket conn, String message) {
    // TODO Auto-generated method stub
    lmessage = message;
    System.out.println(message);
  }

  @Override
  public void onError(org.java_websocket.WebSocket conn, Exception ex) {
    // TODO Auto-generated method stub
    System.out.println(conn.getRemoteSocketAddress().getAddress().getHostAddress()+" ha tenido el error: "+ ex);
  }

  @Override
  public void onStart() {
    // TODO Auto-generated method stub
    System.out.println("Servidor inicializado :D");
  }

  public String getLastMessage() {
    return lmessage;
  }
}