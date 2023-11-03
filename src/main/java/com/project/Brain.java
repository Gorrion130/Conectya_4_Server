package com.project;

import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;

public class Brain {

    private Netw client;

    public Brain(int port) {
        
        client = new Netw(new InetSocketAddress(port));
        client.start();
    }

    public void broadcast(String msg) {
        client.broadcast(msg);
    }

    public String recv() {
        return client.getLastMessage();
    }
}
