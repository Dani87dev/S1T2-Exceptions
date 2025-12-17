# SPRINT1.02 Java Exceptions 
The main objective is to practice the full exception handling flow. We practice declaring and throwing (throws/throw) a custom exception,
and then ensuring its capture and management using the try-catch block.
---

## 📌 Exercise Statement

1 - Create a "Product" class with the attributes name and price

2 - Create a "Sale" class with a collection of products and a variable "totalPrcie" to store the total.

3 - Inside the "Sale" class, create a calculateTotal() method that checks if the collection is empty and if it is, throws an exception called "EmptySaleException" and if there are products,       adds the prices and stores the total in the totalPrice attribute.

4 - The EmptySaleException class must be a child of Exception and must include the message in its constructor.

5 - Add a test to generate an IndexOutOfBoundsException exception and catch it by displaying the error message.

6 - Change the EmptySaleException class to extend a runtime exception, such as RuntimeException.

## 🛠 Technologies

  - Java: 21 (LTS)
  - IDE IntelliJ IDEA
  - Version Control: Git
  - Repository Hosting: GitHub

## 🚀 Installation and Execution

### Prerequisites
* Java Development Kit (JDK) 8+ is required.

1.  **Clone the repository:**
    ```bash
    git clone [your_repository_url]
    ```
