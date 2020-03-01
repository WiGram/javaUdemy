package gram.william;

public class WeightedQuickUnionFind {
    private int[] id;
    private int[] sz;

    public WeightedQuickUnionFind(int N) {
        id = new int[N];
        sz = new int[N];

        // set id of each element to itself
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
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

        if (i == j) return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }

        // before id[i] == i as it were the root
        // we are now setting id[i] = j, which is the
        // root of id[j].
        id[i] = j;
    }
}
