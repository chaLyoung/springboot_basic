package com.dev.springboot_basic.service;

import com.dev.springboot_basic.controller.MainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    @Autowired
    private MainController mainController;

}
