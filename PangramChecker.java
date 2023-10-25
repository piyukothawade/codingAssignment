public class PangramChecker {

        public static boolean isPangram(String sentence) {
            boolean[] alphabet = new boolean[26];
            int index = 0;
            int flag = 0;
    
            for (int i = 0; i < sentence.length(); i++) {
                // If the character is an uppercase letter
                if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z') {
                    index = sentence.charAt(i) - 'A';
                } 
                // If the character is a lowercase letter
                else if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z') {
                    index = sentence.charAt(i) - 'a';
                }
                
                alphabet[index] = true;
            }
    
            for (int i = 0; i <= 25; i++) {
                if (!alphabet[i]) {
                    return false;
                }
            }
    
            return true;
        }
    
        public static void main(String[] args) {
            System.out.print("Enter a sentence: ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String sentence = scanner.nextLine();
            
            if (isPangram(sentence)) {
                System.out.println("The sentence is a pangram.");
            } else {
                System.out.println("The sentence is not a pangram.");
            }
        }
    }
    