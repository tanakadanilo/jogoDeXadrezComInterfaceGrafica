/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xadrez;

import tabuleiro.Posicao;

/**
 *
 * @author Aluno
 */
public class Movimento {

    private Posicao posicaoInicio;
    private Posicao posicaoDestino;
    private PecaXadrez pecaMovida;
    private PecaXadrez pecaFinal;// * caso tenha promovido um peão,para qual peça ele foi promovido
    private PecaXadrez pecaCapturada;
}
