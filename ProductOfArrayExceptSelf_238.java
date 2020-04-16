int[] left = new int[nums.length];
int[] right = new int[nums.length];
int len = nums.length;

for (int i = 0, tempLeft = 1; i < nums.length; i++) {
    if (i == 0) {
        left[i] = 1;
        tempLeft *= nums[i];
    } else {
        left[i] = tempLeft;
        tempLeft *= nums[i];
    }
}
for (int i = nums.length - 1, tempRight = 1; i >= 0; i--) {
    if (i == len) {
        right[i] = 1 * left[i];
        tempRight *= nums[i];
    } else {
        right[i] = tempRight * left[i];
        tempRight *= nums[i];
    }
}
return right;
