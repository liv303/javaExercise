package Algorithm.jiho.Tree;

import com.sun.source.tree.Tree;

public class TreeTraverse {
    private int nodes;
    private int[] arr;  // 이진 트리를 표현하기 위한 배열

    // { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 } 형태로 노드 값을 받을 것임
    public void setArr(int[] arr) {
        this.arr = arr;
        this.nodes = arr.length;
    }

    // 전위 순회(VLR) 하는 함수 preorder()는 V-L-R 순서로 처리한다
    public void traversePreorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            System.out.print(arr[node] + ", ");   // 방문
            this.traversePreorder(node * 2);    // 왼쪽 자식(i * 2)을 루트로 다시 preorder 재귀 호출
            this.traversePreorder(node * 2 + 1);    // 오른쪽 자식(i * 2 + 1)을 루트로 다시 preorder 재귀 호출
        }
    }

    // 중위 순회(LVR)
    public void traverseInorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traverseInorder(node * 2);    // 왼쪽
            System.out.print(arr[node] + ", "); // 나
            this.traverseInorder(node * 2 + 1);    // 오른쪽
        }
    }

    // 후위 순회(LRV)
    public void traversePostorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traversePostorder(node * 2);    // 왼쪽
            this.traversePostorder(node * 2 + 1);    // 오른쪽
            System.out.print(arr[node] + ", "); // 나
        }
    }

    public static void main(String[] args) {
        TreeTraverse tree = new TreeTraverse();
        tree.setArr(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});

        tree.traversePreorder(1);    // 처음 방문점은 root node
        System.out.println();

        tree.traverseInorder(1);
        System.out.println();

        tree.traversePostorder(1);
        System.out.println();
    }
}
