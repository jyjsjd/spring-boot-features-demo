/**
 * This class is generated by jOOQ
 */
package cn.emac.demo.petstore.domain.tables.pojos;


import javax.annotation.Generated;
import java.io.Serializable;


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
public class Inventory implements Serializable {

	private static final long serialVersionUID = -1525921359;

	private String  itemid;
	private Integer qty;

	public Inventory() {}

	public Inventory(Inventory value) {
		this.itemid = value.itemid;
		this.qty = value.qty;
	}

	public Inventory(
		String  itemid,
		Integer qty
	) {
		this.itemid = itemid;
		this.qty = qty;
	}

	public String getItemid() {
		return this.itemid;
	}

	public Inventory setItemid(String itemid) {
		this.itemid = itemid;
		return this;
	}

	public Integer getQty() {
		return this.qty;
	}

	public Inventory setQty(Integer qty) {
		this.qty = qty;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Inventory (");

		sb.append(itemid);
		sb.append(", ").append(qty);

		sb.append(")");
		return sb.toString();
	}
}