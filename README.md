# IC_JL_2.2.4

Work through PLTW 2.2.4 with a partner.   Upload your completed and commented code to Github, and provide your URL in the form provided. 

Comment your code with line numbers from each step in the assignment.  Ex:  // Lines 5-10 implement step 7. Answer the selected questions from the assignment below, and include it in a README.txt file on Github.  Include the following in the README.txt file as well as in this document.  Note that both the README.txt file and this file should be identical, except for instructions at the top of this document.

You will need a copy of Animal_App_Starter_Code.zip, and if you did not complete PLTW 2.2.3, the solution to that code as well.  When you import the Animal App, unzip it, go to the sub folder with the build.gradle file, and import that.  Keep the other project open as well.

===== README.txt ========
Assignment: PLTW 2.2.4
Date: (date submitted)
Team Members: Isaiah Cruz, Justin Lee, ... (include first name and last name for each member)
Description: This activity was lesson in polymorphism. We were able to create interfaces and abstract methods that implemented basic knowledge of inheritance in different classes of animals.
Team member roles in assignment: (Who did what)
Justin was able to work on a lot of the code as the driver and did a few of the conclusion questions. His coding was done in Android Studio and uploaded the items to GitHub. Isaiah also worked on the code in Android Studio and finished most of the conclusion questions.
Key Lessons learned:
The this.output.append() adds different text to your appended item in ArrayLists. Polymorphic ArrayLists are able to reuse code from different classes more easily, but also reduce readability of code and are more code-intensive in creation than a regular list.
Part I: The Animals Speak
Add the following two lines after your instantiation.
1   this.output.append("\nDuck say ");
2   this.output.append("\nFish goes ");
What does the escape sequence “\n” do?
The escape sequence \n will cause a new line to be printed before the string. The next two lines will print:
Duck say
Fish goes

Making sure that all of your output happens at the end of the onCreate method, replace fish.say() in your code with animals.get(1).say().
Is your output still the same? Why or why not? If it is not, fix it so that it is.
The output is still the same, because the .say() method is called as fish is index 1 of the ArrayList.

Replace animals.add(fish); with animals.add(duck);.
How is your output affected? Do you know why?
Our output is changed to “Fish goes quack” because the .say() method is being called on the duck object while the string, “Fish goes”, has not been changed to the appropriate string for the duck.

Add the following statement to find out what's going on:
1  this.output.append("\nThe object at index 1: " + animals.get(1));
What type of object is stored at index 1?
At index 1, an object from the Fish class has been stored.
 Add a for each loop that accomplishes the same output as in the previous step. (If you made a for each loop in the previous step, add a regular for loop.) Verify that the outputs of the two loops are the same. Which do you like better and why? 
 The for each loop is more preferable because we can iterate through the ArrayList and make changes to the code more easily, as we do not have to worry about “index out of bounds” errors.
 Add one method to this interface called play that returns a String.
You do not need to include an access modifier when creating a method signature in an interface. Why?
We do not need to include an access modifier when creating a method signature in an interface because interface methods are always public.
Add the following statement to AnimalActivity within your for each loop:
1  this.output.append("\n" + a.play());
Is this a problem? If so, remove it and explain why.
This is a problem. We cannot call .play() on all of the elements of the ArrayList because only the Seal subclass implements .play(), and the following code will cause an error.
 Add the following code within one of your for loops to get your Seal to play.
1              if (a instanceof Seal) {
2                  this.output.append("\n" + ((Seal)a).play());
3              }
What do you think the code above is doing?
 The above code will call the .play() method on any instances of the Seal subclass if it finds any.
 Does your Fox class have any errors? It should! Why should it have an error? 
 Fox class has errors because it is part of the Animal abstract class, so it needs to use the .say() method in its code. Right now, the Fox class is lacking in a .say() method.
Modify your for loop to produce the output below using as few characters in your String literals as possible.
 
Why would it be easier to modify the for each loop to do this?

You don’t need to use an extra integer variable to iterate through the ArrayList, because the forEach loop will just run through the arrayList automatically.

Part II: CollegeApp Uses Polymorphism to Display FamilyMembers
Add the following log statement to the getView method of FamilyMemberAdapter after the assignment to f shown.
1  FamilyMember f = getItem(position);
2  Log.d(TAG, "The type of FamilyMember at position " + position + " is " + f.getClass().getName());
What type of object is f in each of the log messages when you run the program, and what does this mean?
The object f in each of the log messages is an instance of the FamilyMember class.
Conclusion
Explain in your own words what you think polymorphic behavior is.
Polymorphism is the ability of any object to be used in a different form, as the root “poly” means many and “morphic” may mean change. So in Java, you may be able to process various kinds of data through one interface.
What is the biggest advantage for creating a polymorphic list, and what is the biggest disadvantage?
Creating a polymorphic list allows you to reuse code from different objects as long as the polymorphic objects are accessible by different classes. However, coding for a polymorphic list may make code harder to read, and it is much more code-intensive to create a polymorphic list than a regular kind of list.
Compare and contrast: abstract classes vs. interfaces.
Unlike interfaces, abstract classes are actual classes that may contain access modifiers.. Interfaces are more of a kind of contract, which contains different methods, and may not contain access modifiers. An interface is just a pattern that others may follow in the code, while an abstract class has a defined behavior that you may access through inheritance. The interfaces are only empty shells that hold method signatures, and do not actually do anything.

