package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class IndieGamesPage extends BaseInfoPage implements WebPage{
    private String popularChoice;

    public void setDescription(String popularChoice) {
        this.popularChoice = popularChoice;
    }

    public IndieGamesPage(){
        header = "LIST OF GAMES";
    }

    @Override
    public void displayContent() {
        System.out.println("1." );
    }

    @Override
    public String toString() {
        return "IndieGamesPage{" +
                "popularChoice='" + popularChoice + '\'' +
                '}';
    }
}
