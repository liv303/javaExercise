package Algorithm.jiho.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AdjacentList {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer: 입력받은 문자열을 ' ' (또는 지정된 delimiter) 를 기준으로 나누어서
        // 한 단어씩 반환해주는 도구
        StringTokenizer graphTokenizer  // 8 10
                = new StringTokenizer(reader.readLine());
        // StringTokenizer.nextToken(): 다음 단어를 가져오기
        int maxVertex = Integer.parseInt(graphTokenizer.nextToken());  // 8
        int edges = Integer.parseInt(graphTokenizer.nextToken());     // 10

        // 안쪽의 List<Integer>가 maxVertex의 길이를 반드시 가지지는 않을 것이다.
        List<List<Integer>> adjList = new ArrayList<>();
        // 먼저 리스트의 내용물을 초기화 해준다.
        for (int i = 0; i < maxVertex; i++) {
            adjList.add(new ArrayList<>());
        }

        // 간선의 갯수만큼 반복해서 입력을 받는다.
        for (int i = 0; i < edges; i++) {
            // 다음줄을 단어 단위로 나눠주는 Tokenizer
            StringTokenizer edgeTokenizer = new StringTokenizer(reader.readLine());
            // 입력 줄의 첫 숫자
            int startVertex = Integer.parseInt(edgeTokenizer.nextToken());
            // 입력 줄의 두번째 숫자
            int endVertex = Integer.parseInt(edgeTokenizer.nextToken());
            // adjList의 starVertex번째 리스트에 endVertex를 첨부한다.
            adjList.get(startVertex).add(endVertex);    // 유향 그래프일 경우 아랫줄의 코드 생략
            adjList.get(endVertex).add(startVertex);    // 무향 그래프일 경우 추가할 코드
        }
        // 선택 사항: DFS나 BFS를 할 때
        // 방문순서를 '작은 숫자부터'와 같은 조건을 붙이고 싶다면 정렬
        for (List<Integer> adjRow: adjList) {
            // 정렬해주는 Collections.sort 메서드
            Collections.sort(adjRow);
        }

        for (List<Integer> adjRow: adjList) {
            System.out.println(adjRow);
        }
    }

    public static void main(String[] args) throws IOException {
        new AdjacentList().solution();
    }
}