package com.project;

import com.project.Brain;

public class Babel {
    private Brain s;
    public Babel() {
        System.out.println("Inicializando el server");
    }

    public void serve(int port) {
        s = new Brain(port);
    }
}
