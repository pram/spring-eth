package com.naughtyzombie.eth.springeth.wrapper;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.EventValues;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple3;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.2.0.
 */
public class Usercrud_sol_UserCrud extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b61050c8061001e6000396000f3006060604052600436106100825763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166329434e3381146100875780632e071db3146100be5780634209fff1146100f45780636f77926b1461011357806381f1d75c14610156578063b5cb15f714610178578063ffcc7bbf1461018b575b600080fd5b341561009257600080fd5b6100ac600160a060020a03600435166024356044356101bd565b60405190815260200160405180910390f35b34156100c957600080fd5b6100e0600160a060020a03600435166024356102ac565b604051901515815260200160405180910390f35b34156100ff57600080fd5b6100e0600160a060020a0360043516610338565b341561011e57600080fd5b610132600160a060020a0360043516610395565b60405192835260208301919091526040808301919091526060909101905180910390f35b341561016157600080fd5b6100e0600160a060020a03600435166024356103d9565b341561018357600080fd5b6100ac610466565b341561019657600080fd5b6101a160043561046d565b604051600160a060020a03909116815260200160405180910390f35b60006101c884610338565b156101d257600080fd5b600160a060020a03841660009081526020819052604090208381556001908101839055805481908082016102068382610499565b6000928352602080842092909201805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a038a16908117909155808452918390526040928390209390036002909301839055917f57f7301fe8e6f5b36f73ccce215bfaee0be1dda153d32992eb9ac05da866861191869086905192835260208301919091526040808301919091526060909101905180910390a250600154600019019392505050565b60006102b783610338565b15156102c257600080fd5b600160a060020a0383166000818152602081905260409081902060018101859055600281015490547f24659ed7fa20faefd192de94aa063d3b6e668e49b0ca2738ca4d866db1ae9eee9286905192835260208301919091526040808301919091526060909101905180910390a250600192915050565b600154600090151561034c57506000610390565b600160a060020a03821660008181526020819052604090206002015460018054909190811061037757fe5b600091825260209091200154600160a060020a03161490505b919050565b60008060006103a384610338565b15156103ae57600080fd5b505050600160a060020a03166000908152602081905260409020805460018201546002909201549092565b60006103e483610338565b15156103ef57600080fd5b600160a060020a0383166000818152602081905260409081902084815560028101546001909101547f24659ed7fa20faefd192de94aa063d3b6e668e49b0ca2738ca4d866db1ae9eee928691905192835260208301919091526040808301919091526060909101905180910390a250600192915050565b6001545b90565b600060018281548110151561047e57fe5b600091825260209091200154600160a060020a031692915050565b8154818355818115116104bd576000838152602090206104bd9181019083016104c2565b505050565b61046a91905b808211156104dc57600081556001016104c8565b50905600a165627a7a7230582009b89b8734ad0e959dd50ba879685820664e43bea38925383d272ddafae06e740029";

    protected Usercrud_sol_UserCrud(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Usercrud_sol_UserCrud(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<LogNewUserEventResponse> getLogNewUserEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("LogNewUser", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bytes32>() {}, new TypeReference<Uint256>() {}));
        List<EventValues> valueList = extractEventParameters(event, transactionReceipt);
        ArrayList<LogNewUserEventResponse> responses = new ArrayList<LogNewUserEventResponse>(valueList.size());
        for (EventValues eventValues : valueList) {
            LogNewUserEventResponse typedResponse = new LogNewUserEventResponse();
            typedResponse.userAddress = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.index = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.userEmail = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.userAge = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<LogNewUserEventResponse> logNewUserEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("LogNewUser", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bytes32>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, LogNewUserEventResponse>() {
            @Override
            public LogNewUserEventResponse call(Log log) {
                EventValues eventValues = extractEventParameters(event, log);
                LogNewUserEventResponse typedResponse = new LogNewUserEventResponse();
                typedResponse.userAddress = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.index = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.userEmail = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.userAge = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public List<LogUpdateUserEventResponse> getLogUpdateUserEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("LogUpdateUser", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bytes32>() {}, new TypeReference<Uint256>() {}));
        List<EventValues> valueList = extractEventParameters(event, transactionReceipt);
        ArrayList<LogUpdateUserEventResponse> responses = new ArrayList<LogUpdateUserEventResponse>(valueList.size());
        for (EventValues eventValues : valueList) {
            LogUpdateUserEventResponse typedResponse = new LogUpdateUserEventResponse();
            typedResponse.userAddress = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.index = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.userEmail = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.userAge = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<LogUpdateUserEventResponse> logUpdateUserEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("LogUpdateUser", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bytes32>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, LogUpdateUserEventResponse>() {
            @Override
            public LogUpdateUserEventResponse call(Log log) {
                EventValues eventValues = extractEventParameters(event, log);
                LogUpdateUserEventResponse typedResponse = new LogUpdateUserEventResponse();
                typedResponse.userAddress = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.index = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.userEmail = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.userAge = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public RemoteCall<TransactionReceipt> insertUser(String userAddress, byte[] userEmail, BigInteger userAge) {
        Function function = new Function(
                "insertUser", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(userAddress), 
                new org.web3j.abi.datatypes.generated.Bytes32(userEmail), 
                new org.web3j.abi.datatypes.generated.Uint256(userAge)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> updateUserAge(String userAddress, BigInteger userAge) {
        Function function = new Function(
                "updateUserAge", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(userAddress), 
                new org.web3j.abi.datatypes.generated.Uint256(userAge)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> isUser(String userAddress) {
        Function function = new Function("isUser", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(userAddress)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<Tuple3<byte[], BigInteger, BigInteger>> getUser(String userAddress) {
        final Function function = new Function("getUser", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(userAddress)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple3<byte[], BigInteger, BigInteger>>(
                new Callable<Tuple3<byte[], BigInteger, BigInteger>>() {
                    @Override
                    public Tuple3<byte[], BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);;
                        return new Tuple3<byte[], BigInteger, BigInteger>(
                                (byte[]) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    public RemoteCall<TransactionReceipt> updateUserEmail(String userAddress, byte[] userEmail) {
        Function function = new Function(
                "updateUserEmail", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(userAddress), 
                new org.web3j.abi.datatypes.generated.Bytes32(userEmail)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getUserCount() {
        Function function = new Function("getUserCount", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getUserAtIndex(BigInteger index) {
        Function function = new Function("getUserAtIndex", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(index)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<Usercrud_sol_UserCrud> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Usercrud_sol_UserCrud.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Usercrud_sol_UserCrud> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Usercrud_sol_UserCrud.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static Usercrud_sol_UserCrud load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Usercrud_sol_UserCrud(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Usercrud_sol_UserCrud load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Usercrud_sol_UserCrud(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class LogNewUserEventResponse {
        public String userAddress;

        public BigInteger index;

        public byte[] userEmail;

        public BigInteger userAge;
    }

    public static class LogUpdateUserEventResponse {
        public String userAddress;

        public BigInteger index;

        public byte[] userEmail;

        public BigInteger userAge;
    }
}
