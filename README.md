# SPRINT1.02 Java Exceptions 
The main objective is to practice the full exception handling flow. We practice declaring and throwing (throws/throw) a custom exception,
and then ensuring its capture and management using the try-catch block.

### TASK 1 LEVEL 1

- 1 - Create a "Product" class with the attributes name and price.
- 2 - Create a "Sale" class with a collection of products and a variable "totalPrcie" to store the total.
- 3 - Inside the "Sale" class, create a calculateTotal() method that checks if the collection is empty and if it is, throws an exception called "EmptySaleException" and if there are products,       adds the  prices and stores the total in the totalPrice attribute.

- 4 - The EmptySaleException class must be a child of Exception and must include the message in its constructor.
- 5 - Add a test to generate an IndexOutOfBoundsException exception and catch it by displaying the error message.
- 6 - Change the EmptySaleException class to extend a runtime exception, such as RuntimeException.


# TASK 1 LEVEL 2
## 📌 Exercise Statement
In this case we practice catching exceptions when data is entered from the keyboard, both with InputMismatchException and with custom exceptions

1 - Create a class called "ConsoleReader" that allows reading different types of data entered from the keyboard. This class must handle errors that may
occur if the user enters values ​​of the wrong type.

2 - Create a single "Scanner" object and define a series of static methods to read the data. These methods should display a custom message, read the value, 
and validate it. If the value is incorrect, an error message should be displayed.

3 - All methods will receive a String parameter containing the message to be displayed.

4 - All methods return an error and only return the data if it is valid.

5 - The error message must be displayed every time an error occurs.


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
    git clone https://github.com/Dani87dev/S1T2-Exceptions.git
    ```





