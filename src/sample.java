import java.util.Stack;

public class sample {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int n = height.length;
        int total = 0;
        for(int i = 0; i < n - 1; i++) {
            if(height[i] < leftMax(height, i) && height[i] < rightMax(height, i)) {
                total += Math.min(leftMax(height, i), rightMax(height, i)) - height[i];
            }
        }
        return total;
    }

    public static int leftMax(int[] arr, int i) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for(int j = i - 1; j >= 0; j--) {
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[j]) {
                stack.pop();
            }
            stack.push(j);
        }

        while(!stack.isEmpty()) {
            int idx = stack.pop();
            if(arr[idx] > arr[i]) {
                ans = arr[idx];
                return ans;
            }
        }
        return -1;
    }

    public static int rightMax(int[] arr, int i) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        int n = arr.length;

        for(int j = i + 1; j < n - 1; j++) {
            while(!stack.isEmpty() && stack.peek() <= arr[j]) {
                stack.pop();
            }
            stack.push(arr[j]);
        }

        while(!stack.isEmpty()) {
            int idx = stack.pop();
            if(arr[idx] > arr[i]) {
                ans = arr[idx];
                return ans;
            }
        }
        return -1;
    }
}
