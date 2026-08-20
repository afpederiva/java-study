package lab;

import java.util.ArrayList;
import java.util.List;

public class Band {

    private String name;

    private List<Musician> members = new ArrayList<>();

    private void validateName (String name) {

        if (name == null) throw new IllegalArgumentException("name cannot be null");
        if (name.isBlank()) throw new IllegalArgumentException("name cannot be blank");

    }

    private void validateMembers (List<Musician> members) {

        if (members == null) throw new IllegalArgumentException("members cannot be null");
        if (members.isEmpty()) throw new IllegalArgumentException("members cannot be empty");

    }

    public Band(String name, List<Musician> members) {
        validateName(name);
        validateMembers(members);
        this.name = name;
        this.members = new ArrayList<>(members);
    }

    public void addMember(Musician musician) {
        if (members.contains(musician)) {
            throw new IllegalArgumentException("Musician is already a member of this band");
        }

        members.add(musician);
    }

    public List<Musician> getMembers() {
        return List.copyOf(members);
    }

}