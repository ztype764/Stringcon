package com.stringcon.btoh.stringcon;
public class worker {
    @org.jetbrains.annotations.NotNull
    public String convert(String input) {
        StringBuilder binary = new StringBuilder();
        for (char c : input.toCharArray()) binary.append(Integer.toBinaryString(c));
        int decimal = Integer.parseInt(binary.toString(), 2);
        return Integer.toString(decimal, 16);
    }
}
