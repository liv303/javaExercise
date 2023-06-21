package Algorithm.jiho.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* 테스트 케이스 1:
7
1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7
 */
public class BreadthFirstSearch {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxNodes = Integer.parseInt(br.readLine());
        // 인접 정보 저장용
        int[][] adjMap = new int[maxNodes + 1][maxNodes + 1];

        String[] edges = br.readLine().split(" ");
        for (int i = 0; i < edges.length / 2; i++) {
            int leftNode = Integer.parseInt(edges[i * 2]); // 0, 2, 4, ...
            int rightNode = Integer.parseInt(edges[i * 2 + 1]); // 1, 3, 5, ...
            adjMap[leftNode][rightNode] = 1;
            adjMap[rightNode][leftNode] = 1;
        }

        // BFS
        // 다음 방문 대상 기록용 Queue 만들기
        Queue<Integer> toVisit = new LinkedList<>();
        // 방문 순서 기록용 List
        List<Integer> visitedOrder = new ArrayList<>();
        // 방문 기록용 boolean[]
        boolean[] visited =new boolean[maxNodes + 1];

        int next = 1;
        toVisit.offer(next);
        // 큐가 비어있지 않은 동안 반복
        while (!toVisit.isEmpty()) {
            // 다음 방문 정점 회수
            next = toVisit.poll();

            // 이미 방문했다면 다음 반복으로
            if (visited[next]) continue;

            // 방문했다 표시
            visited[next] = true;
            // 방문한 순서 기록
            visitedOrder.add(next);

            // 다음 방문 대상을 검색
            for (int i = 0; i < maxNodes + 1; i++) {
                // adjMap[next]가 담고 있는 배열은 idx번째가 1인 경우 idx에 연결되어 있다는 의미
                if (adjMap[next][i] == 1 && !visited[i]) toVisit.offer(i);
            }
        }

        // 출력하기
        System.out.println(visitedOrder);
    }
    public static void main(String[] args) throws IOException {
        new BreadthFirstSearch().solution();

    }
}
