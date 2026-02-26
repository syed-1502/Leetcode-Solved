bool isPalindrome(int x) {
    // Negative numbers and numbers ending with 0 (except 0 itself) are not palindrome
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }

    int reversedHalf = 0;
    while (x > reversedHalf) {
        int digit = x % 10;
        reversedHalf = reversedHalf * 10 + digit;
        x /= 10;
    }

    // For even digits: x == reversedHalf
    // For odd digits: x == reversedHalf/10 (middle digit can be ignored)
    return (x == reversedHalf || x == reversedHalf / 10);
}
