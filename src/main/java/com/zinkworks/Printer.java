package com.zinkworks;

public class Printer {
    private int toner;
    private int pages;
    private boolean isDuplex;

    public Printer(int toner, boolean isDuplex) {
        if (toner > -1 && toner <= 100) {
            this.toner = toner;
        } else {
            this.toner = -1;
        }
        this.pages = 0;
        this.isDuplex = isDuplex;
    }

    public int fillToner(int tonerAmount) {
        int amount = -1;
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.toner + tonerAmount <= 100) {
                amount = this.toner += tonerAmount;
            }
        }
        return amount;
    }

    public int print(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pages += pagesToPrint;
        return pagesToPrint;

    }

    public int getPages() {
        return pages;
    }
}
