package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AboutUs extends BaseInfoPage implements WebPage{

    public AboutUs(){
        header = "We are young group of programmers who play and make games!";
    }
    @Override
    public void displayContent() {
    }
}