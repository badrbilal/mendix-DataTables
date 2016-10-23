// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies;

public enum ValidationResult2
{
	NoInputParams(new String[][] { new String[] { "en_US", "NoInputParams" }, new String[] { "nl_NL", "NoInputParams" }, new String[] { "en_GB", "NoInputParams" }, new String[] { "en_ZA", "NoInputParams" } }),
	WrongNrOfInputParams(new String[][] { new String[] { "en_US", "WrongNrOfInputParams" }, new String[] { "nl_NL", "WrongNrOfInputParams" }, new String[] { "en_GB", "WrongNrOfInputParams" }, new String[] { "en_ZA", "WrongNrOfInputParams" } }),
	WrongReturnType(new String[][] { new String[] { "en_US", "WrongReturnType" }, new String[] { "nl_NL", "WrongReturnType" }, new String[] { "en_GB", "WrongReturnType" }, new String[] { "en_ZA", "WrongReturnType" } }),
	Valid(new String[][] { new String[] { "en_US", "Valid" }, new String[] { "nl_NL", "Geldig" }, new String[] { "en_GB", "Valid" }, new String[] { "en_ZA", "Valid" } });

	private java.util.Map<String,String> captions;

	private ValidationResult2(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
