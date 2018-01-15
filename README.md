# Spring-Eth

Sample project to illustrate connecting Java to Ethereum

## Installation

First install [Ganache](https://github.com/trufflesuite/ganache-cli)

    npm install -g ganache-cli
       
Run ganache-cli. The account information should display and the connection details should be displayed.

Or install Ganache

    http://truffleframework.com/ganache/

Default connection is [http://localhost:8545](http://localhost:8545)

Now add [web3j](https://github.com/web3j/web3j-spring-boot-starter) as a dependency

    <dependency>
        <groupId>org.web3j</groupId>
        <artifactId>web3j-spring-boot-starter</artifactId>
        <version>1.5.0</version>
    </dependency>
    
Running the application and navigating to [clientversion](http://localhost:8080/clientversion) should now display client version details

## Solidity

Go to [remix](https://remix.ethereum.org/). Paste the [following](https://gist.github.com/pram/1ac3254417a7662734d8b4683c1782e3) into the editor.

Follow the [guide](https://medium.com/crypto-currently/build-your-first-smart-contract-fc36a8ff50ca) for more details on how to deploy a smart contract.

Navigate to 

    src/main/solidity

and run the following command

    solcjs counter.sol --bin --abi --optimize -o target/
    
You should now have two files in the target directory - `counter_sol_Counter.abi` and `counter_sol_Counter.bin`