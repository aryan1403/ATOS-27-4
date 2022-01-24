package com.example.springbootdemo.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Data
public class response {
    int code;
    String message;
    Object data;
}
