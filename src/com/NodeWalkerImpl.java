package com;

import java.util.HashSet;
import java.util.Set;

public class NodeWalkerImpl implements NodeWalker {

    int sumHolder = 0;
    Set<Node> traversedNodes = new HashSet<>();

    @Override
    public int walk(Node node) {
        sumHolder += node.getValue();
        traversedNodes.add(node);

        node.getRefs().forEach(childNode -> {
            if (!traversedNodes.contains(childNode)) {
                walk(childNode);
            }
        });

        return sumHolder;
    }

}
