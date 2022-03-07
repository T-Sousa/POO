package com.lista1.ex2;

public class Lampada {
	int qntClicks;
	boolean estado;

	void clickInterruptor() {
		if (this.qntClicks < 7) {
			this.qntClicks++;
			mudarEstado();
		}else 
			this.estado = false;
	}

	void mudarEstado() {
		if (this.estado == true)
			this.estado = false;
		else 
			this.estado = true;
	}

	boolean getEstado() {
		return this.estado;
	}

}

//Exerc�cio 1.2.Implemente uma classe L�mpada. Toda l�mpada pos-sui um estado (on/off).
//Sabe-se que as l�mpadas podem ter seu estadotrocado (click do interruptor). Ser� necess�rio 
//tamb�m uma funcionali-dade para checar o estado atual da l�mpada. Uma l�mpada estraga ap�s uma 
//quantidade de clicks (o click n�o troca mais o estado deixando-aeternamente em off) e esta 
//depende da l�mpada. Implemente esta situa��o e seu teste.