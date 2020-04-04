public boolean isHappy(int n) {
    Set<Integer> set = new HashSet<Integer>();
    int squareSum = 0;
    int remain = 0;
    while (set.add(n)) {
        squareSum = 0;
        while (n > 0) {
            //get the last digit of n in each while loop
            remain = n % 10;

            squareSum += remain*remain;
            n /= 10;
        }

        if (squareSum == 1)
            return true;
        else
            n = squareSum;

    }
    return false;  
}
