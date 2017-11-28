#How to Write a Spelling Corrector
#Link: http://norvig.com/spell-correct.html

import re
from collections import Counter

#Count of words from the file
def findWords(text) : return re.findall(r'\w+', text.lower())
WORDS = Counter(findWords(open('big.txt').read()))

def score(word, N=sum(WORDS.values())):
    #Probability score of a word
    return WORDS[word]/N

def candidateList(word):
    #Generates all possible spelling corrections for a word
    return 

def correctSpelling(word):
    #Return the most probable correct spelling
    return max(candidateList(word), key=score)