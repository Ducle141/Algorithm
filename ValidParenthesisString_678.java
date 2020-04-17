Deque<Integer> paraStack = new LinkedList<>();
Deque<Integer> starStack = new LinkedList<>();

for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    if (ch == '(') paraStack.push(i);
    else if (ch == '*') starStack.push(i);
    else {
        if (!paraStack.isEmpty()) {
            paraStack.pop();
        } else if (!starStack.isEmpty()) {
            starStack.pop();
        } else {
            return false;
        }
    }
}
return isBalanced(paraStack, starStack);
}
//After handling all the ')', we have '(' and '*' remaining in stack
//check if the index in starStack is on the right side of index of paraStack => false
private boolean isBalanced(Deque<Integer> paraStack, Deque<Integer> starStack) {
while (!paraStack.isEmpty() && !starStack.isEmpty()) {
    if (paraStack.pop() > starStack.pop()) {
        return false;
    }
}
return paraStack.isEmpty();
}
