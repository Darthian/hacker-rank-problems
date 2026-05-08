package service;

import java.util.Arrays;
import java.util.List;

public class JumpingFrogService {
    /*
    * Contexto
    *
    * Imagina que una rana está intentando cruzar un río. En el río hay una serie de piedras representadas por un
    * arreglo de números enteros stones[]. Cada valor en stones[i] representa la distancia máxima que la rana puede
    * saltar hacia adelante desde esa piedra. La rana comienza en la primera piedra (stones[0]). Debes determinar el
    * número mínimo de saltos que la rana debe dar para alcanzar la última piedra del arreglo. Si es imposible llegar al
    * final, el algoritmo debe indicarlo.
    *
    * Ejemplo
    *
    * Entrada: stones = [1,3,1,1,4]
    * Salida: 2
    * Explicación:
    * 1. Salta desde la posición 0 a la 1 (un salto, rango de 2).
    * 2. Desde la posición 1 (valor 3), tiene fuerza suficiente para saltar directamente hasta la última piedra
    * (posición 4). * Total: 2 saltos.
    *
    * Entrada: stones = [3,2,1,0,4]
    * Salida: -1 (o un mensaje de error)
    * Explicación:
    * La rana llegará a la posición 3 (valor 0) y no podrá avanzar más.
    * */
    public static Integer getTotalJumps(String plainArray) {
        String[] stringValuesArray = plainArray.replace(" ","").split(",");
        List<Integer> stones = Arrays.stream(stringValuesArray).map(Integer::valueOf).toList();
        int jumps = 0;
        int index = 0;
        do {
            //stones.get(index) represents the number of possible jumps the frog can make
           if(stones.get(index) > 0) {
               //the frog jumps and get a new position
               index = index + (stones.get(index));
               jumps++;
           } else {
               //it means it is not possible to jump to next stone
               index = -1;
           }
        } while(index != -1 && index < stones.size() - 1);
        return index == -1 ? index : jumps;
    }

}
