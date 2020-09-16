package me.toam.core.string.mutable_immutable;

public class MutableString {
    private String s;

    public MutableString(String s) {
        this.s = s;
    }
    public String getS() {
        return this.s;
    }

    public void setS(String value) {
        this.s = value;
    }
}
