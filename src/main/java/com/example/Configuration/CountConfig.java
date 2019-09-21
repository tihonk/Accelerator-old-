package com.example.Configuration;

import java.lang.reflect.Array;
import java.util.List;

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




    public double[] newConfig(String text){
        char [] charArray = text.toCharArray();
        double charLength = charArray.length;
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

        double[] newText =  new double[20];
        newText[0] = ge*100;
        newText[1] = ae*100;
        newText[2] = ve*100;
        newText[3] = le*100;
        newText[4] = ie*100;
        newText[5] = se*100;
        newText[6] = te*100;
        newText[7] = de*100;
        newText[8] = ee*100;
        newText[9] = ne*100;
        newText[10] = qe*100;
        newText[11] = ke*100;
        newText[12] = re*100;
        newText[13] = ce*100;
        newText[14] = me*100;
        newText[15] = fe*100;
        newText[16] = ye*100;
        newText[17] = we*100;
        newText[18] = he*100;
        newText[19] = pe*100;


//        String newText = ("GLY: " + ge*100+"% "+g+" pcs.   "+
//            "ALA: " + ae*100+"% "+a+" pcs.   "+
//            "VAL: " + ve*100+"% "+s+" pcs.   "+
//            "LEU: " + le*100+"% "+l+" pcs.   "+
//            "ILE: " + ie*100+"% "+i+" pcs.   "+
//            "SER: " + se*100+"% "+s+" pcs.   "+
//            "THR: " + te*100+"% "+t+" pcs.   "+
//            "ASP: " + de*100+"% "+d+" pcs.   "+
//            "ASN: " + ne*100+"% "+n+" pcs.   "+
//            "GLN: " + qe*100+"% "+q+" pcs.   "+
//            "LYS: " + ke*100+"% "+k+" pcs.   "+
//            "ARG: " + re*100+"% "+r+" pcs.   "+
//            "CYS: " + ce*100+"% "+c+" pcs.   "+
//            "MET: " + me*100+"% "+m+" pcs.   "+
//            "PHE: " + fe*100+"% "+f+" pcs.   "+
//            "TYR: " + ye*100+"% "+y+" pcs.   "+
//            "TRP: " + we*100+"% "+w+" pcs.   "+
//            "HIS: " + he*100+"% "+h+" pcs.   "+
//            "PRO: " + pe*100+"% "+p+" pcs.   ");
        return newText;
    }
}
