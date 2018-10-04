package cs2340.gatech.edu.lab3.model;

public enum ClassStanding {
    FRESHMAN ("FR"), SOPHOMORE("SO"), JUNIOR("JR"), SENIOR("SR");
    private final String val;
    public String toString() {
        return this.val;
    }
    ClassStanding(String val) {
        this.val = val;
    }
}
