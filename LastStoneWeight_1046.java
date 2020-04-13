public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    for (int stone: stones) {
        maxHeap.add(stone);
    }
    //We check the condition of maxHeap.size() > 1 so stone1 and stone2 can
    //do func remove() without NoSuchElementException error. 
    while (maxHeap.size() > 1) {
        int stone1 = maxHeap.remove();
        int stone2 = maxHeap.remove();
        if (stone1 != stone2) {
            maxHeap.add(stone1 - stone2);
        }
        if (maxHeap.isEmpty()) return 0;
    }
    return maxHeap.remove();
}
