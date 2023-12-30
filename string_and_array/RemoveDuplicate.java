public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 4, 4, 4, 5, 6, 6};
        int uniqueCount = removeDuplicates(sortedArray);
        System.out.print("Array with duplicates removed: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    public static int removeDuplicates(int[] sortedArray) {
        int n = sortedArray.length;
        if (n == 0 || n == 1) {
            return n;
        }

        int uniqueCount = 1;

        for (int i = 1; i < n; i++) {
            if (sortedArray[i] != sortedArray[i - 1]) {
                sortedArray[uniqueCount] = sortedArray[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}

