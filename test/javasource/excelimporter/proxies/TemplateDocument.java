// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies;

/**
 * The TemplateDocument acts as a file which can be used for two purposes, 1. generate a template, 2. Import the excel sheet using the associated template
 */
public class TemplateDocument extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ExcelImporter.TemplateDocument";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		TemplateDocument_Template("ExcelImporter.TemplateDocument_Template");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public TemplateDocument(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ExcelImporter.TemplateDocument"));
	}

	protected TemplateDocument(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject templateDocumentMendixObject)
	{
		super(context, templateDocumentMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("ExcelImporter.TemplateDocument", templateDocumentMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ExcelImporter.TemplateDocument");
	}

	/**
	 * @deprecated Use 'TemplateDocument.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static excelimporter.proxies.TemplateDocument initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return excelimporter.proxies.TemplateDocument.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static excelimporter.proxies.TemplateDocument initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new excelimporter.proxies.TemplateDocument(context, mendixObject);
	}

	public static excelimporter.proxies.TemplateDocument load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return excelimporter.proxies.TemplateDocument.initialize(context, mendixObject);
	}

	public static java.util.List<excelimporter.proxies.TemplateDocument> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<excelimporter.proxies.TemplateDocument> result = new java.util.ArrayList<excelimporter.proxies.TemplateDocument>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ExcelImporter.TemplateDocument" + xpathConstraint))
			result.add(excelimporter.proxies.TemplateDocument.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of TemplateDocument_Template
	 */
	public final excelimporter.proxies.Template getTemplateDocument_Template() throws com.mendix.core.CoreException
	{
		return getTemplateDocument_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of TemplateDocument_Template
	 */
	public final excelimporter.proxies.Template getTemplateDocument_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		excelimporter.proxies.Template result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TemplateDocument_Template.toString());
		if (identifier != null)
			result = excelimporter.proxies.Template.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TemplateDocument_Template
	 * @param templatedocument_template
	 */
	public final void setTemplateDocument_Template(excelimporter.proxies.Template templatedocument_template)
	{
		setTemplateDocument_Template(getContext(), templatedocument_template);
	}

	/**
	 * Set value of TemplateDocument_Template
	 * @param context
	 * @param templatedocument_template
	 */
	public final void setTemplateDocument_Template(com.mendix.systemwideinterfaces.core.IContext context, excelimporter.proxies.Template templatedocument_template)
	{
		if (templatedocument_template == null)
			getMendixObject().setValue(context, MemberNames.TemplateDocument_Template.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TemplateDocument_Template.toString(), templatedocument_template.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final excelimporter.proxies.TemplateDocument that = (excelimporter.proxies.TemplateDocument) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "ExcelImporter.TemplateDocument";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
