//Create an array arr that each element is index of bit 1 exists in N. 
//Ex: N = 22 -> arr = [1, 2, 4]
int[] arr = new int[32];
int pointer = 0;
for (int i = 0; i < arr.length; i++) {
    if ((N >> i & 1) == 1) {
        arr[pointer] = i;
        pointer++;
    }
    //The above way is much faster than the below:
    // if ((N & 1) == 1) {
    //     arr[pointer] = i;
    //     pointer++;
    // }
    // N = N >> 1;
}
int max = 0;
for (int i = 1; i < arr.length; i++) {
    max = Math.max(max, arr[i] - arr[i - 1]);
}
return max;
