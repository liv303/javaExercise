package Algorithm.jiho.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 테스트 케이스 1. 정점의 갯수와 간선의 갯수 1줄, 간선이 연결한 정점들(간선 정보) 10줄
8 10
0 1
0 2
0 3
1 3
1 4
2 5
3 4
4 7
5 6
6 7
 */
public class AdjacentMatrix {
    public void solution() throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer란,
        // 입력 받은 문자열을 ' '(또는 지정된 delimeter)를 기준으로 나눠 한 단어씩 반환해주는 도구
        StringTokenizer graphTokenizer  // 8 10
                = new StringTokenizer(reader.readLine());
        // StringTokenizer.nextToken(): 다음 단어를 가져오기
        int maxVertex = Integer.parseInt(graphTokenizer.nextToken());   // 8
        int edges = Integer.parseInt(graphTokenizer.nextToken());   // 10

        // 인접 행렬: 2차원 배열
        // 만약 노드가 1부터 N + 1 까지라면
        // 계산할 때 매번 -1을 해주거나, 인접 행렬을 한 칸 더 늘린다.
        int[][] adjMatrix = new int[maxVertex][maxVertex];  // 0~ 7까지 표현 가능한 인접 행렬
        for (int i = 0; i < edges; i++) {
            // 다음 줄을 단어 단위로 나누는 Tokenizer
            StringTokenizer edgeTokenizer = new StringTokenizer(reader.readLine());
            int startVertex = Integer.parseInt(edgeTokenizer.nextToken());  // 입력 줄을 첫 번째 숫자
            int endVertex = Integer.parseInt(edgeTokenizer.nextToken());    // 입력 줄의 두 번째 숫자

            adjMatrix[startVertex][endVertex] = 1;  // 유향 그래프의 경우 아랫줄은 생략
            adjMatrix[endVertex][startVertex] = 1;  // 무향 그래프의 경우 추가
        }

        for (int[] row: adjMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) throws IOException {
        new AdjacentMatrix().solution();
/* 결과
[0, 1, 1, 1, 0, 0, 0, 0]
[1, 0, 0, 1, 1, 0, 0, 0]
[1, 0, 0, 0, 0, 1, 0, 0]
[1, 1, 0, 0, 1, 0, 0, 0]
[0, 1, 0, 1, 0, 0, 0, 1]
[0, 0, 1, 0, 0, 0, 1, 0]
[0, 0, 0, 0, 0, 1, 0, 1]
[0, 0, 0, 0, 1, 0, 1, 0]
*/
    }
}