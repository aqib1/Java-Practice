
public class MyList<T extends Number & Comparable<T>>{
private T filed;
public T getFiled() {
	return filed;
}
public void setFiled(T filed) {
	this.filed = filed;
}
}
