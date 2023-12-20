<h1>Interview Questions Fidelity</h1>

<h3>Q1)Write a function to return the total number of valid pairs of curly-braces
A valid pair of braces is an opening brace and a corresponding closing
brace (with or without chararacters in-between).

For e.g. the below has 2 valid pairs of braces

{

int i=0;

{

system.out.printin("hi");

The below has only 1 valid pair

I/this is a closing brace/

int i=0;

system.out.println("hi):

f/this is an opening brace/
</h3>
<h3>Q2Create a function which prints the frequency of every string in the
given list of string. Empty lines should be skipped.
Print the frequency in a sorted manner.

For e.g., for the array

dogs

cats

horses

bee

cats

dogs

cat

ant

bee

The output should be

ant 1

bee 2

cat 1

cats 2

dogs 2

horses 1</h3>
<h3>Q3)Provide a function with checks the password validity based on
validation criteria. 

Return Error Code 0, if passowrd is valid. 

Return specific error code if validation fails.

Validation criteria and Error code. 

Check for validity in the order below
and return error code on first intance of fallure.
1. Min length - 8, Max length - 31 [Error code 10]
   A
2. Password should be alpha numeric (alpabetics and atleast one
   numeral 0-9) Error code 20]
3. Atleast one special char from a set #$ @% &.
   [Error code 30]
4. No simultaneous repetition of any char (e.g. Password@12 is not
   valid, but Pasword@12 is valid) [Error code 40]
   If the order of the validation is mixed up, then the testcases will fail</h3>
