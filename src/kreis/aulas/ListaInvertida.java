package kreis.aulas;

import java.util.ArrayList;
import java.util.Stack;

public class ListaInvertida {
    public static void main(String[] args) {
        // criar a lista L
        ArrayList<Integer> L = new ArrayList<Integer>();
        L.add(3);
        L.add(5);
        L.add(18);
        L.add(12);
        L.add(9);
        L.add(7);
        L.add(6);
        L.add(2);
        L.add(13);
        L.add(4);
        L.add(16);
        
        // criar uma pilha e empilhar cada elemento da lista
        Stack<Integer> pilha = new Stack<Integer>();
        for (int i = 0; i < L.size(); i++) {
            pilha.push(L.get(i));
        }
        
        // desempilhar e exibir cada elemento da pilha
        while (!pilha.empty()) {
            System.out.print(pilha.pop() + " ");
        }
    }
}