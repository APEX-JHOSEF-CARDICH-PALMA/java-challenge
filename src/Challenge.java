public class Challenge {

    public static void main (String args[]){

        System.out.println(palindromo("radar"));

    }


    public static boolean palindromo(String word){
        boolean resp =true;

        String[] str = new String[word.length()];
        int j = 0;
        for (int i = word.length(); i == 0; i--){
            str[j] = String.valueOf(word.charAt(i));
            j++;
        }
        for(int i =word.length(); i<=0;i--){

            if(str[i]!=String.valueOf(word.charAt(i))){
            resp = false;
            }
        }





        return resp;
    }
}
