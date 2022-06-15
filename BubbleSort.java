// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,3,4,6,21,44};
        for(int i = 0;i<arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j+1] < arr[j] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++) {
            System.out.println(" "+arr[i]);
        }
    }
}