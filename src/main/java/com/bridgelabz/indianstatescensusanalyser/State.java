package com.bridgelabz.indianstatescensusanalyser;

public class State {
    public String name;
    public Integer tin;
    public String code;

    public State(String name, Integer tin, String code) {
        this.name = name;
        this.tin = tin;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTin() {
        return tin;
    }

    public void setTin(Integer tin) {
        this.tin = tin;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", tin=" + tin +
                ", code='" + code + '\'' +
                '}';
    }
}
