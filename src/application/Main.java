package application;

import application.controller.ImpostoController;
import application.model.Pis;
import application.view.TelaPis;

public class Main {

    public static void main(String[] args) {
        Pis model = new Pis();
        TelaPis tela = new TelaPis();
        model.addObserver(tela);

        ImpostoController controller = new ImpostoController(model, tela);
        tela.addController(controller);

    }
}
