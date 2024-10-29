package mk.ukim.finki.mk.lab.repository;
import lombok.AllArgsConstructor;
import mk.ukim.finki.mk.lab.model.Event;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository
public class EventRepository {
    private final List<Event> events;

    public EventRepository() {
        this.events = Arrays.asList(
                new Event("name1","description1",1),
                new Event("name2","description2",2),
                new Event("name3","description3",3),
                new Event("name4","description4",4),
                new Event("name5","description5",5),
                new Event("name6","description6",6),
                new Event("name7","description7",7),
                new Event("name8","description8",8),
                new Event("name9","description9",9),
                new Event("name10","description10",10)
        );
    }
    public List<Event> findAll(){
        return events;
    }

    public List<Event> searchEvents(String text){
        return events.stream()
                .filter(event -> event.getName().contains(text) || event.getPopularityScore() >= Double.parseDouble(text) ).toList();
    }
}
