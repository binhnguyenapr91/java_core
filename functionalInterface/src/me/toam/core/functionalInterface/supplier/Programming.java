package me.toam.core.functionalInterface.supplier;

public class Programming {
    private String language;
    private int experience;

    public Programming() {
        this.language = "Java";
        this.experience = 1;
    }

    public Programming(String language, int experience) {
        this.language = language;
        this.experience = experience;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void print() {
        System.out.println("Language: " + language + ". Experience: " + experience);
    }

    public static String getDefaultLanguage() {
        return "Java";
    }
}
