package com.project;

import java.net.URI;
import java.net.URISyntaxException;
import com.project.Netw;

public class Brain {

    private Netw client;

    public Brain(int port) {
        client = new Netw(port);
        client.start();
    }

    public void send(String msg) {
        client.send(msg);
    }

    public String recv() {
        return client.getLastMessage();
    }
}
