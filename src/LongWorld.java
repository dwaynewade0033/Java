public class LongWorld {
    public static void main(String[] args) {
       String[] longworld = {"hello","hi","helloworld"};
       String longestworld = "";
       for (int i = 0;i<longworld.length;i++){
           if(longworld[i].length()>longestworld.length() ){
               longestworld=longworld[i];
           }
       }
        System.out.println(longestworld);
    }
}

