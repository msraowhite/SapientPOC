package com.number.interfaces;
/**
 * 
 * @author Srinivas
 *
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class NumberConverterBO {
	String[] unitdo = { "", " One", " Two", " Three", " Four", " Five", " Six",
			" Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve",
			" Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen",
			" Eighteen", " Nineteen" };
	String[] tens = { "", "Ten", " Twenty", " Thirty", " Forty", " Fifty",
			" Sixty", " Seventy", " Eighty", " Ninety" };
	// String[] digit = { "", " Hundred", " Thousand", " Lakh", " Crore" };
	List<String> listDigitInc = new LinkedList<String>();

	// Defining variables q is quotient, r is remainder
	Map<Integer, Integer> findmap = new HashMap<Integer, Integer>();
	Map<Integer, Integer> findDigitmap = new HashMap<Integer, Integer>();

	public NumberConverterBO() {
		// TODO Auto-generated constructor stub
		findmap.put(4, 1000);
		findmap.put(5, 1000);
		findmap.put(6, 100000);
		findmap.put(7, 100000);
		findmap.put(8, 10000000);
		findmap.put(9, 10000000);

		findDigitmap.put(4, 2);
		findDigitmap.put(5, 2);
		findDigitmap.put(6, 3);
		findDigitmap.put(7, 3);
		findDigitmap.put(8, 4);
		findDigitmap.put(9, 4);
		listDigitInc.add("");
		listDigitInc.add(" Hundred");
		listDigitInc.add(" Thousand");
		listDigitInc.add(" Lakh");
		listDigitInc.add(" Crore");
	}

	public void setUnitdo(String[] unitdo) {
		this.unitdo = unitdo;
	}

	public void setTens(String[] tens) {
		this.tens = tens;
	}

	public void setListDigitInc(List<String> listDigitInc) {
		this.listDigitInc = listDigitInc;
	}

	public void setFindmap(Map<Integer, Integer> findmap) {
		this.findmap = findmap;
	}

	public void setFindDigitmap(Map<Integer, Integer> findDigitmap) {
		this.findDigitmap = findDigitmap;
	}

	public String[] getUnitdo() {
		if (unitdo != null)
			return unitdo;
		else
			return null;
	}

	public String[] getTens() {
		if (tens != null)
			return tens;
		else
			return null;

	}

	public List<String> getListDigitInc() {
		if(listDigitInc !=null)
					return listDigitInc;
				else
					return null;
	}

	public Map<Integer, Integer> getFindmap() {		
		if(findmap !=null)
			return findmap;
		else
			return null;
	}

	public Map<Integer, Integer> getFindDigitmap() {
		if(findDigitmap !=null)
			return findDigitmap;
		else
			return null;
		
	}

}
