List<Integer> ans = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode node = root;
    while(true)
    {
        if(node!=null)
        {
            stack.push(node);
            node = node.left;
        }
        else
        {
            if(stack.isEmpty())
             break;
            node = stack.pop();
            ans.add(node.val);
            node = node.right;
        }
    }
    return ans;
    }
