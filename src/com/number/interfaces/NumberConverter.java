package com.number.interfaces;
/**
 * 
 * @author Srinivas
 *
 */
public class NumberConverter {

	public NumberConverter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumberToWord nc = new NumberToWordImpl();
		String converterno = nc.quatioentNumber(65778787);
		System.out.println("converterno :"+converterno);
		System.out.println(nc.getNumberConverterBO().getListDigitInc().add("Trilian"));
		System.out.println(nc.getNumberConverterBO().getListDigitInc());
		
	}

}
