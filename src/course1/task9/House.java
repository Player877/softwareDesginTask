package course1.task9;

import java.util.ArrayList;
import java.util.List;

public class House implements RoomComponent {
    protected List<RoomComponent> components = new ArrayList<>();

    public void addComponent(RoomComponent component) {
        components.add(component);
    }

    @Override
    public double getRent() {
        double totalRent = 0;
        for (RoomComponent component : components) {
            totalRent += component.getRent();
        }
        return totalRent;
    }
}
