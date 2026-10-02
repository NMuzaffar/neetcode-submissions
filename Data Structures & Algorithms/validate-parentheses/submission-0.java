class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> closerBrackets = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
        );
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!closerBrackets.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || !stack.pop().equals(closerBrackets.get(c))) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
