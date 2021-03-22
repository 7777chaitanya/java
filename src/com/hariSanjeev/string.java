package com.hariSanjeev;

public class string {
    public static void main(String[] args) {
        String str1 = "test123string";
        String str2 = "123";
        char first = str2.charAt(0);

        int n = str2.length();
        for (int i = 0; i < str1.length(); i++) {
            String str = "";
            if (str1.charAt(i) == first) {
                int j = i;
                while (j < (i + n)) {
                    str += str1.charAt(j);
                    j++;
                }
                if (str2.equals(str)) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}
