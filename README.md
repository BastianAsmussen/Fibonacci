# Fibonacci Calculator 🧮
Fibonacci calculator in Java 17. The Big O notation is **O(n)** but it feels like **O(1)** when requesting fibonacci numbers smaller than 10,000.
Click <a href="https://github.com/BastianAsmussen/Fibonacci/blob/main/out/artifacts/Fibonacci_jar/Fibonacci.jar?raw=true">**here**</a> to download the jar.

<hr/>

## Warning ⚠️
> When calculating numbers greater than 9,800 there is a possibility you will get a stack overflow exception due to the program having to calculate a huge number. To counter this you can use the **-Xss4M** argument. This argument sets the JVM (Java Virtual Machine) Thread Stack Size to 4 MB, this should prevent the program from throwing a stack overflow exception. If this is still unsuccessful you can set the Thread Stack Size higher: **-Xss5M**  
**Example:** `java -jar -Xss4M location/of/fibonacciProgram.jar`
