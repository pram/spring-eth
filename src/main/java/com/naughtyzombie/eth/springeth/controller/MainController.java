package com.naughtyzombie.eth.springeth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;
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
}
