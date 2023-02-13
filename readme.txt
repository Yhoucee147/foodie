
Foodie Task for Moversly
In my approach to the solution i assumed that Gordon could only have two meals at the dinner.
I created two methods in my implementation. 
The readFile() method reads the foodie.txt file located in the applications root folder, it reads the first line for max time allowed for the meals and stores it in a static variable accessible anywhere. It also checks for second line for numbers of entries. It then loads the satisfaction amount and the time to a custom FoodDetails class which is added toa custome arrayList.
The calculateMaximumSatisfactionValue(List<FoodDetails> details) method has two loops, the first loops through all entries, the inner loop does the matching of the sume of the two active data to check if the time is below the max time and above the present minimum time, if yes it calculates athe total satisfaction of the pairing and if this value is greater than the present temporary pair, it stores that as the max value.
The AppRunner class which implements the CommandLineRunner interface runs the application and prints the calculated max value to the console. 