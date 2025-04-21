package course1.task8;

public class IDCard {
    private String id;

    public IDCard(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IDCard idCard = (IDCard) obj;
        return id.equals(idCard.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
