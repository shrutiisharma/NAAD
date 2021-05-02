**<mark>TASK 3_1</mark>**

## Defining Class

- Define a class Product with the following data members :

- name (String)

- price (int)

Info : Classes which are defined just for the sake of saving data are called Model Classes or POJO (Plain Old Java Object). Here class Product is an example. From now on, define every such model class in separate files. DO NOT define these classes within a class with the main() method!

## Defining Constructors

- Define an empty/default constructor for it

- Define a parameterized constructor passing name & price to it (Use Generator (Alt + Insert) & ‘this’ keyword)

## Overriding toString() method

- Override toString() and using String.format() return string in format "Name : %s @ Rs. %d" 

Tip : Google for String.format() method if you have confusion

## Overriding equals() method

- Learn about the equals() method of Object class. Observe its default behaviour.

- In Java, Strings are compared using .equals() method and not using ‘==’. We can also compare objects using .equals(). Observe the following example : 

![](https://lh4.googleusercontent.com/VnYSpNuOd0WNCkEaQt8ZYgUAqrun_xpvUsDfSzgsp-gWiJ5he-jx2f-JE4dHZvFk8sC9SCkeKmfSw_ElaPIrPjSqF389d5UAgMIUYoZ6Z3_cUDJj_aK7kN8cI-B_ccRx1Ke0wGWA)

Override the .equals() method of Product class for this required behaviour.

Tip : Google about .equals() to learn more

## Inheritance

- Define another class SpecialProduct extending Product class with following data members :

- regularPrice (int)

- percentageOff (int)

- Define a parameterized Constructor for class SpecialProduct passing name & price. Invoke super(name, price) in it.

- Override toString() for class SpecialProduct and return the required formatted string.

## Static Method

- Define a static method -

SpecialProduct applyOffOnProduct(Product product, int percentageOff)

in class SpecialProduct as follows :

- Calculate discountedPrice of product by applying percentageOff to product.price

- Create a new object of class SpecialProduct specialProduct, call its constructor and pass (product.name, discountedPrice) to it

- Set specialProduct.regularPrice = product.price

- Set specialProduct.percentageOff = percentageOff

- Return the object

## Driver Code

- In the Main class,

- Create 3 products of your choice but give same name & price to 2 of the products

- Print the products

- Print equality of the 2 similar products using .equals()

- Create a new object of class SpecialProduct by calling the static method applyOffOnProduct and pass any product along with some offPercentage of your choice

- Print this specialProduct object

## Submission

- Use our previous NAAD IntelliJ project.

- Create a new package inside src folder named “task3_1” and place all of the files for this task in it

- Push the code to GitHub & Submit using GCR
