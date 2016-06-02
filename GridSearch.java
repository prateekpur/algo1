package algo1;

//Problem https://www.hackerrank.com/challenges/the-grid-search
public class GridSearch {
	
	public static void main (String args[])	{
		String inp[] = new String[10];
		inp[0] = new String("7283455864");
		inp[1] = new String("6731158619");
		inp[2] = new String("8988242643");
		inp[3] = new String("3830589324");;
		inp[4] = new String("2295059505");
		inp[5] = new String("5633843845");
		inp[6] = new String("6473533530");
		inp[7] = new String("7053106601");
		inp[8] = new String("0834282956");
		inp[9] = new String("4607924137");
		
		String mat[] = new String[3];
		mat[0] = new String("9505");
		mat[1] = new String("3845");
		mat[2] = new String("3530");
		
		if(search(inp, mat))	{
			System.out.println("YES");
		}	else	{
			System.out.println("NO");
		}
	}
	
	public static boolean search(String[] inp, String[] match){
		boolean res = true;
		for (int i = 0; i < inp.length; ++i)	{
			res = false;
			int index = 0;
			for (int k = 0; k < inp[i].length() && index != -1; ++k)	{
				index = inp[i].indexOf(match[0], k);
				if (index == -1)	{
					res = false;
				}
				if (inp[i].indexOf(match[0], k) != -1)	{
					res = true;
					index = inp[i].indexOf(match[0], k);
					for (int z = 1; z < match.length; ++z)	{
						if (i + z >= inp.length)	{
							res = false;
							break;
						}
						if (!inp[i+z].substring(index).startsWith(match[z]))	{
							res = false;
							break;
						}
					}
				}
				if (res)	{
					return true;
				}
			}
		}
		return false;
	}
}
