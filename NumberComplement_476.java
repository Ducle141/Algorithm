public int findComplement(int num) {
    int iterator = num;
    int bit = 1;
    while (iterator != 0) {
        num = num ^ bit;
        bit = bit << 1;
        iterator = iterator >> 1;
    }
    return num;
}
