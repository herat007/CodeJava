public class ReverseNum {
    public static int reverse(int x) {
        
        boolean neg = false;
        
        int num = x;
        if(x < 0){
            neg = true;
            num = -1*num;
        }
        int div = 1;
	    
	    while(num/div >=10){
	        div = div*10;
	    }
	    
        int res = 0;
        while(num != 0){
            int a = num%10;
            res = res + a*div;
            div = div/10;
            num = num/10;
        }
        if(neg){
            res = -1*res;
        }
        return res;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println(reverse(54321));
    }
}