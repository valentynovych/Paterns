package Behavioral.Observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> articles);
}
