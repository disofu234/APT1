public class CirclesCountry {
	public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
		int crosses = 0;
		
		for (int i = 0; i < x.length; i++) {
			boolean firstPtInside = isInside(x1, y1, x[i], y[i], r[i]);
			boolean secondPtInside = isInside(x2, y2, x[i], y[i], r[i]);
			if(firstPtInside && !secondPtInside) {
				crosses++;
			} else if (!firstPtInside && secondPtInside) {
				crosses++;
			}
		}
		
		return crosses;
	}
	
	public boolean isInside(int x, int y, int cx, int cy, int r) {
		int dist = (x - cx) * (x - cx) + (y - cy) * (y - cy);
		return dist < r * r;
	}
}
