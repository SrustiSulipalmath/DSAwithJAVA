public class uppercaseToLowercase {
    public static void main(String[] args) {
        String st = "wElcoME tO ScAleR";
        UpperCasetoLowerCase(st);

    }
    public static void UpperCasetoLowerCase(String st){
        char[] s = st.toCharArray();
        for(int i=0;i<s.length;i++){
            char ch=s[i];
            if(ch>='A'&&ch<='Z'){
                char ansch=(char)(ch-'A'+'a');
                s[i]=ansch;
            }
        }
        for(char c:s){
            System.err.print(c);
        }
    }
}

