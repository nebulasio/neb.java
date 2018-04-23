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

#### Building from an IDE

Alternatively, just import the project using your IDE. [IntelliJ](http://www.jetbrains.com/idea/download/) has Gradle integration built-in and has a free Community Edition.

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
