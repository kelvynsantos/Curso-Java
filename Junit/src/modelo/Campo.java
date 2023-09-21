package modelo;

import excecao.ExplosionException;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private  final int linha;
    private final int coluna;
    private boolean minado = false;
    private boolean aberto = false;
    private boolean marcado = false;
    private List<Campo> vizinhos = new ArrayList<>();
    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }
    boolean addVizinhos( Campo vizinho){
        boolean linhaDif = linha != vizinho.linha;
        boolean colunaDif = coluna != vizinho.coluna;
        boolean diagonal = linhaDif && colunaDif;
        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaCol = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaLinha + deltaCol;
        if(deltaGeral == 1 && !diagonal) {
            vizinhos.add(vizinho);
            return true;
        } else if (deltaGeral  == 2 && diagonal) {
            vizinhos.add(vizinho);
            return true;
        } else {
            return false;
        }
    }
    void alternarMarcado (){
        if(!aberto) {
            marcado = !marcado;
        }
    }
    boolean abrir(){
        if( !aberto && !marcado){
            aberto = true;
            if (minado){
                throw new ExplosionException();
            }
            if(safeVizi()){
                vizinhos.forEach(v -> v.abrir());
            }
            return true;
        } else {
        return false;
        }
    }
    boolean safeVizi(){

        return vizinhos.stream().noneMatch( v -> v.minado);
    }
    public boolean isMarcado(){
        return marcado;
    }
    void minar(){
        if(!minado) {
        minado = true;
    }}
    public boolean isAberto(){
        return aberto;
    }
    public boolean isFechado(){ return !isAberto();}
    public int getLinha(){ return linha;}
    public int getColuna(){return coluna;}

    public boolean isMinado(){
        return minado;
    }
    void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    boolean objetivoAlcancado(){
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return desvendado || protegido;
    }
    long minasNaVizinhanca(){
        return vizinhos.stream().filter(v -> v.minado).count();
    }
    void reiniciar() {
        aberto = false;
        minado = false;
        marcado = false;
    }
    public String toString(){
        if(marcado){
            return "X";
        } else if(aberto && minado) {
            return "*";
        } else if(aberto && minasNaVizinhanca() > 0){
            return Long.toString(minasNaVizinhanca());
        } else if(aberto) {
            return "";
        } else{
            return "?";
        }
    }
}
