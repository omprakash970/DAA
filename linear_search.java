public class linear_search {
    public void linearsearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
        
    }
    public static void main(String[] args) {
        linear_search ls = new linear_search();
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        ls.linearsearch(arr, target);
    }
}
    

