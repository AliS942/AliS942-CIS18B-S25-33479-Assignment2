# AliS942-CIS18B-S25-33479-Assignment2
This Java program simulates a simple library system using object-oriented programming (OOP) principles. It defines a base class Item for general library items, with subclasses Book and Magazine that add specific attributes. The Book class implements the IBorrowable interface to manage borrowing functionality, with methods for borrowing, returning, and checking if an item is borrowed. The program uses the Singleton pattern in the Library class to manage a collection of items and ensure only one instance exists. A Factory pattern is implemented in the LibraryItemFactory class to create Book or Magazine objects based on input. The LibraryTest class demonstrates borrowing, returning, and listing available items, showcasing the library’s management and search functionality.
How To Install:

Clone the repostiory:
git clone https://github.com/AliS942/CIS18B-S25-33479-Assignment2

Compile and Run the Library System Project
Navigate to the project folder using the cd command.
Compile the Java files:
cmd: javac *.java

Run the LibraryTest class
java LibraryTest

Interact with the Library System
Basic Functionality
Once the system is running, you will be able to interact with it via the console.
The system will allow you to:
Add books or magazines to the library.
Borrow and return items.
View available and borrowed items.
Search for items by title.
