//First level:
// Given a binary search tree.
// Implement a method to search for an element in it.
// Value is passed as a parameter to this method.
// The method should return true/false if value is present in the tree.
// The second option is that the method should return a pointer to the found element, or null if value is not present in the tree.
// You can implement one of the proposed options.
//

import Tree from "./binary_tree.js";

let binaryTree = new Tree();

[6, 4, 8, 3, 5, 7, 9].forEach((e) => binaryTree.add(e));

console.log(binaryTree.find(3));
console.log(binaryTree.find(10));
console.log(binaryTree.find(2));
console.log(binaryTree.find(8));