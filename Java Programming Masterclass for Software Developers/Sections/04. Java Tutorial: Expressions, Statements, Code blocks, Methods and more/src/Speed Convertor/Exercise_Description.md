# Exercise Description

- Write a method called _toMilesPerHour_
  - 1 parameter
  - param1
    - type _double_
    - name _kilometersPerHour_
    - If less than 0
      - return `-1` -- indicates invalid value
    - If positive
      - calculate the value of miles per hour
      - round it
      - return it
  - return
    - rounded value of the calculation
    - type long.
- Examples of input/output

```java
toMilesPerHour(1.5); // should return value 1
toMilesPerHour(10.25); // should return value 6
toMilesPerHour(-5.6); // should return value -1
toMilesPerHour(25.42); // should return value 16
toMilesPerHour(75.114); // should return value 47
```

- Write a method called _printConversion_
  - 1 parameter
  - param1
    - type _double_
    - name _kilometersPerHour_
      - If the parameter _kilometersPerHour_ is less than 0 then print the text _"Invalid Value"_
  - should not return anything (void)
  - calculates _milesPerHour_ from the _kilometersPerHour_ parameter
  - prints a message in the format `"XX km/h = YY mi/h"`
    - XX -- the original value _kilometersPerHour_
    - YY -- the rounded _milesPerHour_ from the _kilometersPerHour_ parameter
- Examples of input/output:

```java
printConversion(1.5); // → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
printConversion(10.25); // → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
printConversion(-5.6 //); → should print the following text (into the console - System.out): Invalid Value
printConversion(25.42); // → should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
printConversion(75.114); // → should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h
```

## Tips

- Use method `Math.round` to round the number of calculated miles per hour(double)
  - The method round returns long
- All methods should be defined as public static like we have been doing so far in the course.
- 1 mile per hour is 1.609 kilometers per hour
- Do not add a main method to the solution code.
