package com.example.controllerHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountControllerHelper
{
    public Map<String, Object> getModel(Map<String, Object> model, double[] count)
    {
//        double gly = count[0];
//        double ala = count[1];
//        double val = count[2];
//        double leu = count[3];
//        double ile = count[4];
//        double ser = count[5];
//        double thr = count[6];
//        double asp = count[7];
//        double glu = count[8];
//        double asn = count[9];
//        double gln = count[10];
//        double lys = count[11];
//        double arg = count[12];
//        double cys = count[13];
//        double met = count[14];
//        double phe = count[15];
//        double tyr = count[16];
//        double trp = count[17];
//        double his = count[18];
//        double pro = count[19];
//        model.put("gly", gly);
//        model.put("ala", ala);
//        model.put("val", val);
//        model.put("leu", leu);
//        model.put("ile", ile);
//        model.put("ser", ser);
//        model.put("thr", thr);
//        model.put("asp", asp);
//        model.put("glu", glu);
//        model.put("asn", asn);
//        model.put("gln", gln);
//        model.put("lys", lys);
//        model.put("arg", arg);
//        model.put("cys", cys);
//        model.put("met", met);
//        model.put("phe", phe);
//        model.put("tyr", tyr);
//        model.put("trp", trp);
//        model.put("his", his);
//        model.put("pro", pro);

        HashMap<String, Double> aminoMap = new HashMap<String, Double>();
        aminoMap.put("Glycine", count[0]);
        aminoMap.put("Alanine", count[1]);
        aminoMap.put("Valine", count[2]);
        aminoMap.put("Leucine", count[3]);
        aminoMap.put("Isoleucine", count[4]);
        aminoMap.put("Serine", count[5]);
        aminoMap.put("Threonine", count[6]);
        aminoMap.put("Aspartic Acid", count[7]);
        aminoMap.put("Glutamic Acid", count[8]);
        aminoMap.put("Asparagine", count[9]);
        aminoMap.put("Glutamine", count[10]);
        aminoMap.put("Lysine", count[11]);
        aminoMap.put("Arginine", count[12]);
        aminoMap.put("Cysteine", count[13]);
        aminoMap.put("Methionine", count[14]);
        aminoMap.put("Phenylalanine", count[15]);
        aminoMap.put("Tyrosine", count[16]);
        aminoMap.put("Tryptophan", count[17]);
        aminoMap.put("Histidine", count[18]);
        aminoMap.put("Proline", count[19]);


        List<Map.Entry<String, Double>> testEntryList = new ArrayList<>(aminoMap.entrySet());
        testEntryList.sort(Map.Entry.comparingByValue());
        int numberAminoAcids = 20;
        for(Map.Entry<String, Double> aminoAcid: testEntryList)
        {
            if (numberAminoAcids >=1){
                model.put("amino"+numberAminoAcids, aminoAcid.getValue());
                model.put("number"+numberAminoAcids, aminoAcid.getKey());
                numberAminoAcids--;
            } else {
                break;
            }
        }

//        System.out.println(testEntryList.get(19).getKey());


        return model;
    }
}
