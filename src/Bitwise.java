public class Bitwise {
    
    public static void main(String[] args) {
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011

        System.out.println("a = " + a + ", b = " + b);

        // Bitwise AND
        System.out.println("a & b = " + (a & b));  // 0101 & 0011 = 0001 → 1

        // Bitwise OR
        System.out.println("a | b = " + (a | b));  // 0101 | 0011 = 0111 → 7

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b));  // 0101 ^ 0011 = 0110 → 6}

        System.out.println("a << b = " + (a << b));
}

}
