/** Solutions for the Additional Challenge Questions using custom Stack. */
public class StackChallenges {

    /** Challenge 1: Reverse a string using our custom Stack implementation. */
    public static String reverseString(String input) {
        Stack charStack = new Stack();

        // Push each character's ASCII value onto the stack
        for (int i = 0; i < input.length(); i++) {
            charStack.push(input.charAt(i), false);
        }

        // Pop characters to build the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversed.append((char) charStack.pop(false));
        }
        return reversed.toString();
    }

    /** Challenge 2: Check whether a given string is a palindrome using Stack. */
    public static boolean isPalindrome(String input) {
        String cleaned = input.toLowerCase();
        Stack charStack = new Stack();

        // Push all characters onto the stack
        for (int i = 0; i < cleaned.length(); i++) {
            charStack.push(cleaned.charAt(i), false);
        }

        // Compare original characters with popped characters (LIFO order)
        for (int i = 0; i < cleaned.length(); i++) {
            char poppedChar = (char) charStack.pop(false);
            if (cleaned.charAt(i) != poppedChar) {
                return false;
            }
        }
        return true;
    }

    /** Challenge 3: Reverse the elements of a Stack using another Stack. */
    public static Stack reverseStack(Stack original) {
        Stack tempStack = new Stack();

        // Pop from original and push into tempStack to reverse the order
        while (!original.isEmpty()) {
            tempStack.push(original.pop(false), false);
        }
        return tempStack;
    }
}
