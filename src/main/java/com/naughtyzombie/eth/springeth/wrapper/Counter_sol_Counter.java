package com.naughtyzombie.eth.springeth.wrapper;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.2.0.
 */
public class Counter_sol_Counter extends Contract {
    private static final String BINARY = "606060405260008055341561001357600080fd5b60e4806100216000396000f30060606040526004361060525763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416635b34b96681146057578063a87d942c146069578063f5c5ad8314608b575b600080fd5b3415606157600080fd5b6067609b565b005b3415607357600080fd5b607960a6565b60405190815260200160405180910390f35b3415609557600080fd5b606760ac565b600080546001019055565b60005490565b600080546000190190555600a165627a7a72305820ae6220696ac9d5a8ccbae20ae7ae5fb6ab86cc3371dfd01d32b703af97909c5e0029";

    protected Counter_sol_Counter(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Counter_sol_Counter(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> incrementCounter() {
        Function function = new Function(
                "incrementCounter", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getCount() {
        Function function = new Function("getCount", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> decrementCounter() {
        Function function = new Function(
                "decrementCounter", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Counter_sol_Counter> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Counter_sol_Counter.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Counter_sol_Counter> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Counter_sol_Counter.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static Counter_sol_Counter load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Counter_sol_Counter(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Counter_sol_Counter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Counter_sol_Counter(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
