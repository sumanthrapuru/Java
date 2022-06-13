package ds.string;

public class StringProblems {

    static String reverse(String str){
        if(str == null || str.isEmpty()) return str;

        StringBuilder builder = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){
            builder.append(str.charAt(i));
        }
        return builder.toString();

    }

    public static void main(java.lang.String[] args) {
        System.out.println(reverse("hi! There."));
    }

}
