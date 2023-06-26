## 1. Java Methods
```Block of code that performing some action when runs only when it is called```

<hr/>

### - Java Mthods VS Java Function

```py
Function ---> eat();
Method   ---> Person.eat();
Note: Person is class here
```
<hr/>

### - Why Methods?

- Because write once and use many times.
- Time saves.
- Duplicate code reduces.
- Code more readable and maintainable.
<hr/>

### Types of Methods:
- User-defined Methods
- Standard Library Methods

#### User-defined Methods
- define by the user that are not built in

#### Standard Library Methods
- It's a built in methods
```
Example:- pow(), sqrt(), floor() etc. persent in Math lib.
```
<hr/>

###  How to declare Methods?
```java
Syntax:-

<Access Modifier> <class keyword> <class Name>{
    <Access Modifer> <return type> <Method Name>(some parameters){
        // code to be executed
    }
}
1. Method Signature ---> <Method Name> + <Parameter list>
2. Access Specifier ---> public, private, protected, default 
3. Return type      ---> data type
4. Method Name      ---> Name of the Method
5. Parameter        ---> passing data type in the Method
6. Method Body      ---> Block {} of Method

Example;-

public class Main{
    public int sum(int a , int b){
        // code to be executed
    }
}

1. Method Signature ---> sum(int a, int b)
2. Access Specifier ---> public 
3. Return type      ---> int
4. Method Name      ---> sum
5. Parameter        ---> (int a, int b)
6. Method Body      ---> Block {} of Method
```
<hr/>


## 2. Standard library Methods
- print()
- sqrt()
- floor()
- ceil()

```java
# Package ---> collection of similar classes, subPackages, iterfaces.

# Constructor ---> Special method used to initilize objects.
    - constructor Name = class Name
    - contructor no return type
    - parameter can be passed
    