
import static java.lang.System.in;

class Prime {
    public void checkPrime(int ... num){
    
    
    for(int i = 0 ; i < num.length ;i++){
    
   boolean  check = true ;
    
    for(int j = 2 ; j < num[i] ; j++ ){
    if(num[i]%j==0){
    check = false  ;
        break ;
    }
        
    }
    if(check && num[i] != 1){
        System.out.print(num[i]+" ");
}
}
System.out.println();
}
}

