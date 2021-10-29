package com.t20wc.myapplication;

import java.util.ArrayList;

public class ResponseData {

    private String base_currency_code;
    private String base_currency_symbol;
    private String default_display_currency_code;
    private String default_display_currency_symbol;
    private ArrayList<String> available_currency_codes=new ArrayList<>();
    private ArrayList<ExchangeRates> exchangeRates=new ArrayList<>();

    public String getBase_currency_code() {
        return base_currency_code;
    }

    public void setBase_currency_code(String base_currency_code) {
        this.base_currency_code = base_currency_code;
    }

    public String getBase_currency_symbol() {
        return base_currency_symbol;
    }

    public void setBase_currency_symbol(String base_currency_symbol) {
        this.base_currency_symbol = base_currency_symbol;
    }

    public String getDefault_display_currency_code() {
        return default_display_currency_code;
    }

    public void setDefault_display_currency_code(String default_display_currency_code) {
        this.default_display_currency_code = default_display_currency_code;
    }

    public String getDefault_display_currency_symbol() {
        return default_display_currency_symbol;
    }

    public void setDefault_display_currency_symbol(String default_display_currency_symbol) {
        this.default_display_currency_symbol = default_display_currency_symbol;
    }

    public ArrayList<String> getAvailable_currency_codes() {
        return available_currency_codes;
    }

    public void setAvailable_currency_codes(ArrayList<String> available_currency_codes) {
        this.available_currency_codes = available_currency_codes;
    }

    public ArrayList<ExchangeRates> getExchangeRates() {
        return exchangeRates;
    }

    public void setExchangeRates(ArrayList<ExchangeRates> exchangeRates) {
        this.exchangeRates = exchangeRates;
    }
}
