// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class QuickSort {
    public static void main(String[] args) {
         int[] a = new int[] {3,45,2,6,11,56,0,8};
         quickSort(a,0,a.length-1);
         printArray(a);
    }
    
    static void printArray(int[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.println(" "+a[i]);
        }
    }
    
    static void quickSort(int[] a,int low,int high) {
        if(low < high) {
            int pi = partition(a,low,high);
            quickSort(a,low,pi-1);
            quickSort(a,pi+1,high);
        }
    }
    
    static void swap(int a[],int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static int partition(int[] a,int low,int high) {
        int pivot = a[high];
        int i = low - 1;
        for(int j=low;j<high;j++) {
            if(a[j] < pivot) {
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,high);
        return i+1;
    }
}