package org.example;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "πΈπ₯πΉπΈπ€";
    }
}
