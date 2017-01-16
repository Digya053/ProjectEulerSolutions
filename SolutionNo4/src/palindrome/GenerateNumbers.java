package palindrome;

public class GenerateNumbers
{
	public void createDigit()
	{
		String mul;
		int length;
		int palindromeNo = 0;

		for (int count1 = 100; count1<=999; count1++)
		{
			for (int count2 = 100; count2<=999; count2++)
			{
				int multiply = count1*count2;
				mul = "" + multiply;
				length = mul.length();

				for(int x = 1; x<=length/2 ; x++)
				{
					if (mul.charAt(x-1) == mul.charAt(length-(x)) && (x)!=length/2){
						continue;

					}

					else if (mul.charAt(x-1) != mul.charAt(length -(x)))
					{
						break;
					}

					else if (mul.charAt(x-1) == mul.charAt(length-(x)) && (x)== (length/2))
					{
						if(palindromeNo<multiply)
						{
							palindromeNo = multiply;
							continue;
						}

						else
						{
							continue;
						}
					}
				}
			}
		}
		System.out.println("The largest palindrome is " + palindromeNo);
	}
}




