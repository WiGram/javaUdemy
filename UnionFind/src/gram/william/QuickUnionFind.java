package gram.william;

public class QuickUnionFind {
    private int[] id;

    public QuickUnionFind(int N) {
        id = new int[N];

        // set id of each element to itself
        for (int i = 0; i < N; i++) id[i] = i;
    }

    // chase tree up to its root
    private int root(int i) {
        // i != id[i] means we are not at root
        // setting i = id[i] means we are stepping one step
        // closer to the root. Eventually, i will be id[i] (the root)
        while (i != id[i]) i = id[i];
        return i;  // the root
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        // before id[i] == i as it were the root
        // we are now setting id[i] = j, which is the
        // root of id[j].
        id[i] = j;
    }
}
