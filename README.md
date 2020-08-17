# Project Description

This project is an application to assist the user in haggling. It helps buyers buy low and sellers sell high. It is useful for yard sales, real estate, insurance, business, and even government.
This release is optimized for an insurance claims negotiation.

My primary design goal was to create a way for a user to perform an undo action. I have achieved that goal through the memento pattern. Another goal is flexibility. Memento pattern also supports that goal as the memento and care taker classes could be used with a GUI or other client code. In this release the client code is the main class which contains the console user interface logic.

I have avoided duplicated through inheritance and polymorphism. Most of the code for the buyer and seller objects is in the abstract superclass Role. Buyer and Seller classes inherit from that and implement their own unique move() algorithms.

The focus of this project is the memento pattern. The core negotiating algorithm works but
is a work in progress. For best results a suggested start for buyer and seller is one in which the buyer's staring offer is about 10 % of the seller's initial asking price. That spread is typcial of an insurance claim settlement negotaiation or a congressional budget negotationating. The recent covid stimmulus negotation was 950b to 150b. 

# UML

![Class Diagram](mementoUML.png)


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project. 

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies. 

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Main
```


# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see 

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see 
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin 

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

You can find more info about coveralls 

https://coveralls.io/

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```


