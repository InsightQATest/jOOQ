/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_937 extends org.jooq.impl.TableImpl<org.jooq.test.firebird.generatedclasses.tables.records.T_937Record> {

	private static final long serialVersionUID = 1557020952;

	/**
	 * The singleton instance of T_937
	 */
	public static final org.jooq.test.firebird.generatedclasses.tables.T_937 T_937 = new org.jooq.test.firebird.generatedclasses.tables.T_937();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.firebird.generatedclasses.tables.records.T_937Record> getRecordType() {
		return org.jooq.test.firebird.generatedclasses.tables.records.T_937Record.class;
	}

	/**
	 * The table column <code>T_937.T_937</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.T_937Record, java.lang.Integer> T_937_ = createField("T_937", org.jooq.impl.SQLDataType.INTEGER, this);

	public T_937() {
		super("T_937");
	}

	public T_937(java.lang.String alias) {
		super(alias, null, org.jooq.test.firebird.generatedclasses.tables.T_937.T_937);
	}

	@Override
	public org.jooq.test.firebird.generatedclasses.tables.T_937 as(java.lang.String alias) {
		return new org.jooq.test.firebird.generatedclasses.tables.T_937(alias);
	}
}
