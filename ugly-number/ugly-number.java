class Solution {
public boolean isUgly(int n) {
    while(n>=2){
        if(n%2==0){
            n=n/2;
        }
        else{
            if(n%3==0){
                n=n/3;
            }
            else{
                if(n%5==0){
                    n=n/5;
                }
                else{
                    return false;
                }
            }
        }
    }
    if(n==1)
    {
        return true;
    }
    else{
        return false;
    }
    
}
}