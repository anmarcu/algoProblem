package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Node> input = init();

        NodeWalker walker = new NodeWalkerImpl();
        System.out.println(walker.walk(input.stream().findFirst().get()));
    }

    static Set<Node> init() {

        Node a1 = new NodeImpl(1);
        Node b8 = new NodeImpl(8);
        Node c7 = new NodeImpl(7);
        Node d3 = new NodeImpl(3);
        Node e5 = new NodeImpl(5);
        Node f2 = new NodeImpl(2);

        a1.setRefs(new HashSet<>(Arrays.asList(b8, c7)));
        b8.setRefs(new HashSet<>(Arrays.asList(a1, c7)));
        c7.setRefs(new HashSet<>(Arrays.asList(a1, b8, d3)));
        d3.setRefs(new HashSet<>(Arrays.asList(c7, e5, f2)));
        e5.setRefs(new HashSet<>(Arrays.asList(d3, f2)));
        f2.setRefs(new HashSet<>(Arrays.asList(d3, e5)));

        return new HashSet<>(Arrays.asList(a1, b8, c7, d3, e5, f2));
    }


}
