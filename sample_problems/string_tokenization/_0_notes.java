package sample_problems.string_tokenization;

public class _0_notes {
    public static void main(String[] args) {

    }
}
// Common regex patterns in comment format:
// Remember: In Java strings, backslash \ must be escaped, so \d becomes \\d, \s becomes \\s, \W becomes \\W, etc.

// .split("\\D+"); -> Splits by one or more non-digit characters.
// Anything that is not 0-9 acts as delimiter.
// Useful for extracting numbers from text.

// .split("\\d+"); -> Splits by one or more digit characters.
// Removes numbers and keeps non-digit tokens.

// .split("\\s+"); -> Splits by one or more whitespace characters (spaces, tabs, newlines).
// Good for counting words.

// .split(","); -> Splits by comma character.
// Simple CSV parsing.

// .split("\\."); -> Splits by period/dot.
// Note: dot must be escaped because dot means "any character" in regex.

// .split("[ ,.]+"); -> Splits by space, comma, or period.
// The + means one or more of any character inside brackets.

// .split("[^a-zA-Z]+"); -> Splits by anything that is NOT a letter (A-Z or a-z).
// Keeps only alphabetic characters as tokens.

// .split("\\W+"); -> Splits by one or more non-word characters.
// Word characters are letters, digits, and underscore.

// .split("\\w+"); -> Splits by one or more word characters.
// Keeps non-word characters like punctuation.