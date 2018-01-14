# Spring-Eth

Sample project to illustrate connecting Java to Ethereum

## Installation

First install [Ganache](https://github.com/trufflesuite/ganache-cli)

       npm install -g ganache-cli
       
Run ganache. The account information should display and the connection details should be displayed.

Default connection is [http://localhost:8545](http://localhost:8545)

Now add [web3j](https://github.com/web3j/web3j-spring-boot-starter) as a dependecy

    <dependency>
        <groupId>org.web3j</groupId>
        <artifactId>web3j-spring-boot-starter</artifactId>
        <version>1.5.0</version>
    </dependency>
    
Running the application and navigating to [clientversion](http://localhost:8080/clientversion) should now display client version details