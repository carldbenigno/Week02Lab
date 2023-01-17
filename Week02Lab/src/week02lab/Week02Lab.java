    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week02lab;
import java.util.*;
/**
 *
 * @author carld
 */
public class Week02Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Did you finish your week 2 lab? ");
        String ans = in.nextLine();
        
        if("yes".equals(ans.toLowerCase())){
            System.out.println("Great! You can move on now.");
        } else {
            System.out.println("Stop procastinating and do your work!");
        }
    }
    
}
