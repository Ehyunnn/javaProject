package test.com;

public class HwsVO {

	int num;
	String type;
	String title;
	int price;
	String code;
	int total;
	boolean have;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isHave() {
		return have;
	}

	public void setHave(int total) {
		if (total > 0) {
			have = true;
		} else {
			have = false;
		}
	}
}
