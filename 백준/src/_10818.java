import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		/*
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] > max) max = arr[i];
			else if (arr[i] < min) min = arr[i];
		}
		
		bw.write(min + " " + max);
		*/
		Arrays.sort(arr);
		bw.write(arr[0] + " " + arr[arr.length - 1]);
		bw.flush();
		bw.close();
	}

}
