package com.ifmo.jjd.lesson13.generic.bounded.type.parameters;

public abstract class Transport implements Repairing, Comparable<Transport>{
    private String departureSt;
    private String destSt;
    private String num;

    public Transport(String departureSt, String destSt, String num) {
        this.departureSt = departureSt;
        this.destSt = destSt;
        this.num = num;
    }

    public Transport() {
    }

    public String getDepartureSt() {
        return departureSt;
    }

    public String getDestSt() {
        return destSt;
    }

    public String getNum() {
        return num;
    }

    public void setDepartureSt(String departureSt) {
        this.departureSt = departureSt;
    }

    public void setDestSt(String destSt) {
        this.destSt = destSt;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
