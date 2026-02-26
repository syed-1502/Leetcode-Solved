/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     struct Node *left;
 *     struct Node *right;
 *     struct Node *next;
 * };
 */

struct Node* connect(struct Node* root) 
{
	if (!root) return NULL;
       struct Node* leftMost = root;

        while (leftMost->left) {
            struct Node* currNode = leftMost;

            while (currNode) {
                currNode->left->next = currNode->right;
                if (currNode->next) {
                    currNode->right->next = currNode->next->left;
                }
                currNode = currNode->next;
            }

            leftMost = leftMost->left;
        }

        return root;
    }