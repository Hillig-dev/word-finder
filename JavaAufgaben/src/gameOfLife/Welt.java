package gameOfLife;

class Welt {
   
    public final int MXG;
    private Wesen[][] felder;
    private Oberflaeche oberflaeche;

    Welt(int MXG) { 
        
        this.MXG = MXG;
        felder = new Wesen[MXG][MXG];
        for (int lPos = 0; lPos < MXG; lPos++) {
                for (int bPos = 0; bPos < MXG; bPos++) {
                    if (Math.random() < 0.25) {
                        felder[lPos][bPos] = new Lebewesen(this, lPos, bPos); } 
                    else {
                        felder[lPos][bPos] = new Leerwesen(this, lPos, bPos); 
        } }}
        oberflaeche = new Oberflaeche(this);
        for (int lPos = 0; lPos < MXG; lPos++)  {
            for (int b = 0; b < MXG; b++) { felder[lPos][b].start();
        } }
        System.out.println("... und er sah, dass es gut war"); 
        }
    
private int lebt(int lPos, int bPos) {
    if (felder[lPos % MXG][bPos % MXG] instanceof Lebewesen)
        return 1;
    return 0;
}
int anzahlNachbarn(int lPos, int bPos) {
int l = lPos + MXG;
int b = bPos + MXG;
return lebt(l - 1, b - 1) + lebt(l - 1, b) + lebt(l - 1, b + 1)
+ lebt(l, b - 1) + lebt(l, b + 1) + lebt(l + 1, b - 1) + lebt(l + 1, b) + lebt(l + 1, b + 1);
}
void setWesen(int lPos, int bPos, Wesen wesen) {
    felder[lPos][bPos] = wesen; 
    oberflaeche.aktualisieren(lPos, bPos);
}

Wesen getWesen(int lPos, int bPos) {
    return felder[lPos][bPos];
    
} }