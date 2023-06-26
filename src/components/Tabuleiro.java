package components;

public class Tabuleiro {
    private char[][] matriz;
    private int tamanho;

    public Tabuleiro(int tamanho) {
        this.matriz = new char[tamanho][tamanho];
        this.tamanho = tamanho;
    }

    public void adicionarEmbarcacao(Posicao posicao) { //recebe do arraylist que esta atrelado aos documento csv
        int linhaInicial = posicao.getLinhaInicial();
        int colunaInicial = posicao.getColunaInicial();
        char caracter = posicao.getCaracter();
        int horizontal = 0;
        int vertical = 0;
        int tamanho = posicao.getTamanho();

        matriz[linhaInicial][colunaInicial] = caracter;

        if( Character.toUpperCase(posicao.getDirecao()) == 'H') {
            horizontal = 1;
        } else {
            vertical = 1;
        }
        for( int i = 0; i< tamanho; i++) {
            int linha = linhaInicial + (i * vertical);
            int coluna = colunaInicial + (i * horizontal);
            matriz[linha][coluna] = caracter; //define a nova matriz com as posições vindas do csv
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public char[][] getMatriz() {
        return this.matriz;
    }

    public int getPontuacao() {
        return 0;
    }

    public boolean gameOver(){
        return false;
    }
}

