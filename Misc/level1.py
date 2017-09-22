#  The cake is not a lie!
#  ======================
#  Commander Lambda has had an incredibly successful week: she completed the first test run of her LAMBCHOP doomsday device, she captured six key members of the Bunny Rebellion, and she beat her personal high score in Tetris. To celebrate, she's ordered cake for everyone - even the lowliest of minions! But competition among minions is fierce, and if you don't cut exactly equal slices of cake for everyone, you'll get in big trouble. 
#  The cake is round, and decorated with M&Ms in a circle around the edge. But while the rest of the cake is uniform, the M&Ms are not: there are multiple colors, and every minion must get exactly the same sequence of M&Ms. Commander Lambda hates waste and will not tolerate any leftovers, so you also want to make sure you can serve the entire cake.
#  To help you best cut the cake, you have turned the sequence of colors of the M&Ms on the cake into a string: each possible letter (between a and z) corresponds to a unique color, and the sequence of M&Ms is given clockwise (the decorations form a circle around the outer edge of the cake).
#  Write a function called answer(s) that, given a non-empty string less than 200 characters in length describing the sequence of M&Ms, returns the maximum number of equal parts that can be cut from the cake without leaving any leftovers.


#  Test cases
#  ==========

#  Inputs:
#      (string) s = "abccbaabccba"
#  Output:
#      (int) 2

#  Inputs:
#      (string) s = "abcabcabcabc"
#  Output:
#      (int) 4

def answer(s):
    if not bool(s):
        return 0
    result = 0
    howlong = len(s)
    i = howlong
    while i > 0:
        n = howlong / i
        if (n * i) == howlong:
            valid = 1
            part = s[:int(n)]
            j = 1
            while j < i:
                if not s[int(j*n):int(j*n+n)] == part:
                    valid = 0
                    break
                j = j + 1
        if bool(valid):
            result = i
            break
        i = i - 1
