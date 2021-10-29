package com.t20wc.myapplication;

public class CountryResponse {

    private String id;
    private String two_letter_abbreviation;
    private String three_letter_abbreviation;
    private String full_name_locale;
    private String full_name_english;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTwo_letter_abbreviation() {
        return two_letter_abbreviation;
    }

    public void setTwo_letter_abbreviation(String two_letter_abbreviation) {
        this.two_letter_abbreviation = two_letter_abbreviation;
    }

    public String getThree_letter_abbreviation() {
        return three_letter_abbreviation;
    }

    public void setThree_letter_abbreviation(String three_letter_abbreviation) {
        this.three_letter_abbreviation = three_letter_abbreviation;
    }

    public String getFull_name_locale() {
        return full_name_locale;
    }

    public void setFull_name_locale(String full_name_locale) {
        this.full_name_locale = full_name_locale;
    }

    public String getFull_name_english() {
        return full_name_english;
    }

    public void setFull_name_english(String full_name_english) {
        this.full_name_english = full_name_english;
    }
}
