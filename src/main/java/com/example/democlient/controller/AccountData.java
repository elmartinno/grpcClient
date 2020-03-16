package com.example.democlient.controller;

import com.example.democlient.model.Account;
import com.example.democlient.model.Turnover;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class AccountData {

    private Account account;
    private List<Turnover> turnovers;

    public AccountData(Account account, List<Turnover> turnovers){
        this.account=account;
        this.turnovers=turnovers;
    }
}
