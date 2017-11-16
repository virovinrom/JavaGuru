package lv.FourInALine;

public enum Mark {
    X("X"),  O("O"),  EMPTY("_");
    private String value;

    Mark(String value) {
        this.value = value;
    }
    public boolean contains(Mark field) {
        if (field.equals(EMPTY)) {
            return false;
        }
        return true;
    }
    public String toString() {
        return this.value;
    }
}
