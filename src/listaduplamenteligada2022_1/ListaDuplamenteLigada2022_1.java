package listaduplamenteligada2022_1;
public class ListaDuplamenteLigada2022_1 {

    public static void main(String[] args) {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        lista.inserirEmOrdem("B");
        lista.inserirEmOrdem("Z");
        lista.inserirEmOrdem("S");
        lista.inserirEmOrdem("A");
        lista.inserirEmOrdem("M");
        lista.imprimir();
        Celula p = lista.buscar("Z");
        lista.excluir(p);
        lista.imprimir();
    }
    
}
