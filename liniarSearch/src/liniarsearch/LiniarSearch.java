/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liniarsearch;

import javax.swing.JOptionPane;

/**
 *
 * @author Christo
 */
public class LiniarSearch {
    
    public static int linearSearch(int[] a, int target){
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target){
            index=i;
            break;
        }
        }
   
    return index;}

   
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        int target = Integer.parseInt(JOptionPane.showInputDialog("Enter a Traget Number below 9 "));
        int position = linearSearch(a,target);
        System.out.println("Position ="+ position);
    }


    
}
