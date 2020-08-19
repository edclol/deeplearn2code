/**
 * Copyright 2020 bejson.com
 */
package com.example.demo.entry.DLCanvas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DLCanvas {

    private List<Nodes> nodes;
    private List<Paths> paths;

    public void setNodes(List<Nodes> nodes) {
        this.nodes = nodes;
    }

    public List<Nodes> getNodes() {
        return nodes;
    }

    public void setPaths(List<Paths> paths) {
        this.paths = paths;
    }

    public List<Paths> getPaths() {
        return paths;
    }

}