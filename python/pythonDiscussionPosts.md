## PYTHON DISCUSSION POSTS: FALL 2025, PBSC


## How can learning about variables & user input in Python prepare you for more complex programming tasks and projects in the future?

Without having a solid foundation built upon these sorts of fundamental lessons in Python programming, like we just went over with user input(), it becomes difficult to extrapolate on topics that are more logic-oriented, such as creating for loops & while loops which allow us to iterate through what we create & 'multitask' at the micro-level. As someone who has already been presented with more complex lessons due to previous exposure to Python programming, I'm grateful to be revisiting these things, not because it's easy versus hard, but because now I have the chance to fully digest some of the things I brushed over before. My advice to any of my classmates, even if you might be more experienced than I, take the time to fully explore these 'code-along' videos. Take advantage of being able to pause or go back to something that you don't fully understand.

If you still find that some of these things are less challenging than anticipated, please read this last part: If I have the time, I'll record 'walk-through' videos using a screen recorder that cover the lessons I've learned, whether it be a fully finished project or a single issue. This is not because I have a large following on a social media account or something like that, it's because in real-life scenarios, like at a job, you'll be expected not just to 'understand' & nod yes or no, you'll be expected to discuss how you came to a conclusions or why one particular object is impacting another. If you haven't done this before, try it! You have nothing to lose because the only person who needs to watch them is you (for now at least).

References.

Felienne Hermans, (2021). YouTube | GOTO Conferences: https://www.youtube.com/watch?si=XWxHvXbB64rzSrB8&v=58LeSsn_nSQ&feature=youtu.be

-----
-----

## Discuss the advantages & disadvantages of using for loops versus while loops in different programming contexts. When would you choose one over the other?

For loops & while loops are both programming constructs used by almost every modern programming language. However, in Python, they vary significantly, even though they accomplish a similar task: iteration. For loops are mainly used when you already know how many iterations there will be inside the loop, whereas in while loops, all variables in the condition must be defined beforehand. One more important distinction is that a for loop is generally 'safer' to use because it automatically ends once the conditions are met. With while loops, you must always manually ensure the stopping condition is eventually met, or the program will run forever, causing an infinite loop, which is to be avoided at all costs [1]. Below are some examples similar to the ones shown in the discussion video we just watched for this module. 

<!--
For Loop Example ⬇️

for a in range(10):
  print(a)

While Loop Example ⬇️

a = 0
while i < 9:
 print(i)
 i += 1 -->

Considering their lack of initialization, for loops are best used when you want to go through every item in a list or count to an integer a specific number of times. On the other hand, while loops are better for repeating an action until a certain, unpredictable thing happens (like asking the user for input about something). It really all depends on the type of goal(s) you're trying to accomplish, but while loops are a little more practical overall, in my personal opinion. but what's more preferable is using them together in a dynamic program, as opposed to creating something primitive that is with or without the other. 

References.

[1] Molyneaux, B. (2024). Comparing Python's For & While Loops. Python Snacks: https://www.pythonsnacks.com/p/python-for-loop-while-loopLinks

-----
-----

## How do you ensure that your functions are well-documented & easy for others to understand & use? What practices do you follow?

As I've grown as a programmer, the need for constant technical documentation has become a mandatory component for any program I create. Though it's ultimately up to each individual to read/use documentation, if it is, it can provide users with evergreen context, not just for others, but also for yourself, so you can go back & remember why you did exactly what you did. Using clear naming conventions also helps everyone understand what is happening in the code being interpreted. If I don't already have a READ.MD file or another markdown file associated with a big project I'm working on to journal my progress, I will at least leave comments underneath certain lines or functions to document why I wrote what I did or how I came to the conclusion I came to.

Another way to accomplish writing comments in Python specifically is by using docstrings. Creating docstrings directly beneath function declarations works just like comments in any programming language, but the syntax is a little different. Simply use three double quotes like so, """, followed by whatever description of the function you've created in natural language. Lastly, close out the docstring by using another set of three double quotes, just like before, """. A proper docstring explicitly lists the Parameters (Arguments), the Return value, any Exceptions (Raises) & often includes real-life examples. Below is a visual example of a basic docstring.

<!-- def main(demo):
    """
    This function demonstrates the use of docstrings.
        The only parameter is the demo object, which is then returned & displayed.

         """
    return demo
demo = "Eureka!"
print(demo) -->

The final way to document what you've learned regarding functions is to make a video demonstrating just that, just like the "bro" from the video does. It might seem silly at first, but eventually you will be asked to demonstrate the code you've written on the spot, both in a job interview or from your boss at work, so getting that potential anxiety out of the way early on is worth it if you truly want a career in programming. 


References.

[1] GitHub, (2025). Tools & Techniques for Effective Code Documentation via https://www.github.com: github.com/resources/articles/tools-for-effective-code-documentation

[2] Programiz, (n.d.). Python Docstrings (With Examples) via programiz.com: https://www.programiz.com/python-programming/docstrings

-----
-----

## 3. Share your thoughts on how understanding these fundamental data structures in Python prepares you for more advanced programming concepts & projects.

Understanding Python's core data structures such as lists, sets, tuples & dictionaries, is essential because without the ability to store & alter data in different ways, we would be denying ourselves the ability to utilize Python for what it truly is: a dynamic, object-oriented programming language. For example, a core principle to understand is mutability: whether the data we're working with needs to be fixed for stability, or flexible for constant changes. Mutable objects allow its contents to be updated or changed while immutable objects do not allow the data stored inside them to be altered. In short: lists & dictionaries are mutable, while tuples are immutable.

A Python set is a mutable data structure that inherently stores only unique elements, which is why it's often used for filtering data. Ultimately, it's not really about choosing one or even some of these principles over the other, but rather knowing when & how to use them appropriately at the right time when it's called for. These structures form the necessary building blocks for implementing more complex algorithms & data structures like linked lists, trees & graphs. Discerning the distinct strengths & weaknesses of each structure is the first step toward writing code that runs quickly & is easy for others to understand.

References.
[1] Bader, D. (n.d.). Common Python Data Structures | Real Python via realpython.com: https://realpython.com/python-data-structures/

-----
-----

## 2. Why is "code reusability" significant in object-oriented programming? How do classes & inheritance contribute to reusable code?

This feature is so crucial to Python's useful nature because most importantly it allows users to create code that is modular, which means that we are able to use classes which inherit attributes from other classes. I appreciate how the person in the video had us start off by creating two different files to work: one for the program & one for the class we were using. This reminded me of making similar car projects in a coding course I took the other year. Every single feature had it's own class, or module, which enabled myself & the people I was working with to reuse this code in different ways, like accepting input from any sort of user that read our brief instructional manual. 

Ultimately, code reusability significantly reduces the time it takes to develop programs. We also simultaneously reduce the chance of making an error because reading & editing the code we have is much easier. Imagine writing a novel without indentation or spaces in between paragraphs or the organization of chapters. Similarly, creating code that is modular has the same sort of effects like in natural language as described above. The classes that we create enable us to encapsulate the data & methods we're working with. This has added a lot of joy to my coding journey!

References.
[1] W3Schools. (2019). Python Inheritance via w3schools.com: https://www.w3schools.com/python/python_inheritance.asp

[2] Python Software Foundation. (n.d.). Classes, Objects & Scope via docs.python.org: https://docs.python.org/3/tutorial/classes.html

-----
-----

## 2. Explain the concept of try-except blocks in Python. How do they help in managing & responding to errors?

Try-except blocks are the easiest way we can prepare for runtime failures. If runtime errors are encountered, the program will then execute a different set of instructions to handle those exceptions that our code encounters. This is one of the fundamental built-in tools for the Python programming language & helps manage the errors we encounter in a controlled & consistent manner.

A try-except block always begins with a try statement first, then the except block follows afterwards. It works like this: a try block will contain a set of instructions in our code. If everything is working properly, the code will continue running. The except block succeeds a try block & is only executed if an exception has been found inside the preceding try block, or else it's skipped entirely. Once the except block finishes executing, then the program can continue to run once again.

The dynamic duo of try-except in Python ensures that the code we write not just works in the most simple of terms, but that it's also prepared to handle exceptions anytime edge cases are encountered. We can compare their similarity to an if-else code block; however, try-except blocks are explicitly designed to handle runtime errors, while if-else statements focus more on logical/conditional branching.

References.
[1] W3 Schools. (2024). Python Try Except via w3schools.com: https://www.w3schools.com/python/python_try_except.asp
[2] Hunner, T. (2022, January). Python’s Try-Except Blocks | Python Morsels via pythonmorsels.com: https://www.pythonmorsels.com/how-to-catch-an-exception-in-python/

-----
-----

## What initial thoughts or perceptions do you have about recursion in programming? How does it compare to iterative methods?

My initial thoughts about recursion are well-received. I think that I probably won't use recursion as often as some of the iterative methods we have already learned, such as for or while loops, but knowing how to use recursion in the right situation is necessary for future use as a software developer. The iterative methods we learned about previously appear to be more frequently used in successful Python programs, based on my observations so far, but I could be wrong. Maybe this stems from users believing that if not handled correctly, having functions call themselves infinitely is an easier mistake to make as opposed to creating an endless for loop.

Iterative methods have no overhead because they don't repeatedly have to call themselves like a recursive function would do, which means that they take up less space memory-wise. Iterative loops are generally faster & more memory-efficient because they avoid the overhead of repeated function calls, which all recursive functions must perform. Each recursive call requires the system to save the function's state onto the limited call stack memory. One major way that recursion can be beneficial is in applying it to algorithms that break down problems into two or more smaller, identical subproblems, like with tree or graph traversals, which require hierarchical branching. 

References. 
[1] Educative. (2024) What is the Difference Between Recursion & Iteration? | via educative.com: https://www.educative.io/blog/recursion-vs-iteration
[2] GeeksforGeeks. (2018). The Difference between Recursion & Iteration. | via geeksforgeeks.com: https://www.geeksforgeeks.org/dsa/difference-between-recursion-and-iteration/

-----
-----

## 2. Discuss the different modes (read, write, append) used when opening files in Python. When would you choose each mode & what are the implications of using them?

There are many different ways you can interact with files in Python but the read ('r'), write ('w') & append ('a') modes are some of the most frequently used. That's because they each have distinct purposes that are essential to any software developer due to their ability to directly impact any Python file. The ability to read files through the 'r' mode might be the most important, without this mode you would be unable to view or extract the contents of any file. You would choose this mode when you want view the contents of any file & if the file you've specified doesn't exist, the 'FileNotFound' error will be raised.

The write 'w' mode is a little different, as it should be chosen when you want to create a new file or overwrite an existing file completely. The append mode 'a' is utilized when you want to add new data to the end of a file you're working with. Using this mode also ensures that whatever information exists inside the file you've appended will remain unchanged. To actually use these modes, you pass the filename & then the chosen mode like 'r', or 'w' for example, inside of an 'open()' function. What makes these modes even more dynamic is how you can use them together inside of a Python program to perform a number of unique operations simultaneously. 

References.
[1] GeeksForGeeks. (2024, April). File Modes in Python. | via geeksforgeeks.com: https://www.geeksforgeeks.org/python/file-mode-in-python/ 
[2] Hunner, T. (2022, May). File Modes in Python. | Python Morsels | via pythonmorsels.com: https://www.pythonmorsels.com/file-modes-in-python/

-----
-----

## 3. How does creating custom modules benefit your coding practice? What are some scenarios where custom modules have significantly improved your workflow?

Readability is one of the most undervalued skills in coding, but it shines brightest with Python because it's syntax rules forces users to conform to that standard. Modular code improves on the concept of readability one step further though, because it breaks our code into sections, instead of slopping everything together inside of one file. While that might not seem as necessary in the beginning stages of learning how to code, as we progress the programs we create & manage grow in complexity. Imagine one program where there are over a million lines code, which would you prefer to work with: one file containing all of that data, or a similar program where the code is broken down into 10,000 lines of code per file? I can't imagine any circumstances where someone would choose the first option over the second. 

While writing modular code took a little getting used to at first, after creating a few small programs it just made sense to continue writing things in the same fashion when it was called for. Another object-oriented programming language that abides by the same practice of modularity is Java. If you take any courses on Java, they will teach this to you very early on in your Java journey, whereas Python is capable of handling many simple programs without modularity requirements. One example of a project I built with a group of colleagues the other year was a soccer team monitoring application that was made with both JavaScript & Python; it consisted of over 40 files altogether. In order to maintain clear, structured code, we each chose specific features to focus on; I built the login & logout features. While both of those things are closely related, I chose to separate them into their own respective modules to ensure everyone on the team was able to easily discern each feature from the others. 

References.
[1] Ricciardi, A. (2024, September). Modular Programming: Benefits, Challenges & Modern Applications. | Omega.py via alexomegapy.com: https://www.alexomegapy.com/post/modular-programming-benefits-challenges-and-modern-applications
[2] GeeksForGeeks. (2018, September). Modular Approach in Programming. | via geeksforgeeks.com: https://www.geeksforgeeks.org/software-engineering/modular-approach-in-programming/