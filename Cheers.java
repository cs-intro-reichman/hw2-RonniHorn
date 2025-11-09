
public class Cheers {
        public static void main(String[] args) {
	    String name = args[0];
            int num = Integer.parseInt(args[1]);
            name = name.toUpperCase();
            int length = name.length();
            String an = "AEFHILMSXNOR";
           for(int i = 0; i<length; i++){
                int j = 0;
                boolean didPrint = false;
                while(j<an.length() && didPrint == false){

                        if(name.charAt(i) == an.charAt(j)){
                                System.out.println("Give me an " + name.charAt(i) + ": " + name.charAt(i) + "!" );
                                didPrint = true;
                        }
                        j++;
                }
                if(j == an.length() && didPrint == false)
                        System.out.println("Give me a  " + name.charAt(i) + ": " + name.charAt(i) + "!" );

            }
        System.out.println("What does that spell?");
        for(int i = 0; i<num; i++){
             System.out.println(name + "!!!");
        }
        }
}
