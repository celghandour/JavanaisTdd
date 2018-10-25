public class Translator {

    final String  av = "av";

    public Translator() {
    }

    public String crypt(String string){



        String[] arr= string.split(" ");


        for (int i = 0; i < arr.length ; i++) {


            arr[i]=cryptWord(arr[i]);

        }

        String stringFinal = String.join(" ", arr);

        return stringFinal;

    }


    public String deCrypt(String string){

        String[] arr= string.split(" ");


        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].contains("avavav")) {

                arr[i] = arr[i].replace("avavav", "*");
                arr[i] = arr[i].replace(av, "");
                arr[i] = arr[i].replace("*", av);
            }

            else {

                arr[i] = arr[i].replace(av, "");

            }

        }
        String stringFinal = String.join(" ", arr);

        return stringFinal;



    }

    private String cryptWord(String  string) {

        String word = "" ;

        for (int i = 0; i < string.length()-1 ; i++) {

            if (!isVowel(string.charAt(i)) && isVowel(string.charAt(i+1))){

                word=word+string.charAt(i)+av;


            }else{
                word=word+string.charAt(i);}

        }
        word=word+string.charAt(string.length()-1);

        if (isVowel(string.charAt(0))){
            word=av+word ;}

        return word;

    }

    private boolean isVowel (char c ){

        c=Character.toLowerCase(c);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
            return true ;
        }
        return false ;
    }

}
