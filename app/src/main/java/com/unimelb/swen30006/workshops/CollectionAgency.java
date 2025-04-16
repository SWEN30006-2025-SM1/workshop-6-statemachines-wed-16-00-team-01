package com.unimelb.swen30006.workshops;

public class CollectionAgency {
    public void writeOff(Account account) {
        System.out.println("written off outstanding debt");
        account.updateStatus(State.CLOSED);
    }
    public void collect(Account account) {
        System.out.println("Collected outstanding debt");
        account.updateStatus(State.CLOSED);
    }
}
