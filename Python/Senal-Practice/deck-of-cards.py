# deck-of-cards.py

# importing the required modules
import itertools, random

# Make a deck of cards
deck = list(itertools.product(range(1,14),['Spade','Heart','Diamond','Club']))

# Shuffle the cards
random.shuffle(deck)

# Draw five cards and display the user of what they got
print("You got:")
for i in range(5):
    print(deck[i][0], "of", deck[i][1])