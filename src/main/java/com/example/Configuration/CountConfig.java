package com.example.Configuration;

public class CountConfig {
    int g;
    int a;
    int v;
    int l;
    int i;
    int s;
    int t;
    int d;
    int e;
    int n;
    int q;
    int k;
    int r;
    int c;
    int m;
    int f;
    int y;
    int w;
    int h;
    int p;

    double ge;
    double ae;
    double ve;
    double le;
    double ie;
    double se;
    double te;
    double de;
    double ee;
    double ne;
    double qe;
    double ke;
    double re;
    double ce;
    double me;
    double fe;
    double ye;
    double we;
    double he;
    double pe;




    public double[][] newConfig(String text){
        char [] charArray = text.toCharArray();
        for(char newChar : charArray){
            if (newChar == 'G' || newChar == 'g'){ g++; }
            if (newChar == 'A' || newChar == 'a'){ a++; }
            if (newChar == 'V' || newChar == 'v'){ v++; }
            if (newChar == 'L' || newChar == 'l'){ l++; }
            if (newChar == 'I' || newChar == 'i'){ i++; }
            if (newChar == 'S' || newChar == 's'){ s++; }
            if (newChar == 'T' || newChar == 't'){ t++; }
            if (newChar == 'D' || newChar == 'd'){ d++; }
            if (newChar == 'E' || newChar == 'e'){ e++; }
            if (newChar == 'N' || newChar == 'n'){ n++; }
            if (newChar == 'Q' || newChar == 'q'){ q++; }
            if (newChar == 'K' || newChar == 'k'){ k++; }
            if (newChar == 'R' || newChar == 'r'){ r++; }
            if (newChar == 'C' || newChar == 'c'){ c++; }
            if (newChar == 'M' || newChar == 'm'){ m++; }
            if (newChar == 'F' || newChar == 'f'){ f++; }
            if (newChar == 'Y' || newChar == 'y'){ y++; }
            if (newChar == 'W' || newChar == 'w'){ w++; }
            if (newChar == 'H' || newChar == 'h'){ h++; }
            if (newChar == 'P' || newChar == 'p'){ p++; }
        }

        double charLength = g+a+v+l+i+s+t+d+e+n+q+k+r+c+m+f+y+w+h+p;

        ge = (double)g/charLength;
        ae = (double)a/charLength;
        ve = (double)v/charLength;
        le = (double)l/charLength;
        ie = (double)i/charLength;
        se = (double)s/charLength;
        te = (double)t/charLength;
        de = (double)d/charLength;
        ee = (double)e/charLength;
        ne = (double)n/charLength;
        qe = (double)q/charLength;
        ke = (double)k/charLength;
        re = (double)r/charLength;
        ce = (double)c/charLength;
        me = (double)m/charLength;
        fe = (double)f/charLength;
        ye = (double)y/charLength;
        we = (double)w/charLength;
        he = (double)h/charLength;
        pe = (double)p/charLength;

        double[][] newText =  new double[2][20];
        newText[0][0] = ge*100;
        newText[0][1] = ae*100;
        newText[0][2] = ve*100;
        newText[0][3] = le*100;
        newText[0][4] = ie*100;
        newText[0][5] = se*100;
        newText[0][6] = te*100;
        newText[0][7] = de*100;
        newText[0][8] = ee*100;
        newText[0][9] = ne*100;
        newText[0][10] = qe*100;
        newText[0][11] = ke*100;
        newText[0][12] = re*100;
        newText[0][13] = ce*100;
        newText[0][14] = me*100;
        newText[0][15] = fe*100;
        newText[0][16] = ye*100;
        newText[0][17] = we*100;
        newText[0][18] = he*100;
        newText[0][19] = pe*100;

        newText[1][0] = g;
        newText[1][1] = a;
        newText[1][2] = v;
        newText[1][3] = l;
        newText[1][4] = i;
        newText[1][5] = s;
        newText[1][6] = t;
        newText[1][7] = d;
        newText[1][8] = e;
        newText[1][9] = n;
        newText[1][10] = q;
        newText[1][11] = k;
        newText[1][12] = r;
        newText[1][13] = c;
        newText[1][14] = m;
        newText[1][15] = f;
        newText[1][16] = y;
        newText[1][17] = w;
        newText[1][18] = h;
        newText[1][19] = p;


        return newText;
    }
}
