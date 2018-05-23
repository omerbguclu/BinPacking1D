import java.util.ArrayList;

public class BinPacking extends main {

	public BinPacking() {

	}

	public void binpack(ArrayList<Integer> o, ArrayList<Integer> a, int wanted) {
		int sum = 0;
		if (wanted > 0) {
			control(o, a, wanted);
			if (is) {
				return;
			}
			for (int i = 0; i < o.size(); i++) {
				sum += o.get(i);
				summing(o, a, wanted - sum, i + 1);
				if (is) {
					a.add(i);
					return;
				}
				for (int j = i; j < o.size(); j++) {
					if (i != j) {
						sum += o.get(j);
						summing(o, a, wanted - sum, j + 1);
						if (is) {
							a.add(i);
							a.add(j);
							return;
						}
						sum -= o.get(j);
					}
				}
				sum -= o.get(i);
				// "/////////////*******************////////////////////");
			}
			if (wanted != sum) {
				System.out.println("There is not an answer with quad summing method");
			}
		}

	}

	public void summing(ArrayList<Integer> o, ArrayList<Integer> a, int wanted, int loop) {
		int sum = 0;
		if (loop < o.size() && wanted > 0) {
			for (int i = loop; i < o.size(); i++) {
				if (wanted == o.get(i)) {
					a.add(i);
					is = true;
					return;
				}
				for (int j = loop; j < o.size(); j++) {
					if (i != j) {
						sum = o.get(i) + o.get(j);
						if (wanted != sum) {
							sum = 0;
						} else {
							a.add(i);
							a.add(j);
							is = true;
							return;
						}

					}
					// System.out.println("///////////////////////////////////");
				}
			}
			System.out.println("There is not an answer with binary summing method");
		}
	}

	public void control(ArrayList<Integer> o, ArrayList<Integer> a, int wanted) {
		for (int i = 0; i < o.size(); i++) {
			if (o.get(i) == wanted) {
				a.add(i);
				is = true;
				break;
			}

		}

	}

}
