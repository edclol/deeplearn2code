/**
 * Copyright 2020 bejson.com
 */
package com.example.demo.entry.DLCanvas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OutPorts {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}