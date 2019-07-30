package com.ecw;

public class Calculator {

	
	private String pattern = "[\\n|,]";
	
	public int add(String str)
	{
		int nResult = 0;
		boolean bContinueExcecution = true;

		if(null == str || str.length() == 0)
		{
			nResult = 0;
			bContinueExcecution = false;
		}

		if(bContinueExcecution)
		{
			if(str.indexOf(",") > 0)
			{
				nResult = getResultBasedonNumber(str, nResult);
			}
			else
			{
				int number = 0;
				number = Integer.parseInt(str);
				nResult = nResult + number;
			}

		}
		return nResult;
	}

	private int getResultBasedonNumber(String str, int nResult) {
		String[] arrOfStr = str.split(pattern);
		int nNumber = 0;
		for(int ii = 0; ii<arrOfStr.length; ii++)
		{
			nNumber = 0;
			nNumber = Integer.parseInt(arrOfStr[ii]);
			nResult = nResult + nNumber;
		}
		return nResult;
	}
	
	
}
