#Iterate through string, if x is open then append, if x is closed then check
#if stack is empty then return false. If Stack is not empty then top = stack.pop
#compare top and x
stack = [ ]
mapping = {")": "(", "]":"[", "}":"{"}
for a in s:
    if a not in mapping:
        stack.append(a)
    else:
        if stack == []:
            return False
        else:
            top = stack.pop()
            if (top != mapping[a]):
                return False
return (len(stack) == 0)
