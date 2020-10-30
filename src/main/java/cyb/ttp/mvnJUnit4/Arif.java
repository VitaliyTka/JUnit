package cyb.ttp.mvnJUnit4;

public class Arif {
	int a;
	int b;
	int c;
	int degree;
	
	public Arif(int a, int b, int c, int degree) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.degree = degree;
	}
	public Arif() {
		a = 1;
		b = 1;
		c = 1;
		degree = 2;
	}
	public boolean AMoreB() {
		return a > b;
	}
	public boolean ALessB() {
		return a < b;
	}
	public int AddAB() {
		return a + b;
	}
	public int SubAB() {
		return a - b;
	}
//	public int DivAB() {
//		if(b == 0) {
//			return -1;
//		}
//		return a / b;
//	}
//	public int MulAB() {
//		return a * b;
//	}
	public int SumWithParam(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}
    public int Pow()
    {
    	int rez = 1;
        for (int i = 0; i < degree; i++)
        {
            rez *= a;
        }
        return rez;
    }
    public int Sqrt()
    {
    	if(a <= 0) {
    		return -1;
    	}
        int x;
        int t = a / 2;
        do
        {
            x = t;
            t = (x + a / x) / 2;
        } while (x - t > 1 || x - t < -1);
        return t;
    }
}
