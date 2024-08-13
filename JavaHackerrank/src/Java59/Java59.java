package Java59;

import java.awt.*;
import java.util.*;

enum Color{RED,GREEN
        }

abstract class Tree {
    private int value;
    private Color color;
    private int depth;
    Tree(int value, Color color,int depth){
        this.value = value;
        this.color = color;
        this.depth = depth;
    }
    public int getValue(){
        return value;
    }
    public Color getColor(){
        return color;
    }
    public int getDepth(){
        return depth;
    }
    public abstract void accept(TreeVis visitor);

}
class TreeNode extends Tree{
    ArrayList<Tree> children = new ArrayList<>();

    TreeNode(int value,Color color,int depth){
        super(value, color, depth);
    }
    @Override
    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children){
            child.accept(visitor);
        }

    }
    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree{
    TreeLeaf(int value,Color color,int depth){
        super(value, color, depth);
    }

    @Override
    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
  public abstract int getResult();
  public abstract void visitNode(TreeNode node);
  public abstract void visitLeaf(TreeLeaf leaf);


}
class SumInLeavesVisitor extends TreeVis{
    int sumInLeaves = 0;
    @Override
    public int getResult() {
        return sumInLeaves;
    }
    @Override
    public void visitLeaf(TreeLeaf leaf) {
        sumInLeaves += leaf.getValue();
    }

    @Override
    public void visitNode(TreeNode node) {

    }
}
class ProductOfRedNodesVisitor extends TreeVis{
    long productRedNodes = 1L; //Revision
    @Override
    public int getResult() {
        return (int)productRedNodes;
    }
    void multiply(Tree tree){
        if(tree.getColor() == Color.RED){
            productRedNodes =(productRedNodes * tree.getValue()) % (1000000007);
        }
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        multiply(leaf);
    }

    @Override
    public void visitNode(TreeNode node) {
        multiply(node);
    }
}

class FancyVisitor extends TreeVis{
    int sumNonLeafNodesEvenDepth = 0;
    int sumGreenLeafNodes = 0;
    @Override
    public int getResult() {
        return Math.abs(sumGreenLeafNodes - sumNonLeafNodesEvenDepth);
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor() == Color.GREEN)
            sumGreenLeafNodes += leaf.getValue();
    }

    @Override
    public void visitNode(TreeNode node) {
        if(node.getDepth() %2 == 0)
            sumNonLeafNodesEvenDepth += node.getValue();
    }
}
public class Java59 {
    static Map<Integer, Tree> tree = new HashMap<>();

    public static Tree solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Object[]> nodeAttributes = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nodeAttributes.put(i + 1, new Object[]{scanner.nextInt(), null}); // value,Color
        }
        for (int i = 0; i < n; i++) {
            nodeAttributes.get(i + 1)[1] = scanner.nextInt() == 0 ? Color.RED : Color.GREEN; //set the Color
        }
        Map<Integer, ArrayList<Integer>> edges = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            edges.put(i, new ArrayList<Integer>());
        }
        for (int i = 1; i < n; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            edges.get(u).add(v);
            edges.get(v).add(u);
        }
        Tree root = new TreeNode((Integer) nodeAttributes.get(1)[0], (Color) nodeAttributes.get(1)[1], 0);
        tree.put(1, root);

        DFS(n, edges, nodeAttributes);
        return tree.get(1);

    }

    private static void DFS(int n, Map<Integer, ArrayList<Integer>> edges, Map<Integer,Object[]> nodeAttributes) {
        boolean[] visited = new boolean[n + 1];
        TreeNode parent = (TreeNode) tree.get(1);
        DFSUtil(parent, 1, visited, edges, nodeAttributes);
    }

    private static void DFSUtil(TreeNode parent, int v, boolean[] visited, Map<Integer, ArrayList<Integer>> edges, Map<Integer, Object[]> nodeAttributes) {
        visited[v] = true;
        if (edges.get(v).size() == 1 && v != 1) {
            TreeLeaf treeLeaf = new TreeLeaf((Integer) nodeAttributes.get(v)[0], (Color)nodeAttributes.get(v)[1], parent.getDepth() + 1);
            parent.addChild(treeLeaf);
            tree.put(v, treeLeaf);
            return;
        }

        TreeNode treeNode;
        if (v != 1) {
            treeNode = new TreeNode((Integer) nodeAttributes.get(v)[0], (Color) nodeAttributes.get(v)[1], parent.getDepth() + 1);
            parent.addChild(treeNode);
            tree.put(v,treeNode);

        } else
            treeNode = (TreeNode) tree.get(1);

        Iterator<Integer> iterator = edges.get(v).iterator();

        while(iterator.hasNext()) {
            int n = iterator.next();
            if (!visited[n]) {
                DFSUtil(treeNode, n, visited, edges, nodeAttributes);
            }
        }

    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

}

