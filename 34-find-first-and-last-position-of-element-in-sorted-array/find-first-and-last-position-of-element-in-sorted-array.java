class Solution {
    public int[] searchRange(int[] arr, int target) {
        int start = first(arr, target, 0, arr.length - 1);
        int end = second(arr, target, 0, arr.length - 1);
        return new int[] { start, end };
    }

    public int first(int arr[], int target, int low, int high) {
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public int second(int arr[], int target, int low, int high) {
        int second = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                second = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return second;

    }
}