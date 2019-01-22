/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.util.Iterator;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        Iterator<String> list = main.execute(args);
    }

    private Iterator<String> execute(String[] args) {
        return new Iterator<String>() {
            private int index =0;
            
            @Override
            public boolean hasNext() {
                return index < args.length;
            }

            @Override
            public String next() {
                return args[index++];
            }
        };
    }    
}
