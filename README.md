# nebulasj

The nebulasj library is a Java implementation of the Nebulas protocol, which allows it to maintain a wallet and send/receive transactions without needing a local copy of go-nebulas.

## Add as dependency

Gradle

```
repositories {
    mavenCentral()
}

dependencies {
    compile "io.nebulas:nebulas:0.1"
}
```

Maven

```
<dependency>
    <groupId>io.nebulas</groupId>
    <artifactId>nebulas</artifactId>
    <version>0.1</version>
</dependency>
```

## Building from source

### Prerequisites

| Components | Version | Description |
|----------|:-------------:|-------------:|
|[Java](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html) | >= 1.8.0_171| Java8 |
[Gradle](https://gradle.org/) | >= 4.6 | Gradle is a dependency management tool for Java. |


### Build

it is best to have the latest JDK and Gradle installed. The HEAD of the `master` branch contains the latest development code and various production releases are provided on feature branches.

```
./gradlew clean build
```

#### Building from an IDE

Alternatively, just import the project using your IDE. [IntelliJ](http://www.jetbrains.com/idea/download/) has Gradle integration built-in and has a free Community Edition.

## nebulasio-client

http client for nebulasio  https://github.com/nebulasio 

api : 

https://github.com/nebulasio/wiki/blob/master/rpc.md

https://github.com/nebulasio/wiki/blob/master/rpc_admin.md

### example : 

```
    private NebulasClient nebulasClient = NebulasClient.create("https://testnet.nebulas.io");

    @Test
    public void testGetNebState() {
        Response<NebState> response = nebulasClient.getNebState();
        System.out.println(response);
    }

    @Test
    public void testGetAccountState() {
        Response<AccountState> response = nebulasClient.getAccountState(new GetAccountStateRequest("n1Z6SbjLuAEXfhX1UJvXT6BB5osWYxVg3F3"));
        System.out.println(response);
    }

    @Test
    public void testLatestIrreversibleBlock() {
        Response<Block> response = nebulasClient.latestIrreversibleBlock();
        System.out.println(response);
    }

    @Test
    public void testCall() {
        Response<CallResult> response =
                nebulasClient.call(new CallRequest("n1Z6SbjLuAEXfhX1UJvXT6BB5osWYxVg3F3", "n1mL2WCZyRi1oELEugfCZoNAW3dt8QpHtJw", "0", 3l, "1000000", "2000000", new Contract().setFunction("transferValue").setArgs("[500]")));
        System.out.println(response);
    }

    @Test
    public void testSendRawTransaction() {
        Response<RawTransaction> response = nebulasClient.sendRawTransaction(new SendRawTransactionRequest().setData("CiCrHtxyyIJks2/RErvBBA862D6iwAaGQ9OK1NisSGAuTBIYGiY1R9Fnx0z0uPkWbPokTeBIHFFKRaosGhgzPLPtjEF5cYRTgu3jz2egqWJwwF/i9wAiEAAAAAAAAAAADeC2s6dkAAAoAjDd/5jSBToICgZiaW5hcnlAZEoQAAAAAAAAAAAAAAAAAA9CQFIQAAAAAAAAAAAAAAAAAABOIFgBYkGLnnvGZEDSlocc202ZRWtUlbl2RHfGNdBY5eajFiHKThfgXIwGixh17LpnZGnYHlmfiGe2zqnFHdj7G8b2XIP2AQ=="));
        System.out.println(response);
    }

    @Test
    public void testGetBlockByHash() {
        Response<Block> response = nebulasClient.getBlockByHash(new GetBlockByHashRequest("00000658397a90df6459b8e7e63ad3f4ce8f0a40b8803ff2f29c611b2e0190b8", true));
        System.out.println(response);
    }

    @Test
    public void testGetBlockByHeight() {
        Response<Block> response = nebulasClient.getBlockByHeight(new GetBlockByHeightRequest(1l, true));
        System.out.println(response);
    }

    @Test
    public void testGetTransactionReceipt() {
        Response<TransactionReceipt> response = nebulasClient.getTransactionReceipt(new GetTransactionReceiptRequest("cda54445ffccf4ea17f043e86e54be11b002053f9edbe30ae1fbc0437c2b6a73"));
        System.out.println(response);
    }

    @Test
    public void testGetGasPrice(){
        Response<GasPrice> response = nebulasClient.getGasPrice();
        System.out.println(response);

    }
    @Test
    public void testEstimateGas(){
        Response<EstimateGas> response = nebulasClient.estimateGas(new EstimateGasRequest().setFrom("n1QZMXSZtW7BUerroSms4axNfyBGyFGkrh5").setTo("n1SAeQRVn33bamxN4ehWUT7JGdxipwn8b17").setValue("1000000000000000000").setNonce(1l).setGasPrice("1000000").setGasLimit("2000000"));
        System.out.println(response);
    }

    @Test
    public void testGetEventsByHash(){
        Response<GetEventsByHashResult> response = nebulasClient.getEventsByHash(new GetEventByHashRequest().setHash("ec239d532249f84f158ef8ec9262e1d3d439709ebf4dd5f7c1036b26c6fe8073"));
        System.out.println(response);
    }

    @Test
    public void testGetDynasty(){
        Response<GetMinerResult> response = nebulasClient.getDynasty(new GetMinerRequest(1l));
        System.out.println(response);
    }
```



### Release

Please contact [Bill]<mailto:bill@nebulas.io> to get `secret-keys.gpg` and `settings.gradle` before release

Upload

```
./gradlew uploadArchives
```

Release

```
./gradlew closeAndReleaseRepository
```

#### Example applications

These are found in the examples module.

## Wiki

Please check our [Wiki](https://github.com/nebulasio/wiki) to learn more about Nebulas.

## Contribution

We are very glad that you are considering to help Nebulas Team or go-nebulas project, including but not limited to source code, documents or others.

If you'd like to contribute, please fork, fix, commit and send a pull request for the maintainers to review and merge into the main code base. If you wish to submit more complex changes though, please check up with the core devs first on our [slack channel](http://nebulasio.herokuapp.com) to ensure those changes are in line with the general philosophy of the project and/or get some early feedback which can make both your efforts much lighter as well as our review and merge procedures quick and simple.

Please refer to our [contribution guideline](https://github.com/nebulasio/wiki/blob/master/contribute.md) for more information.

Thanks.

## License

The go-nebulas project is licensed under the [GNU Lesser General Public License Version 3.0 (“LGPL v3”)](https://www.gnu.org/licenses/lgpl-3.0.en.html).

For the more information about licensing, please refer to [Licensing](https://github.com/nebulasio/wiki/blob/master/licensing.md) page.
