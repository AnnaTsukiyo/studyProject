class TreeNode {
    value;
    leftChild;
    rightChild;
}

class BinaryTree {
    root = null;

    find(temp) {
        let root1 = this.root;
        while (root1) {
            if (temp === root1.value) {
                return root1;
            } else if (temp < root1.value) {
                if (root1.leftChild != null) {
                    root1 = root1.leftChild;
                } else {
                    return null;
                }
            } else {
                if (root1.rightChild != null) {
                    root1 = root1.rightChild;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    add(temp) {
        if (this.root == null) {
            this.root = new TreeNode();
            this.root.value = temp;
            return;
        }
        let root2 = this.root;
        while (true) {
            if (temp < root2.value) {
                if (root2.leftChild != null) {
                    root2 = root2.leftChild;
                } else {
                    root2.leftChild = new TreeNode();
                    root2.leftChild.value = temp;
                    return;
                }
            } else {
                if (root2.rightChild != null) {
                    root2 = root2.rightChild;
                } else {
                    root2.rightChild = new TreeNode();
                    root2.rightChild.value = temp;
                    return;
                }
            }
        }
    }
}

export default BinaryTree;