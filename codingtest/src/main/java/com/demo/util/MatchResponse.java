package com.demo.util;

import org.springframework.stereotype.Component;

@Component
public class MatchResponse {
    private int line;
    private int start;
    private int end;
    private String in_sentence;

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getIn_sentence() {
        return in_sentence;
    }

    public void setIn_sentence(String in_sentence) {
        this.in_sentence = in_sentence;
    }

    @Override
    public String toString() {
        return "MatchResponse{" +
                "line=" + line +
                ", start=" + start +
                ", end=" + end +
                ", in_sentence='" + in_sentence + '\'' +
                '}';
    }
}
