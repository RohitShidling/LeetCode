class Solution {
    public boolean backspaceCompare(String s, String t) {
        return Backspace(s).equals(Backspace(t));

    }

    public String Backspace(String current) {
        StringBuilder sbuilder = new StringBuilder();

        int count = 0;
        for (int i = current.length() - 1; i >= 0; i--) {
            char c = current.charAt(i);
            if (c == '#') {
                count++;
            } else if (count > 0) {
                count--;
            } else {
                sbuilder.append(c);
            }
        }
        return sbuilder.reverse().toString();

    }
}
