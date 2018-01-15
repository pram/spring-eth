package com.naughtyzombie.eth.springeth.controller;

import com.naughtyzombie.eth.springeth.wrapper.Counter_sol_Counter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;
import org.web3j.tx.ManagedTransaction;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
    @RequestMapping("/accounts")
    public List<String> getAccounts() {
        List<String> retVal = new ArrayList<>();
        retVal.add("Test1");
        retVal.add("Test2");
        retVal.add("Test3");

        return retVal;
    }

    @RequestMapping("/clientversion")
    public String getClientVersion() throws IOException {
        Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/
        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().send();
        String clientVersion = web3ClientVersion.getWeb3ClientVersion();

        return clientVersion;
    }

    @RequestMapping("/increment")
    public String increment() throws Exception {
        Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/

        //Grab the private key from one of those generated by Ganache
        Credentials credentials = Credentials.create("ae6ae8e5ccbfb04590405997ee2d52d2b330726137b875053c36d94e974d162f");

        Counter_sol_Counter contract = Counter_sol_Counter.load("0x8cdaf0cd259887258bc13a92c0a6da92698644c0",web3,credentials, ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT);

        TransactionReceipt send = contract.incrementCounter().send();

        return send.getBlockHash();
    }

    @RequestMapping("/count")
    public BigInteger count() throws Exception {
        Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/

        //Grab the private key from one of those generated by Ganache
        Credentials credentials = Credentials.create("ae6ae8e5ccbfb04590405997ee2d52d2b330726137b875053c36d94e974d162f");

        Counter_sol_Counter contract = Counter_sol_Counter.load("0x8cdaf0cd259887258bc13a92c0a6da92698644c0",web3,credentials, ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT);

        BigInteger send = contract.getCount().send();

        return send;
    }
}
