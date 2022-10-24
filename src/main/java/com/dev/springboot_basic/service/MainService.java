package com.dev.springboot_basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    public String getMessage(String msg) {

        return "return " + msg + "by mainService";
    }

}
