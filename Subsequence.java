import java.util.ArrayList;

class Subsequence{
    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        int n = arr.length;
        int targetSum = 2;
        ArrayList<Integer> list = new ArrayList<>();
        printSubsequences(arr , 0 , list , targetSum , 0 , n);
    }
    public static void printSubsequences(int arr[] , int index , ArrayList<Integer> list , int targetSum , int currentSum , int n){
        if(index == n){
            if(currentSum == targetSum){
                System.out.println(list);
            }
            return;
        }
        // include the element
        list.add(arr[index]);
        printSubsequences(arr , index + 1 , list , targetSum , currentSum + arr[index] , n);
        // exclude the element
        list.remove(list.size() - 1);
        printSubsequences(arr , index + 1 , list , targetSum , currentSum , n);
    }
}