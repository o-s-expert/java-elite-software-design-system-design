package expert.os.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Team {

    private List<String> members = new ArrayList<>();

    public void add(String member) {
        Objects.requireNonNull(member, "Member cannot be null");
        this.members.add(member);
    }

    public List<String> getMembers() {
        return Collections.unmodifiableList(members);
    }

}
