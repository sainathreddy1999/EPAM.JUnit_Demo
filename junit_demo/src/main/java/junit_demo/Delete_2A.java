package junit_demo;

public class Delete_2A {

	public String delete(String string) 
	{
		String result="";
		char firstChar=string.charAt(0);
		if(string.length()>1)
		{
		  char secondChar=string.charAt(1);
			if(firstChar=='A')
			{
			
				if(secondChar=='A')
					result=string.substring(2);
			
				else
					result=string.substring(1);
			}
			else if(firstChar!='A' && secondChar=='A')
				result=string.substring(0, 1)+string.substring(2);
		    else
		    	result=string;
		}
		else if(firstChar=='A'&&string.length()==1)
			result=string.replace("A","");
		else if(firstChar==' '&&string.length()==1)
			result=string;
		return result; 
	}

	}


