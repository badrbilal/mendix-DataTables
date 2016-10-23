// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package datatablesexportdata.proxies;

public class DataTablesExportDocument extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DataTablesExportData.DataTablesExportDocument";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents");

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

	public DataTablesExportDocument(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DataTablesExportData.DataTablesExportDocument"));
	}

	protected DataTablesExportDocument(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dataTablesExportDocumentMendixObject)
	{
		super(context, dataTablesExportDocumentMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("DataTablesExportData.DataTablesExportDocument", dataTablesExportDocumentMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DataTablesExportData.DataTablesExportDocument");
	}

	/**
	 * @deprecated Use 'DataTablesExportDocument.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static datatablesexportdata.proxies.DataTablesExportDocument initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return datatablesexportdata.proxies.DataTablesExportDocument.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static datatablesexportdata.proxies.DataTablesExportDocument initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new datatablesexportdata.proxies.DataTablesExportDocument(context, mendixObject);
	}

	public static datatablesexportdata.proxies.DataTablesExportDocument load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return datatablesexportdata.proxies.DataTablesExportDocument.initialize(context, mendixObject);
	}

	public static java.util.List<datatablesexportdata.proxies.DataTablesExportDocument> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<datatablesexportdata.proxies.DataTablesExportDocument> result = new java.util.ArrayList<datatablesexportdata.proxies.DataTablesExportDocument>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DataTablesExportData.DataTablesExportDocument" + xpathConstraint))
			result.add(datatablesexportdata.proxies.DataTablesExportDocument.initialize(context, obj));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final datatablesexportdata.proxies.DataTablesExportDocument that = (datatablesexportdata.proxies.DataTablesExportDocument) obj;
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
		return "DataTablesExportData.DataTablesExportDocument";
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
