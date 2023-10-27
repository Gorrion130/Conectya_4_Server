package com.project;

import com.project.Brain;

public class Babel {
    public Babel() {
        System.out.println("Inicializando el server");
    }

    public void serve(int port) {
        Brain s = new Brain(port);
    }
}
