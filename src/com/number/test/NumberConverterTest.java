package com.number.test;

/**
 * @author Srinivas
 * 
 */
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import com.number.interfaces.NumberConverterBO;
import com.number.interfaces.NumberToWord;
import com.number.interfaces.NumberToWordImpl;

public class NumberConverterTest {

	public NumberConverterTest() {
		// TODO Auto-generated constructor stub
	}

	@Test(expected = NullPointerException.class)
	public void testNumberConverterBo() {
		NumberToWord nc = new NumberToWordImpl();
		NumberConverterBO nBO = nc.getNumberConverterBO();
		assertNotNull("NumberConverterBO Object Cannot be null", nBO);

	}

	@Test
	public void testNumberConverterDigitmap() {
		NumberToWord nc = new NumberToWordImpl();
		NumberConverterBO nBO = nc.getNumberConverterBO();
		assertNotNull("Digitmap Object Cannot be null", nBO.getFindDigitmap());

	}

	@Test
	public void testNumberConverterFindmap() {
		NumberToWord nc = new NumberToWordImpl();
		NumberConverterBO nBO = nc.getNumberConverterBO();
		assertNotNull("Findmap Object Cannot be null", nBO.getFindmap());

	}

	@Test
	public void testNumberConverterListDigitInc() {
		NumberToWord nc = new NumberToWordImpl();
		NumberConverterBO nBO = nc.getNumberConverterBO();
		assertNotNull("ListDigitInc Object Cannot be null",
				nBO.getListDigitInc());

	}

	@Test
	public void testNumberConvertergetTens() {
		NumberToWord nc = new NumberToWordImpl();
		NumberConverterBO nBO = nc.getNumberConverterBO();
		assertNotNull("getTens Object Cannot be null", nBO.getTens());

	}

	@Test
	public void testNumberConvertergetUnitdo() {
		NumberToWord nc = new NumberToWordImpl();
		NumberConverterBO nBO = nc.getNumberConverterBO();
		assertNotNull("getUnitdo Object Cannot be null", nBO.getUnitdo());

	}

	@Test
	public void testnumberCount() {
		NumberToWord nc = new NumberToWordImpl();
		int len = nc.numberCount(0);
		Assert.assertTrue("The Input Param value must be greater than zero", len >= 0);
	}

	@Test
	public void testtwonum() {
		NumberToWord nc = new NumberToWordImpl();
		String len = nc.twonum(1);
		Assert.assertTrue("The Input Param value must be greater than zero ",
				len.length() > 1);
	}

	@Test
	public void testthreenum() {
		NumberToWord nc = new NumberToWordImpl();
		String len = nc.threenum(0);
		Assert.assertTrue("The Input Param value must be greater than zero ",
				len.length() > 1);
	}

	@Test
	public void testquatioentNumber() {
		NumberToWord nc = new NumberToWordImpl();
		String len = nc.quatioentNumber(0);
		Assert.assertTrue("The Input Param value must be greater than zero ",
				len.length() > 1);
	}

}
