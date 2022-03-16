# Fibonacci
> Fibonacci calculator in Java 17. The Big O notation is **O(1)** if requesting a single digit, otherwise the Big O notation is **O(n)**.

## Warning:
> When calculating numbers greater than 9800 there is a possibility you will get a stack overflow exception, to counter this you can use the **-Xss4M** argument. This argument sets the JVM (Java Virtual Machine) Thread Stack Size to 4 MB, this should prevent the program from throwing a stack overflow exception. If this is still unsuccessful you can set the Thread Stack Size higher: e.g. **-Xss5M**  
**Example:** `java -jar -Xss4M location/of/fibonacciProgram.jar`
