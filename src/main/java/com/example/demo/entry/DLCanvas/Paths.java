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
public class Paths {

    private boolean dotted;
    private String ptype;
    private String startPort;
    private String endPort;
    private String startId;
    private String endId;


}