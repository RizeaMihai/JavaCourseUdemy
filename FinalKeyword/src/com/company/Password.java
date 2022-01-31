package com.company;

public class Password {
    private static int key = 123112;
    private final int encryptedPassword;

    public Password (int password) {
        this.encryptedPassword = encryptOrDecrypt(password);

    }

    private int encryptOrDecrypt(int password) {
        return password ^ key;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + encryptedPassword);
    }

    public boolean letMeIn (int password) {
        if (encryptOrDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
