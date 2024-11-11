package mk.finki.ukim.mk.lab.bootsrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.lab.model.Category;
import mk.finki.ukim.mk.lab.model.Event;
import mk.finki.ukim.mk.lab.model.EventBooking;
import mk.finki.ukim.mk.lab.model.Location;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DataHolder {
    public static final List<Event> events = new ArrayList<>(10);
    public static final List<EventBooking> MyBookings = new ArrayList<>();
    public static final List<Category> categories = new ArrayList<>();
    public static final List<Location> locations = new ArrayList<>();

    public DataHolder() {
        //Categories
        categories.add(new Category((long) (Math.random() * 1000), "Technology"));
        categories.add(new Category((long) (Math.random() * 1000), "Music"));
        categories.add(new Category((long) (Math.random() * 1000), "Sports"));
        categories.add(new Category((long) (Math.random() * 1000), "Conferences"));
        categories.add(new Category((long) (Math.random() * 1000), "Arts"));
        categories.add(new Category((long) (Math.random() * 1000), "Wellness"));

        //Locations
        locations.add(new Location((long) (Math.random() * 1000), "Grand Slam Arena"));
        locations.add(new Location((long) (Math.random() * 1000), "Soccer City Stadium"));
        locations.add(new Location((long) (Math.random() * 1000), "Global Tech Center"));
        locations.add(new Location((long) (Math.random() * 1000), "West Coast Convention Center"));
        locations.add(new Location((long) (Math.random() * 1000), "City Park Arena"));
        locations.add(new Location((long) (Math.random() * 1000), "International Conference Hall"));
        locations.add(new Location((long) (Math.random() * 1000), "Concert Hall Plaza"));
        locations.add(new Location((long) (Math.random() * 1000), "Cultural Expo Grounds"));
        locations.add(new Location((long) (Math.random() * 1000), "Tech Hub Complex"));
        locations.add(new Location((long) (Math.random() * 1000), "Art District"));

        //Events
        events.add(new Event((long) (Math.random() * 1000), "Wimbledon Open", "International tennis championship", 9, categories.get(2), locations.get(0)));
        events.add(new Event((long) (Math.random() * 1000), "World Cup Finals", "Global football tournament", 10, categories.get(2), locations.get(1)));
        events.add(new Event((long) (Math.random() * 1000), "Innovation Summit", "Technology conference for startups", 8, categories.get(0), locations.get(2)));
        events.add(new Event((long) (Math.random() * 1000), "Business Leadership Forum", "Conference for entrepreneurs", 10, categories.get(0), locations.get(3)));
        events.add(new Event((long) (Math.random() * 1000), "PodCon", "Podcasting and media industry conference", 7, categories.get(0), locations.get(4)));
        events.add(new Event((long) (Math.random() * 1000), "GeekFest", "Pop culture and comic convention", 10, categories.get(3), locations.get(5)));
        events.add(new Event((long) (Math.random() * 1000), "Tech Innovators", "Future of tech and AI summit", 9, categories.get(0), locations.get(6)));
        events.add(new Event((long) (Math.random() * 1000), "Global Music Fest", "Music festival featuring global artists", 7, categories.get(1), locations.get(7)));
        events.add(new Event((long) (Math.random() * 1000), "International Art Expo", "Art exhibition with global artists", 8, categories.get(4), locations.get(8)));
        events.add(new Event((long) (Math.random() * 1000), "Health & Wellness Expo", "Fair for healthy living and well-being", 6, categories.get(5), locations.get(9)));
    }
}
