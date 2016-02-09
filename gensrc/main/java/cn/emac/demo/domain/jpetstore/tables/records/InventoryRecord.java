/**
 * This class is generated by jOOQ
 */
package cn.emac.demo.domain.jpetstore.tables.records;


import cn.emac.demo.domain.jpetstore.tables.Inventory;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Inventory
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InventoryRecord extends UpdatableRecordImpl<InventoryRecord> implements Record2<String, Integer> {

	private static final long serialVersionUID = 1009055132;

	/**
	 * Setter for <code>jpetstore.inventory.itemid</code>.
	 */
	public void setItemid(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>jpetstore.inventory.itemid</code>.
	 */
	public String getItemid() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>jpetstore.inventory.qty</code>.
	 */
	public void setQty(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>jpetstore.inventory.qty</code>.
	 */
	public Integer getQty() {
		return (Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, Integer> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, Integer> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Inventory.INVENTORY.ITEMID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Inventory.INVENTORY.QTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getItemid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getQty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InventoryRecord value1(String value) {
		setItemid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InventoryRecord value2(Integer value) {
		setQty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InventoryRecord values(String value1, Integer value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InventoryRecord
	 */
	public InventoryRecord() {
		super(Inventory.INVENTORY);
	}

	/**
	 * Create a detached, initialised InventoryRecord
	 */
	public InventoryRecord(String itemid, Integer qty) {
		super(Inventory.INVENTORY);

		setValue(0, itemid);
		setValue(1, qty);
	}
}
