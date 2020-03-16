package com.example.democlient.controller;

import com.example.democlient.Logs;
import com.example.democlient.model.Account;
import com.example.democlient.model.Amount;
import com.example.democlient.model.Balance;
import com.example.democlient.model.Turnover;
import com.grpc.getAccountsClasses.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("client")
public class TestClientController {
    @Autowired
    private Logs l;
    ManagedChannel channel = ManagedChannelBuilder.forAddress("http://grpc-server-rest11.192.168.42.59.nip.io/", 8070)
            .usePlaintext()
            .build();

    //http://localhost:8090/client/getData?iban=SK5509000000005165056080
    @GetMapping("/getData")
    private AccountData getData(String iban) {
        findAccountByIbanRequest request = findAccountByIbanRequest.newBuilder().setS(iban).build();
        findAccountByIbanResponse accountByIban = AccountServiceGrpc.newBlockingStub(channel).findAccountByIban(request);
        Account a = mapBackAccount(accountByIban.getAccount());
        findTurnoverByIbanRequest build = findTurnoverByIbanRequest.newBuilder().setS(iban).build();

        l.startLog();

        findTurnoverByIbanResponse turnoverByIban = TurnoverServiceGrpc.newBlockingStub(channel).findTurnoverByIban(build);

        l.createLog("findTurnoversByIban","");

        ArrayList<Turnover> al = new ArrayList<>();
        for(TurnoverGrpc t : turnoverByIban.getAccountList())
            al.add(mapBackTurnover(t));

        return new AccountData(a, al);

    }
    //http://localhost:8090/client/updateAccount?iban=123456789
    @GetMapping("/updateAccount")
    private void updateAccount(String iban) {//TREBA SETNUT HODNOTU ESTE
        findAccountByIbanRequest request = findAccountByIbanRequest.newBuilder().setS(iban).build();

        l.startLog();

        findAccountByIbanResponse accountByIban = AccountServiceGrpc.newBlockingStub(channel).findAccountByIban(request);
        updateAccountRequest updatedAccount = updateAccountRequest.newBuilder().setAccount(accountByIban.getAccount()).build();
        updateAccountResponse updateAccountResponse = AccountServiceGrpc.newBlockingStub(channel).updateAccount(updatedAccount);

        l.createLog("updateAccount","");
    }
    //http://localhost:8090/client/findAccountByIban/?iban=123456789
    @GetMapping("/findAccountByIban")
    private Account findAccountByIban(String iban) {
        l.startLog();

        findAccountByIbanRequest request = findAccountByIbanRequest.newBuilder().setS(iban).build();
        findAccountByIbanResponse accountByIban = AccountServiceGrpc.newBlockingStub(channel).findAccountByIban(request);

        l.createLog("findAccountByIban","");
        return mapBackAccount(accountByIban.getAccount());
    }
    //http://localhost:8090/client/removeAccount/?iban=123456789
    @GetMapping("/removeAccount")
    private void removeAccount(String iban) {
        removeAccountRequest account = removeAccountRequest.newBuilder().setS(iban).build();

        l.startLog();

        AccountServiceGrpc.newBlockingStub(channel).removeAccount(account);

        l.createLog("removeAccount","");
    }
    //http://localhost:8090/client/addAccount
    @GetMapping("/addAccount")
    private void addAccount(String iban) {
        AccountGrpc account = AccountGrpc.newBuilder().setIban(iban)
                .setBalance(BalanceGRpc.newBuilder().setCurrency("77").setPrecision("77").setValue("77").build())
                .setCreated("77")
                .setPublished("77")
                .setUpdate("77")
                .setHidden("77").build();

        l.startLog();

        AccountServiceGrpc.newBlockingStub(channel).addAccount(addAccountRequest.newBuilder().setAccount(account).build());

        l.createLog("addAccount","");
    }
    //http://localhost:8090/client/accounts
    @GetMapping("/accounts")
    private Account getAllAccounts() {
        accountsResponse accounts1 = AccountServiceGrpc.newBlockingStub(channel).accounts(accountsRequest.newBuilder().build());

        AccountGrpc a = accounts1.getAccounts(0);
        return mapBackAccount(a);
    }
    //http://localhost:8090/client/findTurnoversByIban/?iban=SK8609000000005155063746
    @GetMapping("/findTurnoversByIban")
    private List<Turnover> findTurnoverByIban(String iban) {
        findTurnoverByIbanRequest build = findTurnoverByIbanRequest.newBuilder().setS(iban).build();

        l.startLog();

        findTurnoverByIbanResponse turnoverByIban = TurnoverServiceGrpc.newBlockingStub(channel).findTurnoverByIban(build);

        l.createLog("findTurnoversByIban","");

        ArrayList<Turnover> al = new ArrayList<>();
        for(TurnoverGrpc t : turnoverByIban.getAccountList())
            al.add(mapBackTurnover(t));

        return al;
    }
    //http://localhost:8090/client/addTurnover
    @GetMapping("/addTurnover")
    private void addTurnover(String iban) {
        TurnoverGrpc turnover = TurnoverGrpc.newBuilder()
                .setNote("00")
                .setCounterAccountName("00")
                .setDescription("00")
                .setSpecific("00")
                .setVariable("00")
                .setAccountIban(iban).build();

        l.startLog();

        TurnoverServiceGrpc.newBlockingStub(channel).addTurnover(addTurnoverRequest.newBuilder().setAccount(turnover).build());

        l.createLog("addTurnover","");
    }
    //http://localhost:8090/client/removeTurnover/?iban=SK8609000000005155063746
    @GetMapping("/removeTurnover")
    private void removeTurnover(String iban) {
        removeTurnoverRequest turnover = removeTurnoverRequest.newBuilder().setS(iban).build();
        TurnoverServiceGrpc.newBlockingStub(channel).removeTurnover(turnover);

    }
    //http://localhost:8090/client/updateTurnover?iban=SK8609000000005155063746
    @GetMapping("/updateTurnover")
    private void updateTurnover(String iban) {//TREBA SETNUT HODNOTU ESTE
        SimpleDateFormat time_formatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");

        findTurnoverByIbanRequest request = findTurnoverByIbanRequest.newBuilder().setS(iban).build();
        findTurnoverByIbanResponse turnoverByIban = TurnoverServiceGrpc.newBlockingStub(channel).findTurnoverByIban(request);
        updateTurnoverRequest.Builder builder = updateTurnoverRequest.newBuilder();

        for(TurnoverGrpc t : turnoverByIban.getAccountList()) {
            t.setNote_(time_formatter.format(System.currentTimeMillis()));
            builder.addAccount(t);
        }

        updateTurnoverResponse updateAccountResponse = TurnoverServiceGrpc.newBlockingStub(channel).updateTurnover(builder.build());
    }

    public Turnover mapBackTurnover(TurnoverGrpc t){
        Amount a = new Amount();
        a.setCurrency(t.getAmount().getCurrency());
        a.setPrecision(t.getAmount().getPrecision());
        a.setValue(t.getAmount().getValue());

        Balance b = new Balance();
        b.setValue(t.getAmount().getValue());
        b.setPrecision(t.getAmount().getPrecision());
        b.setCurrency(t.getAmount().getCurrency());

        Turnover turnover = new Turnover();
        turnover.setAccountIban(t.getAccountIban());
        turnover.setNote(t.getNote());
        turnover.setSpecific(t.getSpecific());
        turnover.setCounterAccountName(t.getCounterAccountName());
        turnover.setVariable(t.getVariable());
        turnover.setDescription(t.getDescription());
        turnover.setAmount(a);
        turnover.setBalance(b);


        return turnover;
    }
    public Account mapBackAccount(AccountGrpc a){
        Balance b = new Balance();
        b.setCurrency(a.getBalance().getCurrency());
        b.setPrecision(a.getBalance().getPrecision());
        b.setValue(a.getBalance().getValue());

        Account account = new Account();
        //account.set_id(new ObjectId(a.getId()));
        account.setCreated(a.getCreated());
        account.setHidden(a.getHidden());
        account.setIban(a.getIban());
        account.setPublished(a.getPublished());
        account.setUpdate(a.getUpdate());
        account.setBalance(b);
        return account;
    }

}
