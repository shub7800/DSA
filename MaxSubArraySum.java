public class MaxSubArraySum {
    public static void getSubArraySum(int num[]){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                curr_sum=0;
                for(int k=i;k<=j;k++){
                  //Subarray sum
                  curr_sum +=num[k];  
                }
                System.out.println(curr_sum);
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }
            }
        }
        System.out.println(max_sum);
    }
    public static void main(String[] args) {
        int num[]={ -2,1,-3,4,-1,2,1,-5,4};
        getSubArraySum(num);

    }
    
}