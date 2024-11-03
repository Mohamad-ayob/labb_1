package inlämningsuppgift;

public class Räknar {
    private int rader = 0;
    private int textlengdth = 0;
    private String text;
    private int antalord = 0;



    public int raderplus() {
        rader++;
        return rader;
    }

    public void Textlengdthplus(String text) {
        textlengdth += text.replace(" ", "").length();
    }

    public void textantalord(String text) {
        antalord += text.split("\\s+").length;
    }



    public int getRader() {
        return rader;
    }

    public int getTextlengdth() {
        return textlengdth;
    }

    public int getAntalord() {
        return antalord;
    }




}
