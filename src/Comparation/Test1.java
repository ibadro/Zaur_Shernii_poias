package Comparation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// cортировка от меньшего к большему
public class Test1 {
    public static void main(String[] args) {
        List <String>List = new ArrayList<>();
        List.add("Zaur");
        List.add("Ivan");
        List.add("Maria");
        System.out.println("pered sortirovkoi");
        System.out.println(List);
        Collections.sort(List);
        System.out.println("posle sortirovki");
        System.out.println(List);
    }
}
