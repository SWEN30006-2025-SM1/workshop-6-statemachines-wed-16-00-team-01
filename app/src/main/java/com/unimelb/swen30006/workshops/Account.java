package com.unimelb.swen30006.workshops;

public class Account {
    private State accountState = State.PENDING;
    private float outStandingDebt = 0;
    private DebtHealth debtHealth;
    private boolean inGrace;

    public Account() {}

    public void updateStatus(State state) {
        accountState = state;
    }

    public State getAccountState() { return accountState;}
    public void setAccountState(State accountState) { this.accountState = accountState;}

    public float getOutStandingDebt() { return outStandingDebt;}
    public void setOutStandingDebt(float outStandingDebt) { this.outStandingDebt = outStandingDebt;}

    public DebtHealth getDebtHealth() { return debtHealth;}
    public void setDebtHealth(DebtHealth debtHealth) { this.debtHealth = debtHealth;}

    public boolean isInGrace() { return inGrace;}
    public void setInGrace(boolean inGrace) { this.inGrace = inGrace;}
}
