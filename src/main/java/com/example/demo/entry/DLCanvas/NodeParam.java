/**
 * Copyright 2020 bejson.com
 */
package com.example.demo.entry.DLCanvas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NodeParam {

    private String input_shape;
    private String batch_size;
    private String batch_input_shape;
    private String dtype;
    private String input_tensor;
    private String sparse;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}