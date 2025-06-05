
package package2;

import package1.AccessDemo;

public class TestAccess {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();
        System.out.println("Public var: " + demo.publicVar);
        // System.out.println("Protected var: " + demo.protectedVar); // Not accessible
        // System.out.println("Default var: " + demo.defaultVar); // Not accessible
        // System.out.println("Private var: " + demo.privateVar); // Not accessible
    }
}
