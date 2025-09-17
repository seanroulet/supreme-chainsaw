**Java Challenge: String to ASCII Converter**

**Objective**

Write a Java program that takes a line of text as input from the user and converts it into a continuous string of 3-digit ASCII values. This exercise will practice your skills with strings, loops, and conditional formatting.

**Background**

Every character on a computer is represented by a number. The most common standard for this is called ASCII (American Standard Code for Information Interchange). For example, the character 'A' is represented by the number 65, 'B' is 66, and 'a' is 97.

In this challenge, you will convert each character from an input string into its corresponding ASCII number and format it to always have three digits by adding leading zeros if necessary.

**Requirements**

Your program must do the following:
	1	Prompt the User: Ask the user to enter a string.
	2	Read the Input: Read the entire line of text the user enters.
	3	Loop Through the String: Iterate through every character of the input string.
	4	Convert to ASCII: For each character, find its integer ASCII value.
	5	Format the Output:
	◦	You must format each ASCII value as a 3-digit number.
	◦	If the ASCII value is less than 100, you must add leading zeros. For example, the ASCII value 65 should become 065. The value 8 should become 008.
	◦	You must use if/else if/else statements to handle this formatting logic.
	6	Print the Result: Print all the 3-digit numbers one after another, without any spaces or newlines in between, to form one continuous string of digits.

**Example Interaction**

Here is what a successful run of your program should look like.
Please enter a string to convert to ASCII:
> Hi!

Your ASCII string is:
072105033

**Breakdown of the Example**

	•	The character 'H' has an ASCII value of 72. Padded to 3 digits, it becomes 072.
	•	The character 'i' has an ASCII value of 105. It's already 3 digits, so no padding is needed.
	•	The character '!' has an ASCII value of 33. Padded to 3 digits, it becomes 033.
	•	The final output is 072 + 105 + 033 = 072105033.

Getting Started

The starter code is provided in the StringToAscii.java file. You will need to complete the logic inside the main method. Follow the // TODO: comments to guide you.
