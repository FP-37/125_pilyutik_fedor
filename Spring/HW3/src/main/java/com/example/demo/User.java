import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class User {
    private List<WebPage> webPages;
    
    @Value("${user.timeReading}")
    private int timeReading;
    
    @Value("${user.nickname}")
    private String nickname;

    @Autowired
    public User(List<WebPage> webPages) {
        this.webPages = webPages;
    }

    public void readAllPages() {
        for (WebPage webPage : webPages) {
            System.out.println("Read:" + webPage.toString());
        }
    }

    @PostConstruct
    public void testInitMethod(){
        System.out.println("Init done");
    }

    @PreDestroy
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