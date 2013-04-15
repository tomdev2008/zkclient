package com.dajie.core.zk.listener;

import java.util.List;

public abstract class NodeChildrenListener {

    private String nodePath = "";

    public NodeChildrenListener(String nodePath) {
        if (nodePath != null) {
            this.nodePath = nodePath;
        }
    }

    public String getNodePath() {
        return nodePath;
    }

    public abstract boolean update(List<String> childrenNameList);
}
