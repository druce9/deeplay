import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static int getResult(String line, String character) {
        int[][] disp_matrix = new int[4][4];
        int[][] dist = new int[4][4];
        char[] chars = line.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        if (character.equals("Human")) {
            map.put('S', 5);
            map.put('T', 3);
            map.put('W', 2);
            map.put('P', 1);
        }
        if (character.equals("Swamper")) {
            map.put('S', 2);
            map.put('T', 5);
            map.put('W', 2);
            map.put('P', 2);
        }
        if (character.equals("Woodman")) {
            map.put('S', 3);
            map.put('T', 2);
            map.put('W', 3);
            map.put('P', 2);
        }
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (chars[k] == 'S') {
                    disp_matrix[i][j] = map.get('S');
                }
                if (chars[k] == 'T') {
                    disp_matrix[i][j] = map.get('T');
                }
                if (chars[k] == 'W') {
                    disp_matrix[i][j] = map.get('W');
                }
                if (chars[k] == 'P') {
                    disp_matrix[i][j] = map.get('P');
                }
                k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j == 0) {
                    dist[i][j] = 0;
                } else if (i == 0) {
                    dist[i][j] = dist[i][j - 1] + disp_matrix[i][j];
                } else if (j == 0) {
                    dist[i][j] = dist[i - 1][j] + disp_matrix[i][j];
                } else {
                    dist[i][j] = Math.min(dist[i - 1][j], dist[i][j - 1]) + disp_matrix[i][j];
                }
            }
        }
        return dist[3][3];
    }
}




