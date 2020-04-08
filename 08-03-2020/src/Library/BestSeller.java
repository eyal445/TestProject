package Library;

public class BestSeller extends Book {
private String summary;
private int worldcopies;
public BestSeller(int id, String name, double price, String summary, int worldcopies) {
	super(id, name, price);
	this.summary = summary;
	this.worldcopies = worldcopies;
}
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}
public int getWorldcopies() {
	return worldcopies;
}
public void setWorldcopies(int worldcopies) {
	this.worldcopies = worldcopies;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((summary == null) ? 0 : summary.hashCode());
	result = prime * result + worldcopies;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	BestSeller other = (BestSeller) obj;
	if (summary == null) {
		if (other.summary != null)
			return false;
	} else if (!summary.equals(other.summary))
		return false;
	if (worldcopies != other.worldcopies)
		return false;
	return true;
}
@Override
public String toString() {
	return "BestSeller [summary=" + summary + ", worldcopies=" + worldcopies + ", getName()=" + getName()
			+ ", getPrice()=" + getPrice() + "]";
}
}
