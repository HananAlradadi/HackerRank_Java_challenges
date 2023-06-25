

    static boolean isAnagram(String a, String b) {
   int count1 = 0 ;
   int count2 = 0 ;
if(a.length() != b.length()){
           return false ;
       }
       else{
           for(char i = 'a' ,j = 'A' ; i <='z'&& j <='Z' ; i++ , j++){
               count1 = 0 ;
               count2 = 0 ;
               for(int u = 0 ; u < a.length() ; u++){
                   char e = a.charAt(u) ;
                   if(e == i || e == j){
                       count1++ ;
                   }
               }
                for(int u = 0 ; u < b.length() ; u++){
                   char e = b.charAt(u) ;
                   if(e == i || e == j){
                       count2++ ;
                   }
               }
             if(count1 != count2)  {
                 return false ;
                 
             } 
       }
       }
     return true ;   
    }

