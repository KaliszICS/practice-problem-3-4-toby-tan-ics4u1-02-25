import java.util.ArrayList;

public class PracticeProblem {

    public static void main(String[] args) {
        }

		public static int[] recaman(int n) {
			if (n <= 0) return new int[0];
	
			ArrayList<Integer> sequence = new ArrayList<>();
			sequence.add(0);
	
			build(n, 1, sequence);
	
			int[] result = new int[n];
			for (int i = 0; i < n; i++) {
				result[i] = sequence.get(i + 1);
			}
	
			return result;
		}
	
		private static void build(int n, int i, ArrayList<Integer> seq) {
			if (seq.size() > n) return;
	
			int prev = seq.get(seq.size() - 1);
			int next = prev - i;
	
			if (next > 0 && !seq.contains(next)) {
				seq.add(next);
			} else {
				seq.add(prev + i);
			}
	
			build(n, i + 1, seq);
		}
}
