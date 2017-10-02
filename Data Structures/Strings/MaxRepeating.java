class MaxRepeating
{
	public static char countMaxChar(String str)
	{
		int len = str.length();
		int count = 0;
		char res = str.charAt(0);
		int count_curr = 1;

		for(int i=0; i<len; i++)
		{
			if(i < len-1 && str.charAt(i) == str.charAt(i+1))
				count_curr++;
			else
			{
				if(count_curr > count)
				{
					count = count_curr;
					res = str.charAt(i);
				}
				count_curr = 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String string = "aaccdeeeeerdssee";
		System.out.println(countMaxChar(string));
	}
}