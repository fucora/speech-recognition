package com.wlf.translateapi.javabean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResultData implements Serializable {

    private String result;

    private String source;

    private String filePath;
}
