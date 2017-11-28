def answer(M, F):
    count = 0
    min_max = [int(M), int(F)]
    print min_max
    while min_max[0] > 1 and min_max[1] > 1:
        min_max.sort()
    	print min_max
        if min_max[1] %  min_max[0] == 0:
            return "impossible"
        print min_max[1]
        count += min_max[1] // min_max[0]
        min_max[1]  = min_max[1] %  min_max[0]
    count += max(min_max) - 1 
    print count
    return str(count)

print answer(4,7)