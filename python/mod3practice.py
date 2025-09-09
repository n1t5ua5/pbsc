variable1 = 'Hello'
variable2 = "Hello"
print(variable1)
if variable1 != variable2:
    print(variable2)

multi_line_string = '''This is a string
that spans multiple lines.'''

print(multi_line_string)

word1 = "Hello "
word2 = "World!"

print(word1 + word2)
result = word1 + " " + word2

another_word = "Python"
myResult = another_word * 3
print(myResult)

print(another_word[2])
print(another_word[-2])

print(another_word[3:])
print(another_word[:5])
print(another_word[1:4])

my_text = "Hello, good morning!"
print(my_text.upper())
print(my_text.lower())

the_text = "        Hello      "
print(the_text.strip())

print(my_text.replace("morning", "evening"))

myText = "Hello, World, Python"
print(myText.split(", "))

words = ["Hello", "World", "Hi"]
print(words)
print(" - ".join(words))

stringNumberTwo = "Hello World, how are you? "
print(stringNumberTwo.find("World"))

name = "Rick"
age = 50
sentence = f"My name is {name} & I am {age} years old."
print(sentence)

another_sentence = "My name is {} & I am {} years old now."
formatSentence = another_sentence.format(name, age)
print(formatSentence)

mySentence = "My name is %s & I am %d years old as of now. " % (name, age)
print(mySentence)

funnyString = "12345ABC"
print(funnyString.isdigit())
print(funnyString.isalpha())
print(funnyString.isalnum())

longText = "Billy Ben Ashley Mandy Justin"
words = longText.split()
print(words)

joinBack = "+".join(words)
print(joinBack)
