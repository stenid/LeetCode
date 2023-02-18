package lengthOfLastWord_58;

public class SecondSolution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int indexOfLastSpace = s.lastIndexOf(" ") + 1;

        return s.length() - indexOfLastSpace;
    }
}
