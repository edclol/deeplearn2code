/**
 * Copyright 2020 bejson.com
 */
package com.example.demo.entry.DLCanvas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**

 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Nodes {

    private String id;
    private String name;
    private String icon;
    private String category;
    private String operator;
    private List<String> children;
    private HashMap<String, String> nodeParam;
    private int positionX;
    private int positionY;
    private boolean showStatus;
    private String class_id;
    private List<OutPorts> outPorts;
    private List<InPorts> inPorts;
    private Set<String> prev = new HashSet<>();
    private Set<String> next = new HashSet<>();
    private int status = 0;

    public Boolean addNext(String s) {
        return this.next.add(s);
    }

    public Boolean addPrev(String s) {
        return this.prev.add(s);
    }


}