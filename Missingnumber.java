class Missingnumber {
    public static void main(String[] args) {
        int actual=0;
        int arr[]={1,2,3,5};
        int n=arr.length+1;
        int total_sum=n*(n+1)/2;
        for(int i=0;i<n-1;i++){
            actual+=arr[i];
        }
        int missing=total_sum-actual;
        System.out.print(missing);
    }
}