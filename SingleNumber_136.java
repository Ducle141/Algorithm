        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.remove(nums[i])){
                set.add(nums[i]);
            }
        }
        return (int) set.iterator().next();
