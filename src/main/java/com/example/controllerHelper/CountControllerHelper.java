package com.example.controllerHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountControllerHelper
{
    public Map<String, Object> getModel(Map<String, Object> model, double[][] count)
    {

        HashMap<String, Double> aminoMap = new HashMap<String, Double>();
        aminoMap.put("Glycine", count[0][0]);
        aminoMap.put("Alanine", count[0][1]);
        aminoMap.put("Valine", count[0][2]);
        aminoMap.put("Leucine", count[0][3]);
        aminoMap.put("Isoleucine", count[0][4]);
        aminoMap.put("Serine", count[0][5]);
        aminoMap.put("Threonine", count[0][6]);
        aminoMap.put("Aspartic Acid", count[0][7]);
        aminoMap.put("Glutamic Acid", count[0][8]);
        aminoMap.put("Asparagine", count[0][9]);
        aminoMap.put("Glutamine", count[0][10]);
        aminoMap.put("Lysine", count[0][11]);
        aminoMap.put("Arginine", count[0][12]);
        aminoMap.put("Cysteine", count[0][13]);
        aminoMap.put("Methionine", count[0][14]);
        aminoMap.put("Phenylalanine", count[0][15]);
        aminoMap.put("Tyrosine", count[0][16]);
        aminoMap.put("Tryptophan", count[0][17]);
        aminoMap.put("Histidine", count[0][18]);
        aminoMap.put("Proline", count[0][19]);

        HashMap<String, Integer> numeroMap = new HashMap<String, Integer>();
        numeroMap.put("Glycine", (int) count[1][0]);
        numeroMap.put("Alanine", (int) count[1][1]);
        numeroMap.put("Valine", (int) count[1][2]);
        numeroMap.put("Leucine", (int) count[1][3]);
        numeroMap.put("Isoleucine", (int) count[1][4]);
        numeroMap.put("Serine", (int) count[1][5]);
        numeroMap.put("Threonine", (int) count[1][6]);
        numeroMap.put("Aspartic Acid", (int) count[1][7]);
        numeroMap.put("Glutamic Acid", (int) count[1][8]);
        numeroMap.put("Asparagine", (int) count[1][9]);
        numeroMap.put("Glutamine", (int) count[1][10]);
        numeroMap.put("Lysine", (int) count[1][11]);
        numeroMap.put("Arginine", (int) count[1][12]);
        numeroMap.put("Cysteine", (int) count[1][13]);
        numeroMap.put("Methionine", (int) count[1][14]);
        numeroMap.put("Phenylalanine", (int) count[1][15]);
        numeroMap.put("Tyrosine", (int) count[1][16]);
        numeroMap.put("Tryptophan", (int) count[1][17]);
        numeroMap.put("Histidine", (int) count[1][18]);
        numeroMap.put("Proline", (int) count[1][19]);


        List<Map.Entry<String, Double>> testEntryList = new ArrayList<>(aminoMap.entrySet());
        testEntryList.sort(Map.Entry.comparingByValue());

        List<Map.Entry<String, Integer>> testEntryList2 = new ArrayList<>(numeroMap.entrySet());
        testEntryList2.sort(Map.Entry.comparingByValue());
        int numberAminoAcids = 20;

        for(Map.Entry<String, Integer> aminoAcid: testEntryList2)
        {
            if (numberAminoAcids >= 1)
            {
                if (numberAminoAcids == 1 &&  !(aminoAcid.getValue() > 0))
                    break;
                model.put("quantity" + numberAminoAcids, aminoAcid.getValue());
                numberAminoAcids--;
            }
            else
            {
                break;
            }
        }

        numberAminoAcids = 20;
        for(Map.Entry<String, Double> aminoAcid: testEntryList)
        {
            if (numberAminoAcids >=1){
                if(numberAminoAcids == 1 && (aminoAcid.getValue().isNaN() || !(aminoAcid.getValue() > 0)))
                    break;
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
