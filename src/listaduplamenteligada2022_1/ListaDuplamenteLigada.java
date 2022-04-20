package listaduplamenteligada2022_1;

public class ListaDuplamenteLigada {
    Celula inicio;
    
    public void inserirNoInicio( String dado ) {
        Celula p = new Celula();
        p.dado = dado;
        p.ant = null;
        p.prox = inicio;
        if (inicio != null) inicio.ant = p;
        inicio = p;
    }
    
    public void imprimir() {
        System.out.print("[");
        for( Celula p = inicio; p != null; p = p.prox ) {
            System.out.print(p.dado + " ");
        }
        System.out.println("]");
    }
    
    public Celula buscar( String dado ) {
        for( Celula p = inicio; p != null; p = p.prox ) {
            if ( p.dado.equals(dado)) {
                return p;
            }
        }
        return null;
    }
    
    // algoritmo O(n)
    public void inserirEmOrdem( String dado ) {
        Celula p, q, r=null;
        
        if ( inicio != null ) {
            p = inicio;
            while(p != null && dado.compareTo(p.dado)>0) {
                if ( p.prox == null ) {
                    r = p;
                }
                p = p.prox;
            }
            q = new Celula();
            q.dado = dado;
            q.prox = p;
            if ( p != null ) {
                q.ant = p.ant;
                p.ant = q;
            } else {
                q.ant = r;
            }
            if ( q.ant != null ) q.ant.prox = q;
            if ( p == inicio ) {
                inicio = q;
            }
        } else {
            inserirNoInicio(dado);
        }
    }
    
    public void excluir( Celula p ) {
        if ( p.ant != null ) {
            p.ant.prox = p.prox;
        } else {
            inicio = p.prox;
        }
        if ( p.prox != null ) {
            p.prox.ant = p.ant;
        }
    }
}
