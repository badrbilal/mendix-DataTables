// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package datatablestestmodule.proxies;

public class ImportData
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject importDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DataTablesTestModule.ImportData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		JSON("JSON"),
		datalist("DataTablesTestModule.datalist");

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

	public ImportData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DataTablesTestModule.ImportData"));
	}

	protected ImportData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject importDataMendixObject)
	{
		if (importDataMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DataTablesTestModule.ImportData", importDataMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DataTablesTestModule.ImportData");

		this.importDataMendixObject = importDataMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ImportData.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static datatablestestmodule.proxies.ImportData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return datatablestestmodule.proxies.ImportData.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static datatablestestmodule.proxies.ImportData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new datatablestestmodule.proxies.ImportData(context, mendixObject);
	}

	public static datatablestestmodule.proxies.ImportData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return datatablestestmodule.proxies.ImportData.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of JSON
	 */
	public final java.lang.String getJSON()
	{
		return getJSON(getContext());
	}

	/**
	 * @param context
	 * @return value of JSON
	 */
	public final java.lang.String getJSON(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.JSON.toString());
	}

	/**
	 * Set value of JSON
	 * @param json
	 */
	public final void setJSON(java.lang.String json)
	{
		setJSON(getContext(), json);
	}

	/**
	 * Set value of JSON
	 * @param context
	 * @param json
	 */
	public final void setJSON(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String json)
	{
		getMendixObject().setValue(context, MemberNames.JSON.toString(), json);
	}

	/**
	 * @return value of datalist
	 */
	public final java.util.List<datatablestestmodule.proxies.Person> getdatalist() throws com.mendix.core.CoreException
	{
		return getdatalist(getContext());
	}

	/**
	 * @param context
	 * @return value of datalist
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<datatablestestmodule.proxies.Person> getdatalist(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<datatablestestmodule.proxies.Person> result = new java.util.ArrayList<datatablestestmodule.proxies.Person>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.datalist.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(datatablestestmodule.proxies.Person.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of datalist
	 * @param datalist
	 */
	public final void setdatalist(java.util.List<datatablestestmodule.proxies.Person> datalist)
	{
		setdatalist(getContext(), datalist);
	}

	/**
	 * Set value of datalist
	 * @param context
	 * @param datalist
	 */
	public final void setdatalist(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<datatablestestmodule.proxies.Person> datalist)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (datatablestestmodule.proxies.Person proxyObject : datalist)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.datalist.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return importDataMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final datatablestestmodule.proxies.ImportData that = (datatablestestmodule.proxies.ImportData) obj;
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
		return "DataTablesTestModule.ImportData";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}