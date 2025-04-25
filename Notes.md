 - Output line is "system.out.print"
- if we want to print the line and then also have the endline with it i.e. we go to the next line then we use "system.out.println"


## Data Types
### Primitive:
 - byte
 - short 
 - char
 - boolean
 - int 
 - long
 - float
 - double

### Non-Primitive:
- string
- array
- class
- object
- interface


## How to take input
1. Import "java.util.*"
2. then make a scanner class' object with the syntax:
   Scanner sc = new Scanner(System.in);
3. and then we create a variable, for eg: "name" and use the syntax:
   String name = sc.next()
   - if we use ".next()", we can only take one input like from "tony stark", only tony will be taken as input
4. Now there are nextLine for full line, nextInt for int, nextFloat for float etc;