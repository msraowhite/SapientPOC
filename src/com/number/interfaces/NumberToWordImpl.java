package com.number.interfaces;
/**
 * 
 * @author Srinivas
 *
 */


public class NumberToWordImpl implements NumberToWord {
	NumberConverterBO nBO = null;

	public NumberToWordImpl() {
		//nBO = new NumberConverterBO();
		nBO = new NumberConverterBO();
	}

	@Override
	public NumberConverterBO getNumberConverterBO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numberCount(int num) {
		// System.out.println(findmap);
		int r;
		int cnt = 0;
		if(num==0){
			return -1;
		}
		while (num > 0) {
			r = num % 10;
			cnt++;
			num = num / 10;
		}
		// System.out.println(cnt);
		return cnt;
	}

	@Override
	public String numberwordconverter(int convertno) {
		int len, q = 0, r = 0;
		String ltr = " ";
		String Str = "Rupees";

		if (convertno <= 0)
			System.out.println("Zero or Negative number not for conversion");

		if (convertno > 0) {
			len = numberCount(convertno);
			if (len == 1) {
				// System.out.println(unitdo.toString());
				Str = Str + nBO.getUnitdo()[convertno];
			} else if (len == 2) {
				ltr = twonum(convertno);
				Str = Str + ltr;
			} else if (len == 3) {
				ltr = threenum(convertno);
				Str = Str + ltr;
			} else {
				Str = quatioentNumber(convertno);
			}
		}

		return Str;
	}

	@Override
	public String quatioentNumber(int qnumber) {
		int len, q = 0, r = 0;
		String ltr = " ";
		String Str = "Rupees";
		int num = qnumber;

		if (num <= 0)
			return "";
			System.out.println("Zero or Negative number not for conversion");

		while (num > 0) {

			len = numberCount(num);
			System.out.println(len);
			if (len >= 4) {
				q = num / nBO.getFindmap().get(len);
				r = num % nBO.getFindmap().get(len);
				ltr = twonum(q);
				Str = Str
						+ ltr
						+ nBO.getListDigitInc().get(
								nBO.getFindDigitmap().get(len));
				num = r;
			}
			if (len == 3) {
				r = num;
				ltr = threenum(r);
				Str = Str + ltr;
				num = 0;
				break;
			}

			if (len == 2) {

				ltr = twonum(num);
				Str = Str + ltr;
				num = 0;
				break;
			}
			if (len == 1) {
				Str = Str + nBO.getUnitdo()[num];
				num = 0;
			}

			if (num == 0)
				System.out.println(Str + " Only");
		}
		return Str;
	}



	public String twonum(int numq) {

		int numr, nq;
		String ltr = "";

		if(numq <= 0)
			return "";
		nq = numq / 10;
		numr = numq % 10;

		if (numq > 19) {
			ltr = ltr + nBO.getTens()[nq] + nBO.getUnitdo()[numr];
		} else {
			ltr = ltr + nBO.getUnitdo()[numq];
		}

		return ltr;
	}

	// Function for Conversion of three digit

	public String threenum(int numq) {
		int numr, nq;
		String ltr = "";
		if(numq <= 0)
			return "";
		nq = numq / 100;
		numr = numq % 100;

		if (numr == 0) {
			ltr = ltr + nBO.getUnitdo()[nq] + nBO.getListDigitInc().get(1);
		} else {
			ltr = ltr + nBO.getUnitdo()[nq] + nBO.getListDigitInc().get(1)
					+ " and" + twonum(numr);
		}
		return ltr;

	}

}
