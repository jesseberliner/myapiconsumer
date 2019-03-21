package com.example.myapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Trivia {


    private Value value;

    public Trivia(){

    }



    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Trivia{" +
                ", value=" + value +
                '}';
    }
}
