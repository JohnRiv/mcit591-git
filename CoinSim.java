import java.util.Random;
/**
 * Calculate the probability getting 4 tails tossing coins
 * game ends if getting 2 heads or 4 tails
 * @author Jesus Enrique
 *
 */
public class CoinSim {
	private Random r = new Random();
	public int doExperiment() {
		int heads = 0;
		int tails = 0;
		while ((heads < 2) && (tails < 4)) {
			if (r.nextInt(2) == 1) {
				tails++;
			} else {
				heads++;
			}
		}
		if (tails == 4) return 1;
		return 0;
	}

	public static void main(String[] args) {
		CoinSim c = new CoinSim();
		int tailcount = 0;
		for (int i = 1; i < 30000000; i++) tailcount += c.doExperiment();
		System.out.println("prob end T is = " + (double)tailcount / 30000000);
	}
}
