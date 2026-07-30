# PayNest — Merchant Order Desk & Catalogue Engine

A minimal Java commerce kernel for PayNest, a South African fintech helping small
merchants produce consistent pricing, order totals, and customer-linked receipts.

## Prerequisites

* Java 17
* Apache Maven 3.6+

## How to Run the Demo

Navigate to the project root (the folder containing `pom.xml`), then run:

```bash
mvn compile exec:java

Expected Output
==================================================
               PAYNEST INVOICE
==================================================
Order ID  : 5001
Customer  : Mia Mzimela
Email     : mia.mzimela@umuzi.org
--------------------------------------------------
Product                Qty    Subtotal
--------------------------------------------------
The Poet - Bobby Womack 1      R849.99
Hot Space - Queen      2      R1,999.80
Kind of Blue - Miles Davis 3  R1,948.50
--------------------------------------------------
TOTAL:                        R4,798.29
==================================================

How to Run the Tests
mvn test

All 23 tests should pass with BUILD SUCCESS:

Tests run: 23, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS

Project Structure
src/
├── main/java/com/paynestsystem/
│   ├── app/
│   │   └── PayNestApplication.java      ← Demo entry point
│   ├── domain/
│   │   ├── Product.java                 ← A product the merchant sells
│   │   ├── Customer.java                ← The person buying
│   │   ├── Order.java                   ← The customer's basket of items
│   │   └── OrderItem.java               ← One product + quantity line
│   └── service/
│       ├── OrderFormatter.java          ← Builds the receipt text (testable)
│       └── OrderService.java            ← Prints the formatted receipt
└── test/java/com/paynestsystem/
    ├── domain/
    │   ├── OrderTest.java               ← Tests for Order logic
    │   └── OrderItemTest.java           ← Tests for line-subtotal logic
    └── service/
        └── OrderFormatterTest.java      ← Tests for receipt formatting
