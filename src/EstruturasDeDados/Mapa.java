package EstruturasDeDados;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer,String> usuarios = new HashMap<>();
        usuarios.put(1,"Roberto");
        usuarios.put(1,"Ricardo");
        usuarios.put(2,"Maria");
        usuarios.put(3,"Caique");
        usuarios.put(4,"Rebecca");
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());

        System.out.println(usuarios.entrySet()); // value and key
        System.out.println(usuarios.containsKey(4));

        System.out.println(usuarios.containsValue("Caique"));
        System.out.println(usuarios.get(3));
        System.out.println(usuarios.remove(3));
        System.out.println(usuarios.remove(4,"Gui"));

        for(int chave : usuarios.keySet()) {
            System.out.println(chave);
        }
        for (String valor : usuarios.values()){
            System.out.println(valor);
        }

        for (Map.Entry<Integer,String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + "==>");
            System.out.println(registro.getValue());
        }
    }
}
