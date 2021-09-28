/*
type      set of values             common operators    sample literal values
------------------------------------------------------------------------------
int       integers                  + - * / %           99 12 2147
double    floating-point numbers    + - * /             3.14 2.5 6.022e23
boolean   boolean values            && || ! ^           true false
char      characters                                    'A' '1' '%' '\n'
String    sequences of characters   +                   "AB" "Hello" "2.5"


int a, b, c;
// Declaration, declares the names of variables a, b, c and their type to be int
a = 1234;
b = 99;
c = a + b;
// Assignments, changes the value of the variables using literals and an expression

String a, b, c;
a = "Hello,";
b = " Bob";
c = a + b;
// c's assingment is a concatenation to combine a and b
// You can concatenate ints and Strings

&& is an and operator
|| is an or operator
! is a not operator
^ is an exor operator


Comparisons are mixed-type operations that take operands of a type and produce a boolean


op    meaning
------------------
==    equal
!=    not equal
<     less than
<=    less than or equal
>     greater than
>=    greater than or equal

An application programming interface (API) is a table summarizing the methods (invokable blocks of statemetns) in a library
You can call a method by typing its name followed by arguments

Type conversion (converting between types of data)
-Explicit type conversion. You force the conversion using a method. (Integer.parsInt(), etc)
-Automatic type conversion. For primitive numeric types, the system automatically does conversion when we use a value whose type ahs a a larger range of vaues than expected
-Explicit casts. Java has certian built in conversions, however you must make your intention using a cast. ( (int) (3.1*4.5)=13)

String conversion is very easy, as to convert any type of data to a String you suimply use the P operator.
*/
