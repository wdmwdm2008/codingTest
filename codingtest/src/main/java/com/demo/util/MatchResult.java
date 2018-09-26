package com.demo.util;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MatchResult {
    private String query_text;
    private int number_of_occurrences;
    private List<MatchResponse> occurrences;

    public String getQuery_text() {
        return query_text;
    }

    public void setQuery_text(String query_text) {
        this.query_text = query_text;
    }

    public int getNumber_of_occurrences() {
        return number_of_occurrences;
    }

    public void setNumber_of_occurrences(int number_of_occurrences) {
        this.number_of_occurrences = number_of_occurrences;
    }

    public List<MatchResponse> getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(List<MatchResponse> occurrences) {
        this.occurrences = occurrences;
    }

    @Override
    public String toString() {
        return "MatchResult{" +
                "query_text='" + query_text + '\'' +
                ", number_of_occurrences=" + number_of_occurrences +
                ", occurrences=" + occurrences +
                '}';
    }
}
