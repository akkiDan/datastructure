class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,3,4,6,21,44};
        for(int i = 0;iarr.length;i++) {
            for(int j=1;jarr.length-1;j++) {
                if(arr[j-1]  arr[j] ) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        
        for(int i=0;iarr.length;i++) {
            System.out.println( +arr[i]);
        }
    }
}