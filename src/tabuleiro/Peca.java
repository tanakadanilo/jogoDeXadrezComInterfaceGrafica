package tabuleiro;

public abstract class Peca {

    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        this.posicao = null;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public abstract boolean[][] movimentosPossiveis();

    public boolean podeMover(Posicao posicao) {
        return movimentosPossiveis()[posicao.getLinha()][posicao.getColuna()];
        // chamou o m?todo para ver todos os movimentos poss?veis e depois viu se o
        // movimento pedido est? incluido nas respostas do m?todo
    }

    public boolean existeMovimentoPossivel() {
        boolean[][] movimentos = movimentosPossiveis();
        for (boolean[] temp : movimentos) {
            for (boolean i : temp) {// caso exista algum movimento poss?vel
                if (i) {
                    return true;
                }
            }
        }
        return false;
    }
}
