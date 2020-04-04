public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> wrapperList = new ArrayList<>();
    if (nums.length == 0) return wrapperList;
    helper(nums, wrapperList, new ArrayList<>(), 0);
    return wrapperList;
}

private static void helper(int[] nums, List<List<Integer>> wrapperList, List<Integer> temp, int start) {
    if (temp.size() == nums.length) {
        wrapperList.add(temp);
        return;
    }

    for (int i = 0; i <= temp.size(); i++) {
        List<Integer> newList = new ArrayList<>(temp);
        newList.add(i, nums[start]);
        helper(nums, wrapperList, newList, start + 1);
    }
}
