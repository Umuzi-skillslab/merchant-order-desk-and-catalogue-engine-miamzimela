# Merchant-order-desk-and-catalogue-engine

## PayNest System Demo
This application simulates creating a customer order and printing a receipt using the core commerce modules.

### Prerequisites
* Java 17
* Maven installed locally (or via IDE integration)
* Clean internet/network connection for initial plugin sync

### How to Run in terminal 

**Navigate to the project root:**
   ```bash
   cd merchant-order-desk-and-catalogue-engine-miamzimela

#How to run  with Maven 
mvn compile exec:java

#How to run alternatively to avoid firewalls/ local networks/ security blocks
Powershell
javac -d bin --source-path src/main/java src/main/java/com/paynestsystem/app/PayNestApplication.java
java -cp bin com.paynestsystem.app.PayNestApplication
