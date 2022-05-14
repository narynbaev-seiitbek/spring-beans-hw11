package peaksoft.model;

import org.springframework.stereotype.Component;

/**
 * @author seiitbeknarynbaev
 */
@Component
public class Dog extends Animal{
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
