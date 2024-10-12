//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(isAnagram("jar","jam"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int [] freqS=new int[26];
        int [] freqT=new int[26];
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'a';
            freqS[index]++;
        }
        for(int i=0;i<t.length();i++){
            int index = t.charAt(i)-'a';
            freqT[index]++;
        }
        for(int i=0;i<26;i++){
            if(freqS[i]!=freqT[i]){
                return false;
            }
        }
        return true;

    }
}