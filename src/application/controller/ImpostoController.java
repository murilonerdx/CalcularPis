package application.controller;

import application.model.Imposto;
import application.view.TelaImposto;
import application.view.TelaPis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImpostoController implements ActionListener {
    private Imposto model;
    private TelaImposto tela;

    @Override
    public void actionPerformed(ActionEvent e) {
        model.calcularImposto(tela.getValor());
    }

    public ImpostoController(Imposto model, TelaImposto tela){
        this.model = model;
        this.tela = tela;
    }
}
