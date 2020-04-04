    public void moveZeroes(int[] nums) {
        int mark = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[mark] = nums[i];
                mark++;
            }    
        }
        for (int i = mark; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
