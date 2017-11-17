package lv.FourInALine;

public enum Mark {
    X("X"), O("O"), EMPTY("_");
    private String value;
    Mark(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
