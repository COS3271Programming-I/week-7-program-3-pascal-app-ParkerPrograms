package Week_7;

public class Pascal_App {

	public static void main(String[] args) {
		int[][] triangle = new int[11][23];
		int[][] triangle_copy = new int[11][23];
		for (int x=0; x<11; x++) {
			for(int y=0; y<23; y++) {
				if (y==11 && x==0) {triangle[x][y]=1;}
				else {triangle[x][y]=0;}
			}
		}
		for (int x=0; x<11; x++) {
			for (int y=0; y<23; y++) {
				if (x==0) {triangle_copy[x][y] = triangle[x][y];}
				else if (y==0 && x>0) {triangle_copy[x][y] = triangle_copy[x-1][y+1];}
				else if (y==22 && x>0) {triangle_copy[x][y] = triangle_copy[x-1][y-1];}
				else {triangle_copy[x][y] = triangle_copy[x-1][y-1] + triangle_copy[x-1][y+1];}
				
			}
			
		}
		
		for (int x=0; x<11; x++) {
			for (int y=0; y<23; y++) {
				if (triangle_copy[x][y] == 0) {System.out.print("   ");}
				else {System.out.format("%3d", triangle_copy[x][y]);}
			}
			System.out.println();
		}
		
	}
}
