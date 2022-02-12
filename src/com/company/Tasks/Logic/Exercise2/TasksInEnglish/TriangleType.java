package com.company.Tasks.Logic.Exercise2.TasksInEnglish;

import com.company.Helpers.InputValidate;
import com.company.Helpers.IntArrayHelper;

import java.util.Arrays;

public class TriangleType {
    public void task() {
        int [] edges = getEdges();
        if (isTriangle(edges)) {
            System.out.println("Its "+triangleType(edges) + " triangle.");
        }else {
            System.out.println("This isn't triangle, input correct edges");
            new TriangleType().task();
        }
    }
    public int[] getEdges() {
        int[] edges = new int[0];
        int a = new InputValidate().isInt("Input first length edge of triangle: ", null, true, false, null, false, null, false, false);
        int b = new InputValidate().isInt("Input second length edge of triangle: ", null, true, false, null, false, null, false, false);
        int c = new InputValidate().isInt("Input last length edge of triangle: ", null, true, false, null, false, null, false, false);
        edges = new IntArrayHelper().addElement(b, edges);
        edges = new IntArrayHelper().addElement(a, edges);
        edges = new IntArrayHelper().addElement(c, edges);
        return edges;
    }
    public boolean isTriangle(int[] edges) {
        Arrays.sort(edges);
        return (edges[0] + edges[1] > edges[2]);
    }
    public String triangleType(int[] edges) {
        String type;
        int pairs = findPair(edges);
        if (pairs == 3) {
            type = "Equilateral";
        }else if (pairs == 1) {
            type = "Isosceles";
        }else {
           type = "Scalene";
        }
        return type;
    }
    public int findPair(int[] edges)   {
        int edge1 = edges[0];
        int edge2 = edges[1];
        int edge3 = edges[2];
        int pair = 0;
        if (edge1 == edge2)  {
            pair++;
        }
        if (edge1 == edge3) {
            pair++;
        }
        if (edge3 == edge2) {
            pair++;
        }
        return pair;
    }
}