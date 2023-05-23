/**
 * Nama : M. Hafiz Attariq
 * File : ArrayListTest.java 17/05/2023
 * Deskripsi : Program penggunaan objek ArrayList
                sebagai Collection Class
 */

package ArrayList;
import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("praktikum");
        strings.add("collection");
        strings.add("generics");
        strings.remove("praktikum");
        for(String s : strings){
            System.out.print(s+" ");
        }
    }
}