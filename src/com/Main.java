package com;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Node> input = new Init().init();

        NodeWalker walker = new NodeWalkerImpl();
        System.out.println(walker.walk(input.stream().findFirst().get()));
    }


}
