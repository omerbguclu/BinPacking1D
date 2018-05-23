import java.util.ArrayList;

public class main {
	boolean is = false;

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> order = new ArrayList<Integer>();

		l.add(60);
		l.add(50);
		l.add(30);
		l.add(45);
		l.add(15);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(60);

		main m = new main();
		BinPacking b = new BinPacking();
		m.SortListDescending(l);
		b.binpack(l, order, 180);
		m.SortListAscending(order);
		m.ShowList(order);
		m.ShowList(l);

	}

	public main() {

	}


	public void SortListAscending(ArrayList<Integer> a) {
		int size = a.size();
		int k;
		for (int i = size; i >= 0; i--) {
			for (int j = 0; j < size - 1; j++) {
				k = j + 1;
				if (a.get(j) > a.get(k)) {
					a.set(j, a.set(k, a.get(j)));
				}
			}
		}
	}

	public void SortListDescending(ArrayList<Integer> a) {
		int size = a.size();
		int k;
		for (int i = size; i >= 0; i--) {
			for (int j = 0; j < size - 1; j++) {
				k = j + 1;
				if (a.get(j) < a.get(k)) {
					a.set(j, a.set(k, a.get(j)));
				}
			}
		}
	}

	public void ShowList(ArrayList<Integer> a) {
		for (Integer str : a) {
			System.out.println(str);
		}
	}

	public boolean isIs() {
		return is;
	}

	public void setIs(boolean is) {
		this.is = is;
	}

}
