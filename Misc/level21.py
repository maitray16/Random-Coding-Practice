# Please Pass the Coded Messages
# ==============================
# You need to pass a message to the bunny prisoners, but to avoid detection, the code you agreed to use is... obscure, to say the least. The bunnies are given food on standard-issue prison plates that are stamped with the numbers 0-9 for easier sorting, and you need to combine sets of plates to create the numbers in the code. The signal that a number is part of the code is that it is divisible by 3. You can do smaller numbers like 15 and 45 easily, but bigger numbers like 144 and 414 are a little trickier. Write a program to help yourself quickly create large numbers for use in the code, given a limited number of plates to work with.
# You have L, a list containing some digits (0 to 9). Write a function answer(L) which finds the largest number that can be made from some or all of these digits and is divisible by 3. If it is not possible to make such a number, return 0 as the answer. L will contain anywhere from 1 to 9 digits.  The same digit may appear multiple times in the list, but each element in the list may only be used once.

# Test cases
# ==========
# Inputs:
#     (int list) l = [3, 1, 4, 1]
# Output:
#     (int) 4311

# Inputs:
#     (int list) l = [3, 1, 4, 1, 5, 9]
# Output:
#     (int) 94311

def findLargestMultiple(array, length):
    total = sum(array)
    
    if total % 3 == 0:
        return int(''.join(map(str,array)))
    
    remainder = total % 3

    if remainder == 1:
        rem1 = -1
        rem2 = -1
        for index1 in array:
            if index1 % 3 == 1:
                array.remove(index1)
                return int(''.join(map(str,array)))
            if index1 % 3 == 2:
                if rem1 == -1:
                    rem1 = index1
                elif rem2 == -1:
                    rem2 = index1
        
        if rem1 != -1 and rem2 != -1:
            array.remove(rem1)
            array.remove(rem2)
            return int(''.join(map(str,array)))
    
    elif remainder == 2:
        rem3 = -1
        rem4 = -1
        for index2 in array:
            if index2 % 3 == 2:
                array.remove(index2)
                return int(''.join(map(str,array)))
            if index2 % 3 == 1:
                if rem3 == -1:
                    rem3 = index2
                elif rem4 == -1:
                    rem4 = index2
        
        if rem3 != -1 and rem4 != -1:
            array.remove(rem3)
            array.remove(rem4)
            return int(''.join(map(str,array)))
    
    return 0

def answer(array):
    length = len(array)
    if length == 1:
        if array[0] % 3 == 0:
            return array[0]
        else:
            return 0
    else:
        test = sorted(array, reverse=True)
        return findLargestMultiple(test, length)


print answer([3, 1, 4, 1])