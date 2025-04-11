public class LargestNumber{
    public static void main (String[] args){
        int[]numbers={10,50,20,70,40};
        int max=numers[0];
        for(int num:numbers){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Largest number:"+max);
    }
}