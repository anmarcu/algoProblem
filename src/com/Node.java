package com;

import java.util.Set;

public interface Node {
    int getValue();
    Set<Node> getRefs();
    void setRefs(Set<Node> refs);
}
