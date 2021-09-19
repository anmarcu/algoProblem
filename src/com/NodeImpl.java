package com;

import java.util.Objects;
import java.util.Set;

public class NodeImpl implements Node {
    private int value;
    private Set<Node> refs;

    NodeImpl(int value) {
        this.value = value;
    }

    public void setRefs(Set<Node> refs) {
        this.refs = refs;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public Set<Node> getRefs() {
        return refs;
    }

    @Override
    public boolean equals(Object o) {
        NodeImpl node = (NodeImpl) o;
        return value == node.value && refs.containsAll(node.refs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
