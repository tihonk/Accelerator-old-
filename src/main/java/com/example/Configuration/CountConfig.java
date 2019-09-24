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
            if (newChar == 'G'){ g++; }
            if (newChar == 'A'){ a++; }
            if (newChar == 'V'){ v++; }
            if (newChar == 'L'){ l++; }
            if (newChar == 'I'){ i++; }
            if (newChar == 'S'){ s++; }
            if (newChar == 'T'){ t++; }
            if (newChar == 'D'){ d++; }
            if (newChar == 'E'){ e++; }
            if (newChar == 'N'){ n++; }
            if (newChar == 'Q'){ q++; }
            if (newChar == 'K'){ k++; }
            if (newChar == 'R'){ r++; }
            if (newChar == 'C'){ c++; }
            if (newChar == 'M'){ m++; }
            if (newChar == 'F'){ f++; }
            if (newChar == 'Y'){ y++; }
            if (newChar == 'W'){ w++; }
            if (newChar == 'H'){ h++; }
            if (newChar == 'P'){ p++; }
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
