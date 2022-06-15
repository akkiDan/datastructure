// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SelectionSort {
    public static void main(String[] args) {
       int[] arr = new int[] {3,44,66,1,4,52,53};
       for(int i=0;i<arr.length;i++) {
           for(int j=i+1;j<arr.length;j++) {
               if(arr[j] < arr[i]) {
                   int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
               }
           }
       }
       for(int i=0;i<arr.length;i++) {
           System.out.println(" "+arr[i]);
       }
    }
}