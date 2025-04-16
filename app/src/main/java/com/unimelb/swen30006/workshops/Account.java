package com.unimelb.swen30006.workshops;

public class Account {
    private State accountState = State.PENDING;
    private float outStandingDebt = 0;
    private DebtHealth debtHealth;
    private boolean inGrace;

    public void updateStatus(State state) {
        accountState = state;
    }
}
