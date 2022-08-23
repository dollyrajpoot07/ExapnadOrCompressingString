public class ExapnadOrCompressingString {
    
    public static String expand(String input) {
        StringBuilder output = new StringBuilder();
        int j = 0; 
        int[] a = new int[input.length()];
        String[] strnew = input.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        for(int i = 0; i < strnew.length; i++) {
            for(j = 0; j < Integer.parseInt(strnew[i+1]); j++) {
                System.out.print(strnew[i]);
            }
            i += 1;
            j = 0;
        }
        System.out.println("");
        return strnew.toString();
    }
    
    public static String compress(String input) {

        StringBuilder output = new StringBuilder();

        if (input.length() == 0)
            return output.toString();

        char c = input.charAt(0);
        int count = 0;

        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == c)
                count++;
            else {
                output.append(c);
                output.append(count);
                c = input.charAt(index);
                count = 1;
            }
        }

        output.append(c);
        output.append(count);

        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("a"));
        System.out.println(compress("aaddbbdd"));
        System.out.println(compress("aabbbbccddde"));
        System.out.println(expand("a5b2c4"));
    }
}