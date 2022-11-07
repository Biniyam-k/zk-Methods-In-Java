# MethodsInJava

Method in Java or Java Method is a collection of statements that perform some specific task and return the result to the caller. 
A Java method can perform some specific task without returning anything. Methods in Java allow us to reuse the code without retyping the code

# Types of Method
There are two types of methods in Java:

## Predefined Method 
In Java, predefined methods are the method that is already defined in the Java class libraries is known as predefined methods. 
It is also known as the standard library method or built-in method. We can directly use these methods just by calling them in the program at any point.
Some pre-defined methods are length(), equals(), compareTo(), sqrt(), etc. When we call any of the predefined methods in our program, 
a series of codes related to the corresponding method runs in the background that is already stored in the library.

Examples:

```
Math functions – sqrt(), log(), min(), max(), avg(), sin(), cos(), tan(), round(),floor(), abs() etc.

String function – length( ),  substring ( ), replace ( ), charAt ( ), indexOf  ( ) , trim ( ) etc.
```
## User-defined Method

These methods are created by the programmers for their requirement as per the programming scenario / necessity.

### Declaring  a method


```
return-type methodName(parameter-list)
{
 //body of method
}

```

return-type refers to the type of value returned by the method.

methodName is a valid meaningful name that represent name of a method.

parameter-list represents list of parameters accepted by this method.

Method may have an optional return statement that is used to return value to the caller function.



## The void Keyword

The void keyword allows us to create methods which do not return a value. Here, 
in the following example we're considering a void method methodRankPoints. 
This method is a void method, which does not return any value. Call to a void method must be a statement i.e. methodRankPoints(255.7);. 
It is a Java statement which ends with a semicolon as shown in the following example.

```
public class ExampleVoid {

   public static void main(String[] args) {
      methodRankPoints(255.7);
   }

   public static void methodRankPoints(double points) {
      if (points >= 202.5) {
         System.out.println("Rank:A1");
      }else if (points >= 122.4) {
         System.out.println("Rank:A2");
      }else {
         System.out.println("Rank:A3");
      }
   }
}

```

Parameter Vs. Argument in a Method
While talking about method, it is important to know the difference between two terms parameter and argument.

Parameter is variable defined by a method that receives value when the method is called. Parameter are always local to the method they dont have scope outside the method. While argument is a value that is passed to a method when it is called.

You can understand it by the below image that explain parameter and argument using a program example.


![alt text](https://static.studytonight.com/java/images/parameter-vs-argument.jpg)

### Naming a Method
Although a method name can be any legal identifier, code conventions restrict method names.
By convention, method names should be a verb in lowercase or a multi-word name that begins with a verb in lowercase, 
followed by adjectives, nouns, etc. In multi-word names, 
the first letter of each of the second and following words should be capitalized. Here are some examples:


