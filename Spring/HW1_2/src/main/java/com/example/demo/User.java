package com.example.demo;

import java.util.List;

public class User {
    private List<WebPage> webPages;
    private int timeReading;
    private String nickname;

    public User(List<WebPage> webPages) {
        this.webPages = webPages;
    }

    public void setWebPages(List<WebPage> webPages) {
        this.webPages = webPages;
    }

    public void setTimeReading(int timeReading){
        this.timeReading = timeReading;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public void readAllPages() {
        for (WebPage webPage : webPages) {
            System.out.println("Read:" + webPage.toString());
        }
    }

    public void testInitMethod(){
        System.out.println("Init done");
    }

    public void testDestroyMethod(){
        System.out.println("Destroy done");
    }
    @Override
    public String toString() {
        return "User{" +
                "webPages=" + webPages +
                ", timeReading=" + timeReading +
                ", nickname=" + nickname +
                '}';
    }
}