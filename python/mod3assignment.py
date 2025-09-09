# greeting = "Hello"
# name = 'Mike'

# # message = greeting + ', ' + name + '. Welcome!'
# # message = '{}, {}. Welcome!'.format(greeting, name)
# # message = f'{greeting}, {name.upper()}. Welcome!'

# print(help(str))
# print(help(str.lower))

name = str(input('Enter name: '))
# ask user to input name as a string
age = int(input('Enter age: '))
# ask user to input age as an integer
pin = int(input('Enter pin: '))
# ask user to input pin as an integer

message = f'Hello, {name}. You are {age} years old & your pin is {pin}.'
# message equals an f string with users name, age & pin
print(message)
# message is displayed in the terminal
